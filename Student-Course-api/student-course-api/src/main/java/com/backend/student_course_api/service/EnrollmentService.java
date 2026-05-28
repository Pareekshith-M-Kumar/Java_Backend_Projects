package com.backend.student_course_api.service;

import com.backend.student_course_api.dto.CourseResponse;
import com.backend.student_course_api.dto.EnrollmentRequest;
import com.backend.student_course_api.entity.Course;
import com.backend.student_course_api.entity.Enrollment;
import com.backend.student_course_api.entity.Student;
import com.backend.student_course_api.exception.ResourceNotFoundException;
import com.backend.student_course_api.repository.CourseRepository;
import com.backend.student_course_api.repository.EnrollmentRepository;
import com.backend.student_course_api.repository.StudentRepository;
import com.backend.student_course_api.exception.ResourceNotFoundException;
import com.backend.student_course_api.dto.CourseResponse;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    public String enrollStudent(EnrollmentRequest request) {

        boolean alreadyExists = enrollmentRepository.existsByStudentIdAndCourseId(
                request.getStudentId(),
                request.getCourseId());

        if (alreadyExists) {
            return "Student already enrolled in this course";
        }

        Student student = studentRepository.findById(request.getStudentId())
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));

        Course course = courseRepository.findById(request.getCourseId())
                .orElseThrow(() -> new ResourceNotFoundException("Course not found"));

        Enrollment enrollment = new Enrollment();

        enrollment.setStudent(student);
        enrollment.setCourse(course);

        enrollmentRepository.save(enrollment);

        return "Enrollment successful";
    }

    public List<CourseResponse> getStudentCourses(Long studentId) {

        List<Enrollment> enrollments = enrollmentRepository.findByStudentId(studentId);

        return enrollments.stream()
                .map(enrollment -> new CourseResponse(
                        enrollment.getCourse().getTitle(),
                        enrollment.getCourse().getDuration()))
                .toList();
    }
}