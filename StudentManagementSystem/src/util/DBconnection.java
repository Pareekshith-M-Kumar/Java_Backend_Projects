package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {

    private static final String URL =
        "jdbc:mysql://localhost:3306/student_management?useSSL=false&serverTimezone=UTC";

    private static final String USER = "student_user";
    private static final String PASSWORD = "student@123";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
