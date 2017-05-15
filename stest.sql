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
INSERT INTO tbl_users (name, val) VALUES ("users", "INVALIDVAL");
CREATE TABLE people(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(255),
	val TEXT 
);
CREATE TABLE tbl_test(
	pinID INT PRIMARY KEY,
	testname VARCHAR(255) UNIQUE,
	teachername VARCHAR(255),
	testval TEXT 
);
INSERT INTO tbl_test (pinID,testname, teachername, testval) VALUES ("100","Java", "Jane Doe", "INVALIDTESTVAL");
CREATE TABLE tbl_results(
	id INT AUTO_INCREMENT PRIMARY KEY,
	pinID INT,
	studentID INT,
	resval TEXT 
);
INSERT INTO tbl_results (pinID, studentID,resval) VALUES ("23034", "701942994", "INVALIDRESVAL");



