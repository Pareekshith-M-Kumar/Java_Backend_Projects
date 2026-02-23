package dao;

import util.DBconnection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EnrollmentDAO {

    public void enrollStudent(int studentId, int courseId) {

        String sql = "{CALL enroll_student(?, ?)}";

        try (Connection con = DBconnection.getConnection();
             CallableStatement cs = con.prepareCall(sql)) {

            cs.setInt(1, studentId);
            cs.setInt(2, courseId);
            cs.execute();

            System.out.println("Student enrolled successfully");

        } catch (SQLException e) {
    if (e.getErrorCode() == 1062) {
        System.out.println("Student is already enrolled in this course");
    } else {
        e.printStackTrace();
    }
}
    }
    public void getStudentCourses(int studentId) {

    String sql = "{CALL get_student_courses(?)}";

    try (Connection con = DBconnection.getConnection();
         CallableStatement cs = con.prepareCall(sql)) {

        cs.setInt(1, studentId);
        ResultSet rs = cs.executeQuery();

        System.out.println("Courses for Student ID: " + studentId);

        while (rs.next()) {
            System.out.println(
                rs.getString("course_name") +
                " | " +
                rs.getString("duration")
            );
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}

}
