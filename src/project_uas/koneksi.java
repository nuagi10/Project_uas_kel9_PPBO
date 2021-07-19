/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_uas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class koneksi {
        private static Connection MySQLConfiq;
    public static Connection confiqDB() throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/d_netbeans";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfiq = DriverManager.getConnection(url,user,pass);
            
        }catch(SQLException e){
            System.out.println("Koneksi gagal"+e.getMessage());
        }
        return MySQLConfiq;
    }
}
