package main;

import util.DBconnection;
import java.sql.Connection;
import dao.EnrollmentDAO;

public class MainApp {
    public static void main(String[] args) {

        try (Connection con = DBconnection.getConnection()) {
            if (con != null) {
                System.out.println("MySQL connected successfully!");
            } else {
                System.out.println("Connection failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        EnrollmentDAO dao = new EnrollmentDAO();

        dao.enrollStudent(17, 5);
        dao.getStudentCourses(17);
    }
}
