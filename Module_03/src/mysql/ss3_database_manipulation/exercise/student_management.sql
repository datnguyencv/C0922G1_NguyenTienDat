CREATE DATABASE quan_ly_sinh_vien;

USE quan_ly_sinh_vien;

CREATE TABLE class (
    class_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    class_name VARCHAR(20),
    stardate DATE,
    `status` BIT
);

CREATE TABLE student (
    student_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    student_name VARCHAR(45),
    address VARCHAR(45),
    phone VARCHAR(45),
    `status` BIT,
    class_id INT,
    FOREIGN KEY (class_id)
        REFERENCES class (class_id)
);

CREATE TABLE subjects (
    sub_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    sub_name VARCHAR(20),
    credit INT,
    `status` BIT
);

CREATE TABLE mark (
    mark_id INT AUTO_INCREMENT PRIMARY KEY,
    sub_id INT,
    student_id INT,
    mark INT,
    exam_times TIME,
    FOREIGN KEY (sub_id)
        REFERENCES subjects (sub_id),
    FOREIGN KEY (student_id)
        REFERENCES student (student_id)
);

insert into class(class_id, class_name,stardate,`status`)
values (1, 'A1', '2008-12-20', 1),
(2, 'A2', '2008-12-22', 1),
(3, 'B3', current_date, 0);

insert into student (student_name, address, phone, `status`, class_id)
values('Hung', 'Ha Noi', '0912113113', 1, 1),
('Hoa', 'Hai phong',null, 1, 1),
('Manh', 'HCM', '0123123123', 0, 2);

insert into subjects(sub_id, sub_name,credit, `status`)
values(1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
insert into mark(sub_id, student_id, mark,exam_times)
values (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);
       
-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’.
SELECT * FROM student
WHERE student_name LIKE 'h%';

-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12. 
SELECT * FROM class WHERE stardate LIKE '%12%';

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
SELECT * FROM subjects
WHERE credit BETWEEN 3 AND 5;

-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
set SQL_SAFE_UPDATES = 0;
UPDATE student 
SET class_id = 2
WHERE student_name = 'hung';

-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. 
-- nếu trùng sắp theo tên tăng dần.studentstudent
SELECT student.student_name, subjects.sub_name, mark.mark
FROM student
        JOIN mark ON mark.student_id = student.student_id
        JOIN subjects ON mark.sub_id = subjects.sub_id
        ORDER BY mark.mark DESC;
        