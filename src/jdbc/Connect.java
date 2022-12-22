package jdbc;

import java.sql.*;

public class Connect {
    static Connection conn = null;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/TestingSystem";
        String user = "root";
        String password = "root";

        // Đăng ký Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Get connection
        return DriverManager.getConnection(url, user, password);
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        conn = getConnection();

        String sql = " SELECT * from user";
        // Đăng ký Statement
        Statement stmt = conn.createStatement();

        PreparedStatement ps = conn.prepareStatement(sql);

        // Đăng ký ResultSet
        ResultSet rs = ps.executeQuery();
        closeConnection();
    }

    public static void closeConnection(){
        if(conn!= null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
