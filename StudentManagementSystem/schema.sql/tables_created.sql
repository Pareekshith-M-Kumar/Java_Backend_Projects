USE student_management;

-- student database created
CREATE TABLE student (
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE,
    phone VARCHAR(15),
    department VARCHAR(50)
);

-- course database created
CREATE TABLE course (
	course_id INT PRIMARY KEY auto_increment,
    course_name VARCHAR(100) NOT NULL,
    duration VARCHAR(50),
    fee DECIMAL(10,2)
);

-- enrollment database created
CREATE TABLE enrollment (
    enrollment_id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT NOT NULL,
    course_id INT NOT NULL,
    enrollment_date DATE,

    CONSTRAINT fk_student
        FOREIGN KEY (student_id)
        REFERENCES student(student_id)
        ON DELETE CASCADE,

    CONSTRAINT fk_course
        FOREIGN KEY (course_id)
        REFERENCES course(course_id)
        ON DELETE CASCADE,

    CONSTRAINT unique_enrollment
        UNIQUE (student_id, course_id)
);
