package com.backend.student_course_api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class EnrollmentRequest {

    private Long studentId;
    private Long courseId;
}