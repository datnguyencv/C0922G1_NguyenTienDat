use furama_resort;

-- 11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có 
-- ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.

select attach_facility.id, attach_facility.name from attach_facility
join contract_detail ctd on attach_facility.id = ctd.attach_facility_id
join contract ct on ct.id = ctd.contract_id
join customer c on c.id = ct.customer_id
join customer_type ctype on ctype.id = c.customer_type_id
where ctype.name = 'Diamond'
and c.address like '%Vinh' or c.address like '%Quảng Ngãi';

-- 12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), 
-- so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem 
-- (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), 
-- tien_dat_coc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng 
-- cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.

select 	ct.id,
		e.name ,
        c.name,
        c.phone_number,
        f.name,
        ifnull(sum(ctd.quantity), 0) as number_facility,
        ct.deposit
from contract ct
		join customer c on ct.customer_id = c.id
        join employee e on e.id = ct.employee_id
        join facility f on f.id = ct.facility_id
        left join contract_detail ctd on ctd.contract_id = ct.id
where ct.id in (select ct.id from ct where quarter(ct.start_date) = 4 and year ct year(ct.start_date) = 2020)
and ct.id not in (select ct.id where quarter(ct.start_date) in (1,2) and year (ct.start_date) = 2021)	
group by ct.id;
-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng 
-- đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung 
-- (được tính dựa trên việc count các ma_dich_vu_di_kem).

-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, 
-- ten_bo_phan, so_dien_thoai, dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.