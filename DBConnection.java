package Mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    //dont steal my password please
    private static final String USERNAME = "akshay";
    private static final String PASSWORD = "Abd!jan22";
    private static final String CONN = "jdbc:mysql://localhost/music";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(CONN, USERNAME, PASSWORD); //start connection

    }
}
