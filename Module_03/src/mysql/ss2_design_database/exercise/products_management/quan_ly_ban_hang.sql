create database quan_ly_ban_hang_ss2;

use quan_ly_ban_hang_ss2;

CREATE TABLE custormer (
    c_id INT PRIMARY KEY,
    c_name VARCHAR(50),
    c_age VARCHAR(50)
);

CREATE TABLE `order` (
    o_id INT PRIMARY KEY,
    c_id INT,
    o_date DATETIME,
    o_total_price INT,
    FOREIGN KEY (c_id)
	REFERENCES custormer (c_id)
);
    
CREATE TABLE product (
    p_id INT PRIMARY KEY,
    p_name VARCHAR(50),
    p_price INT
);
    
CREATE TABLE order_detail (
    o_id INT,
    p_id INT,
    od_qty VARCHAR(50),
    PRIMARY KEY (o_id , p_id),
    FOREIGN KEY (o_id)
	REFERENCES `order` (o_id),
    FOREIGN KEY (p_id)
	REFERENCES product (p_id)
);