SELECT 
    s.student_id,
    s.name AS student_name,
    c.course_name
FROM student s
JOIN enrollment e ON s.student_id = e.student_id
JOIN course c ON e.course_id = c.course_id;






