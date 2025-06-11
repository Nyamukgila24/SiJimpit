
package sijimpit;

/**
 * Kelas UserSession digunakan untuk menyimpan data sesi pengguna (user)
 * yang sedang login ke dalam aplikasi. Kelas ini menggunakan pendekatan 
 * static agar informasi user dapat diakses secara global selama aplikasi berjalan.
 * 
 * Cocok digunakan pada aplikasi desktop (seperti dengan Java Swing) untuk
 * menyimpan data pengguna setelah proses login berhasil.
 * 
 * @author Aini Intan Saylendra
 */
public class UserSession {
    // Menyimpan ID user yang sedang login
    private static Integer loggedInUserId;
    // Menyimpan nama user yang sedang login
    private static String loggedInUserName;
    // Menyimpan NIK (Nomor Induk Kependudukan) user yang sedang login
    private static String loggedInUserNik; // Pastikan ini juga ada

       /**
     * Method ini digunakan untuk menyimpan data user ke dalam sesi 
     * setelah proses login berhasil.
     * 
     * @param userId ID unik dari user
     * @param userName Nama lengkap user
     * @param userNik NIK (Nomor Induk Kependudukan) dari user
     */
    public static void setLoggedInUser(Integer userId, String userName, String userNik) {
        loggedInUserId = userId;
        loggedInUserName = userName;
        loggedInUserNik = userNik;
    }
 /**
     * Mengembalikan ID user yang sedang login.
     * @return Integer ID user
     */
    public static Integer getLoggedInUserId() {
        return loggedInUserId;
    }
        /**
     * Mengembalikan nama user yang sedang login.
     * @return String nama user
     */

    public static String getLoggedInUserName() {
        return loggedInUserName;
    }

    /**
     * Mengembalikan NIK user yang sedang login.
     * @return String NIK user
     */
    public static String getLoggedInUserNik() {
        return loggedInUserNik;
    }
    /**
     * Menghapus data user dari sesi.
     * Digunakan saat proses logout agar data user tidak tersimpan lagi.
     */
    public static void clearSession() {
        loggedInUserId = null;
        loggedInUserName = null;
        loggedInUserNik = null;
    }
}
