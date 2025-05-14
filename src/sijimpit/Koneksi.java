/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sijimpit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Aini Intan Saylendra
 */
public class Koneksi {
    private static Connection Koneksi;
    public static Connection getConnection() {
        if (Koneksi == null) {
         try {
            String url = "jdbc:mysql://localhost:3306/keuangan";
            String user = "root"; 
            String pass = ""; 
            Koneksi = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi berhasil.");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
    }
        return Koneksi;
    }    
}
