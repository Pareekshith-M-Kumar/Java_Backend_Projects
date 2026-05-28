package com.backend.student_course_api.controller;

import com.backend.student_course_api.entity.Course;
import com.backend.student_course_api.service.CourseService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")

public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public Course createCourse(@Valid @RequestBody Course course) {
        return courseService.createCourse(course);
    }

    @GetMapping
    public Page<Course> getAllCourses(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size) {

        return courseService.getAllCourses(
                PageRequest.of(page, size)
        );
    }
}