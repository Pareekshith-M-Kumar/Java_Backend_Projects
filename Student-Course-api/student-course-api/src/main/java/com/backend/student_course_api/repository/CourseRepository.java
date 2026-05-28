package com.backend.student_course_api.repository;

import com.backend.student_course_api.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}