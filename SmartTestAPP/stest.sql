# To run it:
# mysql -u root -p < stest.sql
# enter pwd: goodyear123!@#

DROP DATABASE IF EXISTS stest_db;
CREATE DATABASE stest_db;
USE stest_db;
CREATE TABLE tbl_users(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(255),
        val TEXT
);
INSERT INTO tbl_users (name, val) VALUES ("drEvil@hofstra.edu","rO0ABXNyABtzbWFydHRlc3RhcHAubW9kZWwudXNlckluZm%2FBYPYkiDHW7QIABEwABWZuYW1ldAASTGphdmEvbGFuZy9TdHJpbmc7TAAIcGFzc3dvcmRxAH4AAUwABHJvbGVxAH4AAUwACHVzZXJuYW1lcQB%2BAAF4cHQAB0RyIEV2aWx0AAhnb29keWVhcnQABUFkbWludAASZHJFdmlsQGhvZnN0cmEuZWR1");
CREATE TABLE tbl_test(
	pinID INT PRIMARY KEY,
	testname VARCHAR(255) UNIQUE,
	teachername VARCHAR(255),
	testval TEXT 
);
INSERT INTO tbl_test (pinID,testname, teachername, testval) VALUES ("100","Java", "Jane Doe", "INVALIDTESTVAL");
CREATE TABLE loutcome (
        id INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(255),
        lval TEXT
);
CREATE TABLE tbl_results(
	id INT AUTO_INCREMENT PRIMARY KEY,
	pinID INT,
	studentID INT,
	resval TEXT 
);
INSERT INTO tbl_results (pinID, studentID,resval) VALUES ("23034", "701942994", "INVALIDRESVAL");



