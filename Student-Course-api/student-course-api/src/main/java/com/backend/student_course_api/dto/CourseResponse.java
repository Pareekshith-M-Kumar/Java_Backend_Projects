package com.backend.student_course_api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class CourseResponse {

    private String title;
    private String duration;
}