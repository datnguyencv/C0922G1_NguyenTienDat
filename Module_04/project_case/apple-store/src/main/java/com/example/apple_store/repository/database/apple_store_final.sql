CREATE DATABASE apple_store_final;

USE apple_store_final;

CREATE TABLE apple_phone
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    data_size VARCHAR(10),
    img VARCHAR(250),
    id_made_in INT,
    FOREIGN KEY (id_made_in) REFERENCES made_in(id)
);

CREATE TABLE made_in
(
    id INT primary key,
    name VARCHAR(50)
);

CREATE TABLE customer
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    date_of_birth VARCHAR(50),
    img VARCHAR(250),
    id_customer_type INT,
    FOREIGN KEY (id_customer_type) REFERENCES customer_type(id)
);

CREATE TABLE customer_type
(
    id INT PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE employee
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    date_of_birth VARCHAR(50),
    img VARCHAR(250),
    id_account INT,
    FOREIGN KEY (id_account) REFERENCES account(id)
);

CREATE TABLE account
(
    id INT PRIMARY KEY,
    email VARCHAR(50),
    password VARCHAR(50)
);

CREATE TABLE bill
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    date varchar(30),
    description VARCHAR(200),
    id_bill_type INT,
    FOREIGN KEY (id_bill_type) REFERENCES bill_type(id)
);

CREATE TABLE bill_type
(
    id INT PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE bill_detail
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_employee INT,
    id_customer INT,
    id_bill INT UNIQUE,
    id_apple Int,
    FOREIGN KEY (id_employee) REFERENCES employee(id),
    FOREIGN KEY (id_customer) REFERENCES customer(id),
    FOREIGN KEY (id_bill) REFERENCES bill(id),
    FOREIGN KEY (id_apple) REFERENCES apple_phone(id)
)