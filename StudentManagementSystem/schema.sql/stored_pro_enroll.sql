DELIMITER $$

CREATE PROCEDURE enroll_student (
    IN p_student_id INT,
    IN p_course_id INT
)
BEGIN
    INSERT INTO enrollment (student_id, course_id, enrollment_date)
    VALUES (p_student_id, p_course_id, CURDATE());
END $$

DELIMITER ;

