package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {

    static private String url = "jdbc:mysql://localhost:3306/KataTask";
    static private String user = "root";
    static private String password = "";


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
