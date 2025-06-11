package sijimpit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * Kelas ini bertanggung jawab untuk membuat dan mengelola koneksi ke database MySQL.
 * Menggunakan pendekatan Singleton agar koneksi hanya dibuat sekali selama aplikasi berjalan.
 */

public class KoneksiDatabase {
    private static Connection connection;
    
    /**
     * Method untuk mendapatkan koneksi ke database.
     * Jika koneksi belum dibuat, maka akan dibuat baru.
     * 
     * @return Connection objek untuk interaksi dengan database
     */

    public static Connection getConnection() {
         // Cek apakah koneksi sudah pernah dibuat
        if (connection == null) {
            try {
                // URL koneksi database (ganti sesuai nama DB Anda jika berbeda)
                String url = "jdbc:mysql://localhost:3306/sijimpit";// nama database
                   // Username dan password default untuk MySQL (ganti sesuai konfigurasi lokal)
                String user = "root"; // user database
                String password = ""; // password database
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                 // Registrasi driver MySQL secara manual (bisa juga dikelola otomatis sejak JDBC 4.0)
                connection = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Berhasil");
            } catch (SQLException e) {
                 // Tampilkan pesan jika koneksi gagal dibuat
                System.out.println("Koneksi Gagal: " + e.getMessage());
            }
        }
        return connection;
    }
}