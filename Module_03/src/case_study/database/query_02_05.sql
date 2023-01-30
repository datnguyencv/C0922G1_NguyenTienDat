USE
furama_resort;

-- 2.  Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các
--  ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.

SELECT *
FROM employee
WHERE ( SELECT substring_index(name, ' ', -1) REGEXP '^[H,Y,K]' )
    AND  LENGTH(name) <= 15;

-- 3.  Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà 
-- Nẵng” hoặc “Quảng Trị”.

SELECT *
FROM customer
WHERE  ((YEAR(curdate()) - YEAR (day_of_birth)) BETWEEN 18 AND 50)
AND address LIKE '%Đà Nẵng'
   OR address LIKE '%Quảng Trị';

-- 4.  Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được 
-- sắp xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại 
-- khách hàng là “Diamond”.

SELECT customer.id,
       customer.name,
       COUNT(contract.id) AS so_lan_dat_phong
FROM contract 
         JOIN customer ON customer.id = contract.customer_id
         JOIN customer_type ON customer_type.id = customer_type_id
WHERE customer_type.name = 'Diamond'
GROUP BY customer.id
ORDER BY so_lan_dat_phong;

-- 5.  Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong,
--  ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien 
--  (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá,
--  với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet)
--  cho tất cả các khách hàng đã từng đặt phòng.
--  (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
set sql_mode=(select replace(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
SELECT customer.id,
       customer.name,
       customer_type.name,
       contract.id,
       facility.name,
       contract.start_date,
       contract.end_date,
               IFNULL(facility.cost, 0) +
               SUM(IFNULL(contract_detail.quantity, 0) * IFNULL(attach_facility.cost, 0))
           AS "Total_money"
FROM customer
        LEFT JOIN customer_type ON customer.customer_type_id = customer_type.id
		LEFT JOIN contract ON customer.id = contract.customer_id
		LEFT JOIN facility ON contract.facility_id = facility_id
		LEFT JOIN contract_detail ON contract_detail.id = contract.id
		LEFT JOIN attach_facility ON contract_detail.attach_facility_id = attach_facility_id
GROUP BY contract.id, customer.id;