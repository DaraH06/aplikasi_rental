package database;

import java.sql.*;
//refangga
public class database {
   public static Connection con;
    public static Statement stm; 

    public static Connection configDB() throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/app_rental";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =DriverManager.getConnection(url,user,pass);
            stm =con.createStatement();
            System.out.println("Koneksi berhasil");
        } catch (Exception e) {
            System.err.println("Koneksi gagal" +e.getMessage());
        }
        return con;
    }
}
