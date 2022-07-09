# springsecurityfinal

CREATE DATABASE studentmanagement

USE studentmanagement

SHOW TABLES


SELECT * FROM hibernate_sequence;

SELECT * FROM roles

INSERT INTO roles VALUES(1, 'ADMIN');
INSERT INTO roles VALUES(2, 'USER');



SELECT * FROM student

SELECT * FROM users

INSERT INTO users VALUES(1, '$2a$12$2d1hIQpz25UZucmzvYE3Duy0rjnhqZ16fl8VFb09f5tXBoMYLiJxy', 'ADITI');
INSERT INTO users VALUES(2, '$2a$12$2d1hIQpz25UZucmzvYE3Duy0rjnhqZ16fl8VFb09f5tXBoMYLiJxy', 'AKSHAY');

SELECT * FROM users_roles

INSERT INTO users_roles VALUES(1, 1);
INSERT INTO users_roles VALUES(2, 2);