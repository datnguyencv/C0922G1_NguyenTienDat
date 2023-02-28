CREATE DATABASE apple_store;

USE apple_store;

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

CREATE TABLE member_card
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    id_member_type INT,
    FOREIGN KEY (id_member_type) REFERENCES member_type(id)
);

CREATE TABLE member_type
(
    id INT PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE promotions
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    description VARCHAR(200),
    id_date INT,
    FOREIGN KEY (id_date) REFERENCES effective_date(id)
);

CREATE TABLE effective_date
(
    id INT PRIMARY KEY,
    start_date VARCHAR(50),
    end_date VARCHAR(50)
);