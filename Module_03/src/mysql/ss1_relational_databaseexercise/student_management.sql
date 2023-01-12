create database students_management;

use students_management;

create table class
(
	id int,
    name varchar(45)
);

create table teacher
(
	id	int,
    name varchar(45),
    age int,
    country	varchar(45)
);

insert into class(id, name)
values 	(1, 'Tien Dat'),
		(2, 'Quang Vinh'),
        (3, 'Dieu Quynh'),
        (4, 'Minh Thong'),
        (5, 'Anh Quan');
        
insert into teacher(id, name, age, country)
values	(1, 'Quang Nguyen', 24, 'Da Nang'),
		(2, 'Chanh Tran', 36, 'Da Nang'),
        (3, 'Hai Truong', 24, 'Da Nang'),
        (4, 'Cong Nguyen', 31, 'Da Nang'),
        (5, 'Son Nguyen', 27, 'Da Nang'),
        (6, 'Trung Dang', 33, 'Da Nang');
        
select * from class;

select * from teacher;