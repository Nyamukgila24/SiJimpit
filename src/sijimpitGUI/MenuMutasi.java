package sijimpitGUI;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import sijimpit.Koneksi;
import sijimpit.UserSession;

public class MenuMutasi extends javax.swing.JFrame {

    private String namaUser; // Variabel untuk menyimpan nama pengguna
    private String noHP;     // Variabel untuk menyimpan nomor HP
    private String nik;      // Variabel untuk menyimpan Nomor Induk Kependudukan (NIK)
    private int currentPage = 1; // Halaman saat ini, dimulai dari 1
    private int rowsPerPage = 20; // Jumlah baris per halaman, bisa disesuaikan (misal 20)
    private int totalRows = 0;    // Total baris data yang ditemukan
    private int totalPages = 0;   // Total halaman yang tersedia

    public MenuMutasi() {
        setLocationRelativeTo(null);
        initComponents();    // Menginisialisasi komponen-komponen UI yang dibuat di GUI
        inisialisasiTahun(); // Memanggil metode untuk mengisi atau mengatur komponen terkait tahun

        combo_tahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Saat tahun diubah, reset ke halaman 1
                currentPage = 1;
                tampilkanDataBerdasarkanComboBox();
            }
        });
        tampilkanDataBerdasarkanComboBox(); // Memanggil metode untuk menampilkan data berdasarkan pilihan di combobox
    }

    public MenuMutasi(String namaUser, String noHP, String nik) {
        this.namaUser = namaUser; // Mengatur nilai 'namaUser' dari argumen ke variabel kelas
        this.noHP = noHP;         // Mengatur nilai 'noHP' dari argumen ke variabel kelas
        this.nik = nik;           // Mengatur nilai 'nik' dari argumen ke variabel kelas
        initComponents();
        setLocationRelativeTo(null);
        inisialisasiTahun();

        combo_tahun.addActionListener(new java.awt.event.ActionListener() { // Listener combo_tahun
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentPage = 1; // Saat tahun diubah, reset ke halaman 1
                tampilkanDataBerdasarkanComboBox();
            }
        });
        tampilkanDataBerdasarkanComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        btn_unduh = new javax.swing.JButton();
        combo_tahun = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Mutasi = new javax.swing.JTable();
        btn_sebelumnya = new javax.swing.JButton();
        btn_berikutnya = new javax.swing.JButton();
        lblPageStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(300, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));

        jPanel2.setBackground(new java.awt.Color(0, 204, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Riwayat Pembayaran");

        btn_back.setBackground(new java.awt.Color(0, 204, 51));
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sijimpitGUI/SijimpitIcon/back.png"))); // NOI18N
        btn_back.setBorder(null);
        btn_back.setPreferredSize(new java.awt.Dimension(32, 32));
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        btn_unduh.setBackground(new java.awt.Color(0, 204, 51));
        btn_unduh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sijimpitGUI/SijimpitIcon/inbox (1).png"))); // NOI18N
        btn_unduh.setBorder(null);
        btn_unduh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_unduhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(143, 143, 143)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(124, 124, 124)
                .addComponent(btn_unduh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_unduh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7)))
                .addGap(22, 22, 22))
        );

        combo_tahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Transaksi Tahun Ini", "Transaksi Tahun Lalu" }));

        Tbl_Mutasi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tanggal", "Nominal", "Status"
            }
        ));
        Tbl_Mutasi.setShowGrid(false);
        jScrollPane1.setViewportView(Tbl_Mutasi);

        btn_sebelumnya.setBackground(new java.awt.Color(255, 255, 0));
        btn_sebelumnya.setText("Data Sebelumnya");
        btn_sebelumnya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sebelumnyaActionPerformed(evt);
            }
        });

        btn_berikutnya.setBackground(new java.awt.Color(255, 255, 0));
        btn_berikutnya.setText("Data Berikutnya");
        btn_berikutnya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_berikutnyaActionPerformed(evt);
            }
        });

        lblPageStatus.setText("Menampilkan jumlah halaman");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(combo_tahun, 0, 161, Short.MAX_VALUE)
                        .addGap(407, 407, 407))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btn_sebelumnya)
                        .addGap(75, 75, 75)
                        .addComponent(btn_berikutnya, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPageStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(combo_tahun)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPageStatus)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sebelumnya)
                    .addComponent(btn_berikutnya))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void inisialisasiTahun() {
        combo_tahun.removeAllItems(); // Menghapus semua item yang ada di combobox tahun
        int tahunIni = java.time.Year.now().getValue(); // Mendapatkan tahun saat ini
        combo_tahun.addItem("Transaksi Tahun Ini"); // Menambahkan opsi 'Transaksi Tahun Ini'
        combo_tahun.addItem("Transaksi Tahun Lalu"); // Menambahkan opsi 'Transaksi Tahun Lalu'
        combo_tahun.setSelectedItem("Transaksi Tahun Ini"); // Mengatur pilihan default ke 'Transaksi Tahun Ini'
    }

    private void tampilkanDataBerdasarkanComboBox() {
        String selectedOption = (String) combo_tahun.getSelectedItem(); // Mendapatkan opsi yang dipilih dari combobox tahun

        if (this.nik == null || this.nik.isEmpty()) { // Memeriksa apakah NIK pengguna tersedia
            JOptionPane.showMessageDialog(this, "Informasi NIK pengguna tidak tersedia. Tidak dapat memuat data.", "Error", JOptionPane.ERROR_MESSAGE);
            Tbl_Mutasi.setModel(new DefaultTableModel()); // Kosongkan tabel jika NIK tidak ada
            updatePaginationButtons();
            return; // Menghentikan eksekusi metode
        }

        int tahunUntukFilter; // Variabel untuk menyimpan tahun yang akan digunakan sebagai filter
        int tahunSaatIni = java.time.Year.now().getValue(); // Mendapatkan tahun saat ini

        if (selectedOption == null) {
            // Ini bisa terjadi jika combo_tahun kosong atau belum diinisialisasi
            JOptionPane.showMessageDialog(this, "Pilihan tahun tidak ditemukan. Menggunakan tahun saat ini.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            tahunUntukFilter = tahunSaatIni; // Default ke tahun saat ini
            // Memfilter tahun
        } else if (selectedOption.equals("Transaksi Tahun Ini")) {
            tahunUntukFilter = tahunSaatIni;
            System.out.println("Filter JTable: Transaksi Tahun Ini (" + tahunUntukFilter + ")");
        } else if (selectedOption.equals("Transaksi Tahun Lalu")) {
            tahunUntukFilter = tahunSaatIni - 1;
            System.out.println("Filter JTable: Transaksi Tahun Lalu (" + tahunUntukFilter + ")");
            // Jika opsi yang dipilih tidak valid
        } else {
            JOptionPane.showMessageDialog(this, "Pilihan tahun tidak valid. Menampilkan data tahun ini.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            tahunUntukFilter = tahunSaatIni;
            System.err.println("Pilihan combo_tahun tidak dikenal: " + selectedOption);
        }
        tampilkanData(tahunUntukFilter, this.nik); // Memanggil metode untuk menampilkan data berdasarkan tahun filter dan NIK pengguna
    }

    private void tampilkanData(int tahun, String nikPengguna) {
        // Inisialisasi model tabel dan atur kolom agar tidak dapat diedit
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Semua kolom tidak dapat diedit
            }
        };
        model.addColumn("Tanggal");
        model.addColumn("Nominal");
        model.addColumn("Status");

        Tbl_Mutasi.setModel(model); // Set model awal (kosong)

        // Hitung offset untuk paginasi
        int offset = (currentPage - 1) * rowsPerPage;

        // Membuka koneksi database (otomatis ditutup setelah blok try)
        try (Connection conn = sijimpit.Koneksi.getConnection()) {
            if (conn == null) {
                JOptionPane.showMessageDialog(this, "Koneksi ke database gagal dibuat. Pastikan database berjalan.", "Error Koneksi", JOptionPane.ERROR_MESSAGE);
                // Nonaktifkan tombol pagination jika koneksi gagal
                updatePaginationButtons();
                return;
            }

            // 1. Hitung total baris data untuk paginasi berdasarkan tahun dan NIK
            String countQuery = "SELECT COUNT(*) FROM menu_pembayaran_warga WHERE YEAR(tanggal) = ? AND nik = ?";
            try (PreparedStatement psCount = conn.prepareStatement(countQuery)) {
                psCount.setInt(1, tahun);
                psCount.setString(2, nikPengguna);
                try (ResultSet countRs = psCount.executeQuery()) {
                    if (countRs.next()) {
                        totalRows = countRs.getInt(1); // Dapatkan jumlah total baris
                        totalPages = (int) Math.ceil((double) totalRows / rowsPerPage); // Hitung total halaman
                        // Pastikan totalPages minimal 1 jika ada data
                        if (totalRows > 0 && totalPages == 0) {
                            totalPages = 1;
                        }
                    } else {
                        totalRows = 0;
                        totalPages = 0;
                    }
                }
            }

            // 2. Ambil data untuk halaman saat ini dengan LIMIT dan OFFSET
            String dataQuery = "SELECT tanggal, nominal, status FROM menu_pembayaran_warga "
                    + "WHERE YEAR(tanggal) = ? AND nik = ? "
                    + "ORDER BY tanggal ASC LIMIT ? OFFSET ?";

            try (PreparedStatement psData = conn.prepareStatement(dataQuery)) {
                psData.setInt(1, tahun);
                psData.setString(2, nikPengguna);
                psData.setInt(3, rowsPerPage);
                psData.setInt(4, offset);

                try (ResultSet rs = psData.executeQuery()) {
                    while (rs.next()) {
                        // Format tanggal dan tambahkan baris ke model tabel
                        java.sql.Date sqlDate = rs.getDate("tanggal");
                        String formattedDate = "";
                        if (sqlDate != null) {
                            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                            formattedDate = sdf.format(new Date(sqlDate.getTime()));
                        }
                        model.addRow(new Object[]{
                            formattedDate,
                            rs.getString("nominal"),
                            rs.getString("status")
                        });
                    }
                    Tbl_Mutasi.setModel(model); // Set model tabel setelah data ditambahkan
                }
            }

            // Memperbarui tombol pagination setelah data dimuat
            updatePaginationButtons();

            // Menangani error SQL
        } catch (SQLException e) {
            System.err.println("Gagal ambil data mutasi dengan pagination: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Gagal mengambil data dari database: " + e.getMessage(), "Error Database", JOptionPane.ERROR_MESSAGE);
            Tbl_Mutasi.setModel(new DefaultTableModel()); // Kosongkan tabel jika ada error
            // Mengatur ulang data paginasi dan perbarui tampilan tombol
            totalRows = 0;
            totalPages = 0;
            updatePaginationButtons();
        }
    }


    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        TampilanAwalWarga menuwarga = new TampilanAwalWarga(namaUser, noHP, nik);
        menuwarga.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_unduhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_unduhActionPerformed
        try {
            String reportPath = "src/jasper/Mutasi.jasper"; // Lokasi file template laporan JasperReports
            HashMap<String, Object> parameters = new HashMap<>(); // Inisialisasi parameter laporan
            String selectedYearOption = (String) combo_tahun.getSelectedItem(); // Ambil pilihan tahun dari combobox

            // Validasi pilihan tahun
            if (selectedYearOption == null || selectedYearOption.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Mohon pilih tahun terlebih dahulu (Transaksi Tahun Ini atau Transaksi Tahun Lalu).", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Integer selectedYear = null;
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            // Menentukan tahun berdasarkan pilihan combobox
            if (selectedYearOption.equals("Transaksi Tahun Ini")) {
                selectedYear = currentYear;
                System.out.println("Memilih 'Transaksi Tahun Ini'. Parameter tahun dikirim: " + selectedYear);
            } else if (selectedYearOption.equals("Transaksi Tahun Lalu")) {
                selectedYear = currentYear - 1;
                System.out.println("Memilih 'Transaksi Tahun Lalu'. Parameter tahun dikirim: " + selectedYear);
            } else {
                JOptionPane.showMessageDialog(this, "Pilihan tahun tidak valid. Mohon pilih 'Tahun Ini' atau 'Tahun Lalu'.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (selectedYear == null) {
                JOptionPane.showMessageDialog(this, "Kesalahan internal: Tahun tidak dapat ditentukan.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            // Menambahkan parameter tahun
            parameters.put("tahun", selectedYear);
            String loggedInUserNik = sijimpit.UserSession.getLoggedInUserNik(); // Mengambil nik pengguna
            System.out.println("DEBUG: NIK dari UserSession = " + loggedInUserNik);
            if (loggedInUserNik == null || loggedInUserNik.isEmpty()) {
                JOptionPane.showMessageDialog(this, "NIK pengguna tidak ditemukan. Laporan tidak dapat dibuat.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            // Menambahkan parameter NIK
            parameters.put("nik_filter", loggedInUserNik);
            System.out.println("Nilai parameter nik_filter yang dikirim ke Jasper: " + loggedInUserNik);

            Connection conn = Koneksi.getConnection(); // Mendapatkan koneksi database
            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn); // Isi laporan dengan data
            // Tampilkan laporan
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);

            // Menangani kesalahan pembuatan laporan
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat membuat laporan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_unduhActionPerformed

    private void btn_berikutnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_berikutnyaActionPerformed
        // Pindah ke halaman berikutnya jika bukan halaman terakhir
        if (currentPage < totalPages) {
            currentPage++; // Tambah nomor halaman
            tampilkanDataBerdasarkanComboBox(); // Muat ulang data untuk halaman baru
        }
    }//GEN-LAST:event_btn_berikutnyaActionPerformed

    private void btn_sebelumnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sebelumnyaActionPerformed
        // Pindah ke halaman sebelumnya jika bukan halaman pertama
        if (currentPage > 1) {
            currentPage--; // Kurangi nomor halaman
            tampilkanDataBerdasarkanComboBox(); // Muat ulang data untuk halaman baru
        }
    }//GEN-LAST:event_btn_sebelumnyaActionPerformed

    private void updatePaginationButtons() {
        // Atur status tombol 'Sebelumnya' (aktif jika bukan halaman 1)
        if (btn_sebelumnya != null) {
            btn_sebelumnya.setEnabled(currentPage > 1);
        }
        // Atur status tombol 'Berikutnya' (aktif jika bukan halaman terakhir)
        if (btn_berikutnya != null) {
            btn_berikutnya.setEnabled(currentPage < totalPages);
        }
        // Perbarui teks label status halaman
        if (lblPageStatus != null) {
            lblPageStatus.setText("Halaman " + currentPage + " dari " + totalPages + " (Total: " + totalRows + " data)");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuMutasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMutasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMutasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMutasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMutasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tbl_Mutasi;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_berikutnya;
    private javax.swing.JButton btn_sebelumnya;
    private javax.swing.JButton btn_unduh;
    private javax.swing.JComboBox<String> combo_tahun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPageStatus;
    // End of variables declaration//GEN-END:variables
}
