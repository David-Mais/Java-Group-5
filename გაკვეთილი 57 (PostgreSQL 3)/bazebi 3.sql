SELECT * FROM transactions;

/* COUNT */
SELECT COUNT(*)
FROM transactions;

SELECT COUNT(*)
FROM transactions
WHERE amount >= 40000;


/* MIN */
SELECT MIN(amount)
FROM transactions;

SELECT MIN(amount)
FROM transactions
WHERE transaction_date > '2010-01-01';

/* MAX */
SELECT MAX(transaction_date) FROM transactions;

/* AVG */
SELECT AVG(amount) FROM transactions;

/* SUM */
SELECT SUM(amount) FROM transactions;

/* ORDER BY */
SELECT amount, transaction_date
FROM transactions
ORDER BY amount;

SELECT amount, transaction_date
FROM transactions
ORDER BY amount DESC;

SELECT amount, transaction_date
FROM transactions
ORDER BY transaction_date DESC;

SELECT amount, transaction_date
FROM transactions
WHERE transaction_date >= '2020-01-01' AND transaction_date <= '2020-12-31'
ORDER BY amount;


/* LIMIT */
SELECT * FROM transactions LIMIT 5;

SELECT * 
FROM transactions
ORDER BY amount DESC
LIMIT 1;

SELECT *
FROM transactions
WHERE amount = (SELECT MAX(amount) FROM transactions);

SELECT * 
FROM transactions 
ORDER BY amount ASC 
OFFSET 10 LIMIT 5;


/* FOREIGN KEYS */
CREATE TABLE students (
	id SERIAL PRIMARY KEY,
	first_name TEXT,
	last_name TEXT,
	course_id INTEGER,
	CONSTRAINT cid_fk FOREIGN KEY(course_id) REFERENCES courses(id)
);

ALTER TABLE students
ADD CONSTRAINT cid_fk FOREIGN KEY(course_id) REFERENCES courses(id);

CREATE TABLE courses (
	id SERIAL PRIMARY KEY,
	course_name TEXT,
	course_price INTEGER
);

INSERT INTO students (first_name, last_name, course_id) VALUES
('Davit', 'Maisuradze', 14);

INSERT INTO courses (course_name, course_price) VALUES
('Java 1', 2500),
('Java 2', 3000),
('C++', 1000),
('Python', 9672),
('HTML/CSS', 1600);
SELECT * FROM courses;

SELECT * FROM students;

/* JOIN */
SELECT *
FROM students s
INNER JOIN courses c
ON s.course_id = c.id;

SELECT s.first_name, s.last_name, c.course_name, c.course_price
FROM students s
JOIN courses c
ON s.course_id = c.id
WHERE c.course_name = 'Python';

SELECT c.course_price
FROM students s
JOIN courses c
ON s.course_id = c.id
WHERE s.last_name = 'Garton'

SELECT COUNT(*) AS "ჯავას სტუდენტები"
FROM students s
JOIN courses c
ON s.course_id = c.id
WHERE c.course_name = 'Java 1' OR c.course_name = 'Java 2';


SELECT COUNT(*) AS "ჯავას სტუდენტები"
FROM students s
JOIN courses c
ON s.course_id = c.id
WHERE c.course_name IN ('Java 1', 'Java 2');

SELECT COUNT(*) AS "ჯავას სტუდენტები"
FROM students s
JOIN courses c
ON s.course_id = c.id
WHERE c.course_name LIKE '%Java%';


SELECT s.first_name, s.last_name
FROM students s
JOIN courses c
ON s.course_id = c.id
WHERE c.course_price = (SELECT MAX(course_price) from courses);