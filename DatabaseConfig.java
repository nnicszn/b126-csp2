package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
    private static final String URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String USER = "root";
    private static final String PASSWORD = "your_password";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ OK: Gumagana ang Database Connection!");
        } catch (ClassNotFoundException e) {
            System.err.println("❌ ERROR: Kulang ng MySQL JDBC Driver (.jar file).");
        } catch (SQLException e) {
            System.err.println("❌ ERROR: Hindi makakonek sa Database. Suriin ang username/password/database name.");
        }
        return connection;
    }
}