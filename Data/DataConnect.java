package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnect {
    private static String user = "sa"; // hoặc tên user bạn tạo trong SQL Server
    private static String password = "123456789"; // password tương ứng
    private static String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanlysachvaTacgia;encrypt=true;trustServerCertificate=true";
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    public static Connection getConnection() {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace(); // In ra lỗi để dễ debug
            return null;
        }
    }
}
