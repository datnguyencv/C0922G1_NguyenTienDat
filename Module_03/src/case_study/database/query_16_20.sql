use furama_resort;
-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.

-- Tắt chế độ an toàn để xoá
SET SQL_SAFE_UPDATES = 0;
DELETE FROM employee e
WHERE e.id NOT IN (SELECT id FROM contract WHERE YEAR(start_date) BETWEEN 2019 and 2021);

select * from employee;
-- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond,
-- chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021
-- là lớn hơn 10.000.000 VNĐ.

UPDATE customer cc
SET cc.id = 1
WHERE cc.id IN(SELECT * FROM (
	SELECT c.id FROM customer c
		JOIN contract ct ON c.id = ct.customer_id
        JOIN facility f ON f.id = ct.facility_id
        JOIN contract_detail ctd ON ctd.contract_id = ct.id
        JOIN attach_facility atf ON ctd.attach_facility_id = atf.id
        WHERE year(ct.start_date) = 2021 AND c.customer_type_id = 2
        GROUP BY ct.customer_id
        HAVING SUM(f.cost + ctd.quantity * atf.cost) > 10000000) AS custormer_demo);
        
-- Tắt ràng buộc khoá ngoại
SET FOREIGN_KEY_CHECKS = 0;

-- 18.	Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).

SELECT * FROM customer;
DELETE FROM customer c
WHERE c.id IN (SELECT ct.customer_id FROM contract ct
		WHERE year(start_date) < 2021 );

-- Tắt ràng buộc khoá ngoại
SET FOREIGN_KEY_CHECKS = 0;

-- 19.	Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.

UPDATE attach_facility atf
SET cost = cost * 2
WHERE atf.id IN (SELECT ctd.attach_facility_id
		FROM contract_detail ctd 
        JOIN contract ct ON ctd.contract_id = ct.id
        WHERE year(ct.start_date) = 2020 
        GROUP BY ctd.attach_facility_id
        HAVING SUM(ctd.quantity >= 10));
        
-- 20.	Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, 
-- thông tin hiển thị bao gồm id (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.

SELECT 	e.id AS id,
		e.name, 
        e.email,
        e.phone_number, 
        e.day_of_birth, 
        e.address
FROM employee e
UNION ALL
SELECT	c.id,
		c.name,
        c.email,
        c.phone_number,
        c.day_of_birth,
        c.address
FROM customer c
-- Bật chế độ an toàn để tránh mất dữ liệu.
SET SQL_SAFE_UPDATES = 1;