package com.backend.student_course_api.controller;

import com.backend.student_course_api.dto.CourseResponse;
import com.backend.student_course_api.dto.EnrollmentRequest;
import com.backend.student_course_api.service.EnrollmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enroll")

public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @PostMapping
    public String enrollStudent(@RequestBody EnrollmentRequest request) {

        return enrollmentService.enrollStudent(request);
    }

    @GetMapping("/student/{id}/courses")
    public List<CourseResponse> getStudentCourses(
            @PathVariable Long id) {

        return enrollmentService.getStudentCourses(id);
    }
}