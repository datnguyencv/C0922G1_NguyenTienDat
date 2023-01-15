create database student_management;

use student_management;

CREATE TABLE class (
    class_id INT AUTO_INCREMENT PRIMARY KEY,
    class_name VARCHAR(60) NOT NULL,
    start_date DATETIME NOT NULL,
    status BIT
);

CREATE TABLE student (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    student_name VARCHAR(30) NOT NULL,
    address VARCHAR(50),
    phone VARCHAR(20),
    status BIT,
    class_id INT NOT NULL,
    FOREIGN KEY (class_id)
	REFERENCES class (class_id)
);

create table subject
(
    sub_id   int auto_increment primary key,
    sub_name varchar(30) not null,
    credit   tinyint     not null default 1 check (credit >= 1),
    status   bit                  default (1)
);

CREATE TABLE mark (
    mark_id INT AUTO_INCREMENT PRIMARY KEY,
    sub_id INT NOT NULL,
    student_id INT NOT NULL,
    mark FLOAT DEFAULT 0 CHECK (mark BETWEEN 0 AND 100),
    exam_times TINYINT DEFAULT 1,
    UNIQUE (sub_id , student_id),
    FOREIGN KEY (sub_id)
	REFERENCES subject (sub_id),
    FOREIGN KEY (student_id)
	REFERENCES student (student_id)
);