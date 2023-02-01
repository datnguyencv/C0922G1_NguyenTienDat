USE furama_resort;

-- 6.  Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue,
--  ten_loai_dich_vu của tất cả các loại dịch vụ chưa từng được khách hàng 
--  thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).

SELECT 
    facility.id,
    facility.name,
    facility.area,
    facility.cost,
    facility_type.name
FROM facility RIGHT JOIN
    facility_type ON facility.facility_type_id = facility_type.id
        JOIN contract ON facility.id = contract.facility_id
WHERE facility.id NOT IN (
SELECT contract.facility_id
        FROM contract WHERE
            (YEAR(contract.start_date) = 2021)
                AND QUARTER(contract.start_date) = 1)
GROUP BY facility.id;

-- 7.  Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da,
--  chi_phi_thue, ten_loai_dich_vu của tất cả các loại dịch vụ đã từng được khách hàng
--  đặt phòng trong năm 2020 nhưng chưa từng được khách hàng đặt phòng trong năm 2021.

SELECT 
    facility.id,
    facility.name,
    facility.area,
    facility.cost,
    facility_type.name,
    facility.max_people
FROM facility_type
        JOIN facility ON facility_type_id = facility.id
        JOIN contract ON facility.id = contract.facility_id
WHERE facility.id NOT IN (
SELECT contract.facility_id
        FROM contract
        WHERE (YEAR(contract.start_date) = 2021))
GROUP BY facility.id;

-- 8.  Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên.

SELECT name
FROM customer
GROUP BY name;

-- cách 2

SELECT DISTINCT
    name
FROM
    customer;

-- cách 3

SELECT name
FROM customer 
UNION SELECT name
FROM customer;

-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2021 
-- thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng

SELECT 
    MONTH(contract.start_date) AS month,
    COUNT(contract.id) AS number_of_customers
FROM contract
WHERE YEAR(contract.start_date) = 2021
GROUP BY month
ORDER BY month;

-- 10.	Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, 
-- so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem). 

SELECT 
    contract.id,
    contract.start_date,
    contract.end_date,
    contract.deposit,
    SUM(IFNULL(contract_detail.quantity, 0)) AS facility_quantity
FROM contract
        LEFT JOIN contract_detail ON contract.id = contract_detail.contract_id
GROUP BY contract.id;
