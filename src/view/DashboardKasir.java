package view;

/**
 * @author Gemuh_Raharja
 */
public class DashboardKasir extends javax.swing.JFrame {

    public DashboardKasir() {
        initComponents();
    }

    @SuppressWarnings("")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_sidebar = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        b_setting = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        b_transaksi = new javax.swing.JLabel();
        b_log_out = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        p_content = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        navbar_transaksi = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        j_no_trasaksi = new javax.swing.JTextField();
        j_id_produk = new javax.swing.JTextField();
        j_nama_produk = new javax.swing.JTextField();
        j_harga_produk = new javax.swing.JTextField();
        j_jumlah_produk = new javax.swing.JTextField();
        j_total_h_produk = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        navbar_proses = new javax.swing.JPanel();
        j_total_transaksi = new javax.swing.JTextField();
        j_bayar = new javax.swing.JTextField();
        j_kebalian = new javax.swing.JTextField();
        b_ppn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p_sidebar.setBackground(new java.awt.Color(255, 255, 255));
        p_sidebar.setPreferredSize(new java.awt.Dimension(250, 500));

        menu.setBackground(new java.awt.Color(51, 0, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User_White.png"))); // NOI18N

        b_setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Setting.png"))); // NOI18N
        b_setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_settingMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("KASIR");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Username");

        b_transaksi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_transaksi.setForeground(new java.awt.Color(255, 255, 255));
        b_transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Kasir.png"))); // NOI18N
        b_transaksi.setText("TRANSAKSI ");
        b_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_transaksiMouseClicked(evt);
            }
        });

        b_log_out.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_log_out.setForeground(new java.awt.Color(255, 255, 255));
        b_log_out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Log_Out.png"))); // NOI18N
        b_log_out.setText("KELUAR");
        b_log_out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_log_outMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("UDAYAN POS");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(b_setting))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel9))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel2))
                            .addComponent(b_log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(b_transaksi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_log_out)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                .addComponent(b_setting)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout p_sidebarLayout = new javax.swing.GroupLayout(p_sidebar);
        p_sidebar.setLayout(p_sidebarLayout);
        p_sidebarLayout.setHorizontalGroup(
            p_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_sidebarLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        p_sidebarLayout.setVerticalGroup(
            p_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(p_sidebar, java.awt.BorderLayout.LINE_START);

        p_content.setBackground(new java.awt.Color(255, 255, 255));

        content.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Rp.");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 255), 1, true));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("NO. TRANSAKSI");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("ID PRODUK");

        j_no_trasaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_no_trasaksiActionPerformed(evt);
            }
        });

        j_id_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_id_produkActionPerformed(evt);
            }
        });

        j_nama_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_nama_produkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navbar_transaksiLayout = new javax.swing.GroupLayout(navbar_transaksi);
        navbar_transaksi.setLayout(navbar_transaksiLayout);
        navbar_transaksiLayout.setHorizontalGroup(
            navbar_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbar_transaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navbar_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(navbar_transaksiLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(navbar_transaksiLayout.createSequentialGroup()
                        .addGroup(navbar_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(navbar_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j_no_trasaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j_id_produk, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j_nama_produk, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j_harga_produk, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j_jumlah_produk, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j_total_h_produk, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        navbar_transaksiLayout.setVerticalGroup(
            navbar_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbar_transaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navbar_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(navbar_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(j_id_produk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(j_nama_produk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(j_harga_produk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(j_jumlah_produk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(j_total_h_produk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(navbar_transaksiLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(navbar_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(j_no_trasaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NO", "ID ", "NAMA", "HARGA", "JUMLAH", "TOTAL HARGA"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        b_ppn.setBackground(new java.awt.Color(51, 0, 255));
        b_ppn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_ppn.setForeground(new java.awt.Color(255, 255, 255));
        b_ppn.setText("PROSES");
        b_ppn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ppnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("TOTAL TRANSAKSI");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("BAYAR");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("KEBALIAN");

        javax.swing.GroupLayout navbar_prosesLayout = new javax.swing.GroupLayout(navbar_proses);
        navbar_proses.setLayout(navbar_prosesLayout);
        navbar_prosesLayout.setHorizontalGroup(
            navbar_prosesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbar_prosesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(navbar_prosesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(navbar_prosesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(j_total_transaksi)
                    .addComponent(j_kebalian)
                    .addComponent(b_ppn, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(j_bayar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        navbar_prosesLayout.setVerticalGroup(
            navbar_prosesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbar_prosesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navbar_prosesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_total_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(navbar_prosesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(navbar_prosesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_kebalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_ppn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navbar_transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(navbar_proses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addComponent(navbar_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navbar_proses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout p_contentLayout = new javax.swing.GroupLayout(p_content);
        p_content.setLayout(p_contentLayout);
        p_contentLayout.setHorizontalGroup(
            p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        p_contentLayout.setVerticalGroup(
            p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(p_content, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_transaksiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b_transaksiMouseClicked

    private void b_log_outMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_log_outMouseClicked
        setVisible(false);
        
        // Make the login form visible
        new login().setVisible(true);
    }//GEN-LAST:event_b_log_outMouseClicked

    private void b_settingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_settingMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b_settingMouseClicked

    private void j_no_trasaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_no_trasaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_no_trasaksiActionPerformed

    private void j_id_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_id_produkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_id_produkActionPerformed

    private void j_nama_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_nama_produkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_nama_produkActionPerformed

    private void b_ppnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ppnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_ppnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashboardKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardKasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b_log_out;
    private javax.swing.JButton b_ppn;
    private javax.swing.JLabel b_setting;
    private javax.swing.JLabel b_transaksi;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField j_bayar;
    private javax.swing.JTextField j_harga_produk;
    private javax.swing.JTextField j_id_produk;
    private javax.swing.JTextField j_jumlah_produk;
    private javax.swing.JTextField j_kebalian;
    private javax.swing.JTextField j_nama_produk;
    private javax.swing.JTextField j_no_trasaksi;
    private javax.swing.JTextField j_total_h_produk;
    private javax.swing.JTextField j_total_transaksi;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel navbar_proses;
    private javax.swing.JPanel navbar_transaksi;
    private javax.swing.JPanel p_content;
    private javax.swing.JPanel p_sidebar;
    // End of variables declaration//GEN-END:variables
}
