package database;

import java.sql.*;

public class database {
    private static final String URL = "jdbc:mysql://localhost:3306/app_rental";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Koneksi ke database berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi ke database gagal!");
            e.printStackTrace();
        }
      
        return connection;
        
    } public static void main(String[] args) {
        database.getConnection();
    }
}