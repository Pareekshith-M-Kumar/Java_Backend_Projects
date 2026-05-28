package com.backend.student_course_api.controller;

import com.backend.student_course_api.entity.Student;
import com.backend.student_course_api.service.StudentService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")

public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student createStudent(@Valid @RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping
    public Page<Student> getAllStudents(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size) {

        return studentService.getAllStudents(
                PageRequest.of(page, size)
        );
    }
}