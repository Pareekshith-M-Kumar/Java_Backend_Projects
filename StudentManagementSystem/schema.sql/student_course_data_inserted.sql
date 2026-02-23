USE student_management;

-- insert course data 
-- DELETE FROM course WHERE course_id > 0;

INSERT INTO course (course_name, duration, fee)
VALUES
('Java', '3 Months', 5000),
('SQL', '1 Month', 2000);

-- insert student data
-- DELETE FROM student WHERE student_id > 0;
INSERT INTO student (name, email, phone, department)
VALUES 
('Rahul', 'rahul@gmail.com', '9876543210', 'CSE'),
('Anita', 'anita@gmail.com', '9123456780', 'ECE');


