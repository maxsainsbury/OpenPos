package utility;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author Max Sainsbury
 */
public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/openpos_db";
    
    public static Connection getConnection(String user) throws SQLException {
        return DriverManager.getConnection(URL, user, "");
    }
}
