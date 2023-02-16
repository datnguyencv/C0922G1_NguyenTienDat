CREATE DATABASE idol_manager;
USE idol_manager;

CREATE TABLE idol
(
    id              INT AUTO_INCREMENT PRIMARY KEY,
    name            VARCHAR(50),
    gender          VARCHAR(10),
    date_of_birth   VARCHAR(15),
    country         VARCHAR(50),
    popular         VARCHAR(50),
    skill           VARCHAR(50)
);

CREATE TABLE customer
(
    id            INT AUTO_INCREMENT PRIMARY KEY,
    customer_type_id INT,
    name          VARCHAR(50),
    date_of_birth VARCHAR(50),
    gender        VARCHAR(10),
    email         VARCHAR(50),
    password      VARCHAR(30),
    FOREIGN KEY (customer_type_id) REFERENCES customer_type(id)
);

CREATE TABLE customer_type
(
    id INT PRIMARY KEY,
    type_name VARCHAR(15)
);

CREATE TABLE favourite
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(50),
    number_of_likes INT,
    idol_id     INT,
    customer_id INT,
    FOREIGN KEY (idol_id) REFERENCES idol (id),
    FOREIGN KEY (customer_id) REFERENCES customer (id)
)