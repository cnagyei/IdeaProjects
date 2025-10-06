CREATE TABLE census (
    id INTEGER,
    name VARCHAR(20),
    birth_place_latitude REAL,
    year_income DECIMAL(20, 2),
    is_parent BOOLEAN
);

SELECT
    CAST(1 AS DECIMAL(20, 3));

SELECT 'Hello, World!';

CREATE DATABASE students;

CREATE TABLE students_info (
    student_id INT,
    name VARCHAR(30),
    surname VARCHAR(30),
    age INT
);

DROP DATABASE students;

DROP TABLE students_info;

-- Aliases
/* Aliases */

SELECT
    'Alice' AS name,
    170 AS height_in_centimeters,
    170 * 0.393701 AS "height in inches"
;