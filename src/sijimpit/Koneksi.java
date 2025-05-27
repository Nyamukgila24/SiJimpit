/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sijimpit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane; /**
         *
         * @author Aini Intan Saylendra
         */

public class Koneksi {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sijimpit";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConnection() throws SQLException {
        Connection connection = null;

        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            return connection;
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC tidak ditemukan: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Driver database tidak ditemukan. Pastikan library MySQL/JDBC ada di project Libraries.", "Error Koneksi", JOptionPane.ERROR_MESSAGE);
            throw new SQLException("Driver JDBC tidak ditemukan.", e); 
        } catch (SQLException e) {
            System.err.println("Gagal membuat koneksi ke database: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Gagal terkoneksi ke database: " + e.getMessage() + "\nPeriksa pengaturan database Anda (URL, Username, Password) atau pastikan server MySQL berjalan.", "Error Koneksi", JOptionPane.ERROR_MESSAGE);
            throw e;            
}
} }
