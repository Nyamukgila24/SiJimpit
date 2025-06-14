package sijimpit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class KoneksiDatabase {
    private static Connection connection;

    public static Connection getConnection() {
        Connection conn = null; // Deklarasikan di sini
        try {
            String url = "jdbc:mysql://localhost:3306/sijimpit"; // nama database
            String user = "root"; // user database
            String password = ""; // password database

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            System.out.println("Koneksi Gagal: " + e.getMessage());
            e.printStackTrace(); // Penting untuk melihat stack trace lengkap
        }
        return conn; // <-- Selalu mengembalikan koneksi yang baru dibuat (atau null jika error)
    }
}