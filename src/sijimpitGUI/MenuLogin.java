package sijimpitGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import sijimpit.KoneksiDatabase;
import javax.swing.JOptionPane;
import sijimpit.KoneksiDatabase;
import sijimpit.UserSession;

public class MenuLogin extends javax.swing.JFrame {


    public MenuLogin() {
        initComponents();
        setLocationRelativeTo(null);
        // Menambahkan event listener untuk tombol daftar
        btn_daftar.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);// Pindah ke halaman pendaftaran
    }
});
    }

/**
     * Method ini otomatis dihasilkan oleh NetBeans GUI Editor.
     * Berisi inisialisasi komponen dan pengaturan layout tampilan.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        btn_masuk = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_daftar = new javax.swing.JButton();
        btn_masuk1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(400, 300));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sijimpitGUI/SijimpitIcon/Logo SiJimpit.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("NIK");

        jTextField1.setPreferredSize(new java.awt.Dimension(315, 35));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Password");

        jPasswordField1.setPreferredSize(new java.awt.Dimension(315, 35));

        btn_masuk.setText("Masuk");
        btn_masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masukActionPerformed(evt);
            }
        });

        jLabel5.setText("Belum punya akun?");

        btn_daftar.setForeground(new java.awt.Color(51, 102, 255));
        btn_daftar.setText("Daftar");
        btn_daftar.setBorder(null);

        btn_masuk1.setText("Panduan");
        btn_masuk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masuk1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(90, 90, 90)
                .addComponent(btn_masuk1)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_daftar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_masuk))
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_masuk1)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_daftar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_masuk)
                        .addComponent(jLabel5)))
                .addContainerGap(59, Short.MAX_VALUE))
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
  /**
     * Method yang dijalankan saat tombol "Masuk" diklik.
     * Melakukan proses autentikasi user berdasarkan input NIK dan password.
     */
    private void btn_masukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masukActionPerformed
    
        String nik = jTextField1.getText();// Ambil input NIK
        String password = new String(jPasswordField1.getPassword());// Ambil input password
        
        try {
        // Ambil koneksi ke database
        Connection con = KoneksiDatabase.getConnection();
         // Query SQL untuk mengecek kredensial pengguna
        String sql = "SELECT * FROM user WHERE nik = ? AND password = ?";
        java.sql.PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, nik);
        pst.setString(2, password);
        java.sql.ResultSet rs = pst.executeQuery();
        
               if (rs.next()) {  // Jika data ditemukan
            String role = rs.getString("role");  // Ambil role dari database
            
             // Login berdasarkan role
            if (role.equalsIgnoreCase("user")) {
                int id = rs.getInt("id");
                String namaUser = rs.getString("nama");
                String noHP = rs.getString("NoHp");
                // Simpan data session pengguna
                UserSession.setLoggedInUser(id, namaUser, nik);
                
                // Tampilkan halaman utama untuk warga// Tampilkan halaman utama untuk warga
                TampilanAwalWarga userPage = new TampilanAwalWarga(namaUser, noHP, nik);
                userPage.setVisible(true);
                this.dispose();
                
            } else if (role.equalsIgnoreCase("admin")) {
                // Tampilkan halaman utama untuk admin
                TampilanAwalAdmin adminPage = new TampilanAwalAdmin();  // Anda buat tampilan admin sendiri
                adminPage.setVisible(true);
                this.dispose(); // Tutup halaman login
            } else {
                // Role tidak dikenali
                JOptionPane.showMessageDialog(this, "Role tidak dikenali!");
            }
        } else {
                   // Jika tidak ditemukan data cocok
            JOptionPane.showMessageDialog(this, "Nik atau Password salah!");
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_btn_masukActionPerformed

    private void btn_masuk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masuk1ActionPerformed
        Panduan panduan = new Panduan();
        panduan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_masuk1ActionPerformed
  /**
     * Method ini dijalankan saat tombol "Daftar" diklik.
     * Akan membuka tampilan form pendaftaran.
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    MenuRegister registerPage = new MenuRegister(); 
    registerPage.setVisible(true); 
    this.dispose(); 
}
    /**
     * Method utama untuk menjalankan GUI.
     */
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
            java.util.logging.Logger.getLogger(MenuLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Menjalankan form login
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_daftar;
    private javax.swing.JButton btn_masuk;
    private javax.swing.JButton btn_masuk1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
