package sijimpit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDatabase {
    public static Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:database_sijimpit.db"; // pastikan file db ini tersedia
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return conn;
    }
}
