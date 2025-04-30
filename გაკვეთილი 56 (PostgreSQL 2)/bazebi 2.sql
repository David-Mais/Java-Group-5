CREATE TABLE students(
	id INTEGER,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	dob DATE
);


SELECT * FROM students;

SELECT * 
FROM students
WHERE first_name = 'Nino';

UPDATE students
SET first_name = 'Nino'
WHERE first_name = 'Henrietta';


DELETE FROM students
WHERE first_name = 'Nino';


/* UNIQUE */
CREATE TABLE courses (
	id INTEGER,
	course_name VARCHAR(75) UNIQUE,
	price DECIMAL(6, 2)
);

INSERT INTO courses VALUES (1, 'Java 1', 1111.89);
INSERT INTO courses VALUES (2, 'Java 2', 4599.11);
INSERT INTO courses VALUES (2, 'Python 1', 2289.11);

SELECT * FROM courses;

UPDATE courses
SET course_name = 'Java 1'
WHERE id = 2;

DELETE FROM courses WHERE course_name = 'Python 1';

ALTER TABLE courses
ADD CONSTRAINT unique_course_ids UNIQUE(id);


/* NOT NULL */
DROP TABLE courses;
CREATE TABLE courses (
	id INTEGER,
	course_name VARCHAR(75) UNIQUE,
	price DECIMAL(6, 2) NOT NULL
);

ALTER TABLE courses
ALTER COLUMN price SET NOT NULL;

INSERT INTO courses (id, course_name)
VALUES (1, 'Java 1');


/* CHECK */
DROP TABLE courses;
CREATE TABLE courses (
	id INTEGER,
	course_name VARCHAR(75) UNIQUE,
	price DECIMAL(6, 2) NOT NULL,
	CONSTRAINT chk_price CHECK(price >= 1000)
);

INSERT INTO courses
VALUES (1, 'Java 1', 800);

ALTER TABLE courses
DROP CONSTRAINT chk_price;

ALTER TABLE courses
ADD CONSTRAINT chk_price CHECK(price >= 1000);

SELECT * FROM courses;


/* DEFAULT */
DROP TABLE courses;
CREATE TABLE courses (
	id INTEGER,
	course_name VARCHAR(75) UNIQUE,
	price DECIMAL(6, 2) NOT NULL DEFAULT 1000.99
);

INSERT INTO courses
VALUES (1, 'Java 1', 800);

INSERT INTO courses (id, course_name)
VALUES (2, 'Java 2');

SELECT * FROM courses;


/* PRIMARY KEY */
DROP TABLE games;
CREATE TABLE games (
	id INTEGER PRIMARY KEY,
	game_name TEXT,
	release_date DATE
);

INSERT INTO games
VALUES (1, 'Dark Souls Remastered', '2018-05-24');

INSERT INTO games
VALUES (2, 'Dark Souls II', '2014-03-11');

SELECT * FROM games;
SELECT * FROM games WHERE id = 2;
SELECT * FROM games WHERE game_name = 'Dark Souls II';


/* AUTO INCREMENT */
DROP TABLE transactions;
DELETE FROM transactions;
CREATE TABLE transactions (
	id SERIAL PRIMARY KEY,
	amount DECIMAL(10, 2) NOT NULL DEFAULT 0.00,
	transaction_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

SELECT * FROM transactions;
SELECT * FROM transactions WHERE id = 1006;



/* COUNT */
SELECT COUNT(*) FROM transactions;

SELECT COUNT(*)
FROM transactions
WHERE amount > 80000;


SELECT COUNT(*)
FROM transactions
WHERE transaction_date >= '2022-01-01' AND transaction_date <= '2022-01-31';


/* min max */
SELECT MAX(amount) FROM transactions;

SELECT MIN(amount) FROM transactions;

SELECT MIN(transaction_date) FROM transactions;

SELECT MIN(amount) 
FROM transactions
WHERE transaction_date >= '2022-01-01' AND transaction_date <= '2022-01-31';

SELECT MAX(amount) 
FROM transactions
WHERE transaction_date >= '2022-01-01' AND transaction_date <= '2022-01-31';