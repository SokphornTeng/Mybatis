CREATE TABLE Employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fullName VARCHAR(50) UNIQUE NOT NULL,
    age INT NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

--CREATE TABLE Employee (
--    id SERIAL PRIMARY KEY,
--    fullName VARCHAR(50) UNIQUE NOT NULL,
--    age INT NOT NULL,
--    email VARCHAR(100) UNIQUE NOT NULL
--);

CREATE TABLE Department (
    id INT AUTO_INCREMENT PRIMARY KEY,
    employee_id INT NOT NULL,
    deptName VARCHAR(50) UNIQUE NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE Salary (
    id INT AUTO_INCREMENT PRIMARY KEY,
    employee_id INT NOT NULL,
    amount DOUBLE NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE Address (
    id INT AUTO_INCREMENT PRIMARY KEY,
    employee_id INT NOT NULL,
    streetName VARCHAR(50) UNIQUE NOT NULL,
    streetNumber INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);