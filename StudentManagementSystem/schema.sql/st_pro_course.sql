DROP PROCEDURE IF EXISTS get_student_courses;

DELIMITER $$

CREATE PROCEDURE get_student_courses (
    IN p_student_id INT
)
BEGIN
    SELECT 
        s.name AS student_name,
        c.course_name,
        c.duration,
        c.fee
    FROM student s
    JOIN enrollment e ON s.student_id = e.student_id
    JOIN course c ON e.course_id = c.course_id
    WHERE s.student_id = p_student_id;
END $$

DELIMITER ;
