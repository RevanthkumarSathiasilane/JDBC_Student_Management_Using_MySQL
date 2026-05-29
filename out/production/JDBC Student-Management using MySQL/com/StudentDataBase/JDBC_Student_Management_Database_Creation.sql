CREATE DATABASE studentdb;
USE studentdb;
CREATE TABLE students(
id INT NOT NULL,
name VARCHAR(50) NOT NULL,
age INT NOT NULL,
mark DECIMAL NOT NULL,
CONSTRAINT pk_students PRIMARY KEY(id)
);
SELECT * FROM students;


