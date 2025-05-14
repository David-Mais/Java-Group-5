-- 1
CREATE TABLE students (
	id SERIAL PRIMARY KEY,
	first_name TEXT,
	last_name TEXT,
	dob DATE,
	enrollment_date TIMESTAMP DEFAULT NOW(),
	grade INTEGER CHECK (grade BETWEEN 1 AND 12),
	email TEXT UNIQUE
);

-- 2
INSERT INTO students (first_name, last_name, dob, grade, email) VALUES
  ('ნიკა',   'ბერიძე',    '2011-04-15', 5,  'nika.beridze@example.com'),
  ('თეა',   'ჭელიძე',    '2010-09-02', 6,  'tea.chelidze@example.com'),
  ('მიკა',   'აშურაშვილი','2009-12-20', 7,  'mika.ashurashvili@example.com'),
  ('ანნა',   'გიორგაშვილი','2012-01-30', 4,  'anna.giorgadze@example.com'),
  ('დათა',   'მახარაძე',  '2011-07-11', 5,  'data.maharadze@example.com');

SELECT * FROM students;

-- 3
INSERT INTO students (first_name, last_name, dob, grade, email) VALUES
('ნიკა',   'ბერიძე',    '2011-04-15', 15,  'nika.beridze@gmail.com');

INSERT INTO students (first_name, last_name, dob, grade, email) VALUES
('ნიკა',   'ბერიძე',    '2011-04-15', 5,  'nika.beridze@example.com');

-- 4
UPDATE students
SET grade = grade + 1
WHERE first_name = 'თეა';

-- 5
DELETE FROM students
WHERE first_name = 'დათა';