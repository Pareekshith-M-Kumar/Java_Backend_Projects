DELIMITER $$

CREATE PROCEDURE get_course_students (
    IN p_course_id INT
)
BEGIN
    SELECT 
        c.course_name,
        s.name,
        s.email
    FROM course c
    JOIN enrollment e ON c.course_id = e.course_id
    JOIN student s ON e.student_id = s.student_id
    WHERE c.course_id = p_course_id;
END $$

DELIMITER ;
