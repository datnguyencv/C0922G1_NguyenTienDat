create database quan_ly_ban_hang_ss2;

use quan_ly_ban_hang_ss2;

CREATE TABLE custormer (
    custormer_id INT PRIMARY KEY,
    custormer_name VARCHAR(50),
    custormer_age int
);

CREATE TABLE `order` (
    order_id INT PRIMARY KEY,
    custormer_id INT,
    order_date DATETIME,
    order_total_price INT,
    FOREIGN KEY (custormer_id)
	REFERENCES custormer (custormer_id)
);
    
CREATE TABLE product (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(50),
    product_price INT
);
    
CREATE TABLE order_detail (
    order_id INT,
    product_id INT,
    od_qty VARCHAR(50),
    PRIMARY KEY (order_id , product_id),
    FOREIGN KEY (order_id)
	REFERENCES `order` (order_id),
    FOREIGN KEY (product_id)
	REFERENCES product (product_id)
);