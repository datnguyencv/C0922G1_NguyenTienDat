create database students_management;

use students_management;

CREATE TABLE class (
    id INT,
    name VARCHAR(45)
);

CREATE TABLE teacher (
    id INT,
    name VARCHAR(45),
    age INT,
    country VARCHAR(45)
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
        
SELECT * FROM class;

SELECT * FROM teacher;