use furama_resort;

-- 11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có 
-- ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.

SELECT 	attach_facility.id,
		attach_facility.name
FROM attach_facility
        JOIN contract_detail ctd ON attach_facility.id = ctd.attach_facility_id
        JOIN contract ct ON ct.id = ctd.contract_id
        JOIN customer c ON c.id = ct.customer_id
        JOIN customer_type ctype ON ctype.id = c.customer_type_id
WHERE 	ctype.name = 'Diamond'
        AND c.address LIKE '%Vinh'
        OR c.address LIKE '%Quảng Ngãi';

-- 12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), 
-- so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem 
-- (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), 
-- tien_dat_coc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng 
-- cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.

SELECT 	ct.id,
		e.name ,
        c.name,
        c.phone_number,
        f.name,
        ifnull(sum(ctd.quantity), 0) as number_facility,
        ct.deposit
FROM contract ct
		JOIN customer c ON ct.customer_id = c.id
        JOIN employee e ON e.id = ct.employee_id
        JOIN facility f ON f.id = ct.facility_id
        LEFT JOIN contract_detail ctd ON ctd.contract_id = ct.id
WHERE ct.id IN (SELECT ct.id FROM contract ct WHERE QUARTER(ct.start_date) = 4 AND YEAR(ct.start_date) = 2020)
AND ct.id NOT IN (SELECT ct.id WHERE QUARTER(ct.start_date) in (1,2) AND YEAR(ct.start_date) = 2021)	
GROUP BY ct.id;

-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng 
-- đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

SELECT 	atf.id, 
		atf.name, 
		sum(ifnull(ctd.quantity, 0))
		AS quantity_facility
FROM attach_facility atf
JOIN contract_detail ctd ON atf.id = ctd.attach_facility_id
GROUP BY ctd.attach_facility_id
HAVING sum((ifnull(ctd.quantity, 0))) = (select MAX(quantity_facility) from contract_detail);

-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung 
-- (được tính dựa trên việc count các ma_dich_vu_di_kem).

set sql_mode=(select replace(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
SELECT 
    ct.id,
    ft.name,
    atf.name,
    COUNT(IFNULL(ctd.quantity, 0)) AS number_use
FROM facility_type ft
        JOIN facility f ON ft.id = f.facility_type_id
        JOIN contract ct ON f.id = ct.facility_id
        JOIN contract_detail ctd ON ct.id = ctd.contract_id
        JOIN attach_facility atf ON ctd.attach_facility_id = atf.id
GROUP BY ctd.attach_facility_id, atf.name
HAVING COUNT(IFNULL(ctd.quantity, 0)) = 1
ORDER BY ct.id;

-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, 
-- ten_bo_phan, so_dien_thoai, dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.

SELECT 	e.id, 
		e.name, 
		divs.name, 
        po.name, 
        e.phone_number, 
        e.address
FROM employee e
        JOIN division divs ON divs.id = e.division_id
        JOIN position po ON po.id = e.position_id
        JOIN contract ct ON ct.employee_id = e.id
WHERE YEAR(ct.start_date) = 2020
        OR YEAR(ct.start_date) = 2021
GROUP BY e.id
HAVING COUNT(ct.id) <= 3
ORDER BY e.id