/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Vector;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controller.MySQLConnection;
import models.Admin;

public class admin_pegawai extends javax.swing.JFrame {

    /** * Creates new form dataransaksi */
    public admin_pegawai() {
        initComponents();
        displayEmployeeData(tableModel, jPanel2);

        // Menempatkan frame di tengah layar
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        menu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        b_transaksi = new javax.swing.JLabel();
        b_log_out = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        b_log_out1 = new javax.swing.JLabel();
        b_log_out2 = new javax.swing.JLabel();
        b_log_out3 = new javax.swing.JLabel();
        btn_distributor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        menu2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        label_nama = new javax.swing.JLabel();
        b_transaksi2 = new javax.swing.JLabel();
        btn_produk = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_pegawai = new javax.swing.JLabel();
        btn_distributor = new javax.swing.JLabel();
        btn_laporan = new javax.swing.JLabel();
        btn_transaksi = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_aktif = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_nonaktif = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btn_export = new javax.swing.JButton();
        tableModel = new DefaultTableModel();

        menu.setBackground(new java.awt.Color(51, 0, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Administrator");

        b_transaksi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_transaksi.setForeground(new java.awt.Color(255, 255, 255));
        b_transaksi.setText("Navigasi Menu");
        b_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_transaksiMouseClicked(evt);
            }
        });

        b_log_out.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_log_out.setForeground(new java.awt.Color(255, 255, 255));
        b_log_out.setText("Lihat Produk");
        b_log_out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_log_outMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("UDAYAN POS");

        b_log_out1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_log_out1.setForeground(new java.awt.Color(255, 255, 255));
        b_log_out1.setText("Pegawai");
        b_log_out1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_log_out1MouseClicked(evt);
            }
        });

        b_log_out2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_log_out2.setForeground(new java.awt.Color(255, 255, 255));
        b_log_out2.setText("Transaksi");
        b_log_out2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_log_out2MouseClicked(evt);
            }
        });

        b_log_out3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_log_out3.setForeground(new java.awt.Color(255, 255, 255));
        b_log_out3.setText("Laporan");
        b_log_out3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_log_out3MouseClicked(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_log_out1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_log_out2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_log_out3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_distributor, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(b_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel2)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_transaksi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_log_out)
                .addGap(26, 26, 26)
                .addComponent(b_log_out1)
                .addGap(26, 26, 26)
                .addComponent(b_log_out2)
                .addGap(26, 26, 26)
                .addComponent(b_log_out3)
                .addGap(26, 26, 26)
                .addComponent(btn_distributor)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jMenuItem3.setText("jMenuItem3");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 605));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        menu2.setBackground(new java.awt.Color(51, 0, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Admin");

        label_nama.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_nama.setForeground(new java.awt.Color(255, 255, 255));
        label_nama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_nama.setText("Administrator");

        b_transaksi2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_transaksi2.setForeground(new java.awt.Color(255, 255, 255));
        b_transaksi2.setText("Navigasi Menu");
        b_transaksi2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_transaksi2MouseClicked(evt);
            }
        });

        btn_produk.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_produk.setForeground(new java.awt.Color(255, 255, 255));
        btn_produk.setText("Lihat Produk");
        btn_produk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_produkMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("UDAYAN POS");

        btn_pegawai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_pegawai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_pegawai.setForeground(new java.awt.Color(255, 255, 255));
        btn_pegawai.setText("Pegawai");
        btn_pegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pegawaiMouseClicked(evt);
            }
        });

        btn_distributor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_distributor.setForeground(new java.awt.Color(255, 255, 255));
        btn_distributor.setText("Distributor");
        btn_distributor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_distributorMouseClicked(evt);
            }
        });

        btn_laporan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_laporan.setForeground(new java.awt.Color(255, 255, 255));
        btn_laporan.setText("Laporan");
        btn_laporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_laporanMouseClicked(evt);
            }
        });

        btn_transaksi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_transaksi.setForeground(new java.awt.Color(255, 255, 255));
        btn_transaksi.setText("Transaksi");
        btn_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_transaksiMouseClicked(evt);
            }
        });

        jLabel8.setText("jLabel1");

        btn_logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("Logout");
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menu2Layout = new javax.swing.GroupLayout(menu2);
        menu2.setLayout(menu2Layout);
        menu2Layout.setHorizontalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(menu2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(label_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(menu2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(b_transaksi2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(menu2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btn_produk, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(menu2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btn_pegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(menu2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btn_distributor, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(menu2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        menu2Layout.setVerticalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(label_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(b_transaksi2)
                .addGap(12, 12, 12)
                .addComponent(btn_produk)
                .addGap(18, 18, 18)
                .addComponent(btn_pegawai)
                .addGap(18, 18, 18)
                .addComponent(btn_distributor)
                .addGap(18, 18, 18)
                .addComponent(btn_transaksi)
                .addGap(18, 18, 18)
                .addComponent(btn_logout)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        JTable dataTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(dataTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE) // 900 - width of scrollbar
                .addContainerGap())
        );
        
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE) // 500 - height of scrollbar
                .addContainerGap())
        );
        
        btn_aktif.setText("Aktif");
        btn_aktif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aktifActionPerformed(evt);
            }
        });

        btn_add.setText("Tambah Data");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_nonaktif.setText("Non-Aktif");
        btn_nonaktif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_export.setText("Export Data");
        btn_export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exportActionPerformed(evt);
            }
        });


        jTextField1.setText("Masukkan nama pegawai");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_nonaktif, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_aktif, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)
                        .addComponent(btn_export, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aktif)
                    .addComponent(btn_add)
                    .addComponent(btn_nonaktif)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(btn_export))

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void b_transaksiMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void b_log_outMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void b_log_out1MouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void b_log_out2MouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void b_log_out3MouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void btn_distributorMouseClicked(java.awt.event.MouseEvent evt) {
        // Close the current dashboard
        dispose();
        
        // Make the login form visible
        new admin_distributor().setVisible(true);    
    }                                

    private void b_transaksi2MouseClicked(java.awt.event.MouseEvent evt) {                                          
        // Close the current dashboard
        dispose();
        
        // Make the login form visible
        new admin_transaksi().setVisible(true);
    }                                         

    private void btn_produkMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // Close the current dashboard
        dispose();
        
        // Make the login form visible
        new admin_produk().setVisible(true);
    }                                       

    private void btn_pegawaiMouseClicked(java.awt.event.MouseEvent evt) {                                         
        
    }                                     

    private void btn_exportActionPerformed(java.awt.event.ActionEvent evt) {
        // Mendapatkan direktori kerja saat ini
        String workingDir = System.getProperty("user.dir");

        // Menentukan nama folder untuk menyimpan file
        String folderName = "lib";

        // Menentukan nama file untuk ekspor
        String fileName = "data_pegawai.txt";

        // Menggabungkan direktori kerja dengan nama folder dan nama file untuk
        // mendapatkan path absolut
        String absolutePath = workingDir + File.separator + folderName + File.separator + fileName;

        // Memanggil fungsi untuk melakukan ekspor ke file txt di path tersebut
        exportDataToFile(absolutePath);
    }                         
                                

    private void btn_laporanMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btn_transaksiMouseClicked(java.awt.event.MouseEvent evt) {                                           
        // Close the current dashboard
        dispose();
        
        // Make the login form visible
        new admin_transaksi().setVisible(true);
    }                                      

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // Panggil fungsi untuk menambahkan data pegawai
        addEmployeeData(tableModel);
        
        displayEmployeeData(tableModel, jPanel2);
    }                                          

    private void btn_aktifActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // Ambil nilai dari suatu komponen seperti JTextField untuk mendapatkan nama karyawan yang ingin dihapus
        String employeeNameToDelete = jTextField1.getText(); // Gantilah textFieldEmployeeName dengan komponen yang sesuai

        // Panggil fungsi deleteEmployeeByName dengan nama karyawan yang ingin dihapus
        aktifEmployeeByName(employeeNameToDelete);

        displayEmployeeData(tableModel, jPanel2);
    }        

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // Ambil nilai dari suatu komponen seperti JTextField untuk mendapatkan nama karyawan yang ingin dihapus
        String employeeNameToDelete = jTextField1.getText(); // Gantilah textFieldEmployeeName dengan komponen yang sesuai

        // Panggil fungsi deleteEmployeeByName dengan nama karyawan yang ingin dihapus
        deleteEmployeeByName(employeeNameToDelete);

        displayEmployeeData(tableModel, jPanel2);
    }                                         
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String searchName = jTextField1.getText();
        admin.searchEmployeeByName(searchName, tableModel);
    }                                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // Close the current dashboard
        dispose();
        
        // Make the login form visible
        new login().setVisible(true);
    }
    
    private void exportDataToFile(String filePath) {
        try {
            // Membuka file untuk penulisan (file akan dibuat jika tidak ada)
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

            // Mendapatkan data dari tabel atau sumber data lainnya
            // Misalnya, menggunakan loop untuk mendapatkan data dari tabel
            for (int row = 0; row < tableModel.getRowCount(); row++) {
                for (int column = 0; column < tableModel.getColumnCount(); column++) {
                    writer.write(tableModel.getValueAt(row, column).toString() + "\t");
                }
                writer.newLine(); // Pindah ke baris berikutnya setelah satu baris selesai ditulis
            }

            // Menutup file setelah selesai ditulis
            writer.close();

            // Menampilkan pesan sukses atau melakukan tindakan lain yang sesuai
            System.out.println("Data berhasil diekspor ke: " + filePath);
            // Menampilkan pesan sukses
            JOptionPane.showMessageDialog(null, "Data berhasil diekspor ke: " + filePath, "Export Success",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            // Menampilkan pesan kesalahan atau melakukan tindakan lain yang sesuai
            System.err.println("Gagal mengekspor data ke file: " + filePath);
            // Menampilkan pesan kesalahan
            JOptionPane.showMessageDialog(null, "Gagal mengekspor data ke file: " + filePath, "Export Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void displayEmployeeData(DefaultTableModel tableModel, JPanel jPanel) {
        Connection connection = MySQLConnection.getConnection();

        if (connection != null) {
            try {
                String selectQuery = "SELECT IDEmployee, NamaEmployee, Jabatan, Gaji, status FROM Employee";
                PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
                ResultSet resultSet = preparedStatement.executeQuery();

                // Get column names
                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();
                Vector<String> columnNames = new Vector<>();
                for (int column = 1; column <= columnCount; column++) {
                    columnNames.add(metaData.getColumnName(column));
                }

                // Get data rows
                Vector<Vector<Object>> data = new Vector<>();
                while (resultSet.next()) {
                    Vector<Object> row = new Vector<>();
                    for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                        // Format gaji ke format mata uang Rupiah
                        if (metaData.getColumnName(columnIndex).equals("Gaji")) {
                            double gaji = resultSet.getDouble(columnIndex);
                            NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(
                                    new Locale.Builder().setLanguage("id").setRegion("ID").build()
                            );
                            row.add(formatRupiah.format(gaji));
                        } else {
                            row.add(resultSet.getObject(columnIndex));
                        }
                    }
                    data.add(row);
                }

                // Update the table model with new data
                tableModel.setDataVector(data, columnNames);

                // Close the resources
                resultSet.close();
                preparedStatement.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                MySQLConnection.closeConnection();
            }
        } else {
            System.out.println("Failed to connect to the database!");
        }
    }
    
    public void deleteEmployeeByName(String name) {
        Connection connection = MySQLConnection.getConnection();
    
        if (connection != null) {
            try {
                String deleteQuery = "UPDATE employee SET Status='Tidak Aktif' WHERE NamaEmployee=?";
                PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
                preparedStatement.setString(1, name);
    
                // Execute the delete query
                int rowsDeleted = preparedStatement.executeUpdate();
    
                if (rowsDeleted > 0) {
                    System.out.println("Employee data deleted successfully!");
                } else {
                    System.out.println("No employee found with the given name.");
                }
    
                // Close the resources
                preparedStatement.close();
    
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                MySQLConnection.closeConnection();
            }
        } else {
            System.out.println("Failed to connect to the database!");
        }
    }
    
    public void aktifEmployeeByName(String name) {
        Connection connection = MySQLConnection.getConnection();
    
        if (connection != null) {
            try {
                String deleteQuery = "UPDATE employee SET Status='Aktif' WHERE NamaEmployee=?";
                PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
                preparedStatement.setString(1, name);
    
                // Execute the delete query
                int rowsDeleted = preparedStatement.executeUpdate();
    
                if (rowsDeleted > 0) {
                    System.out.println("Employee data deleted successfully!");
                } else {
                    System.out.println("No employee found with the given name.");
                }
    
                // Close the resources
                preparedStatement.close();
    
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                MySQLConnection.closeConnection();
            }
        } else {
            System.out.println("Failed to connect to the database!");
        }
    }

    // Search employee by name
    public void searchEmployeeByName(String name, DefaultTableModel tableModel) {
        // Clear existing data in the table
        tableModel.setRowCount(0);

        // Perform the search query
        Connection connection = MySQLConnection.getConnection();

        if (connection != null) {
            try {
                String selectQuery = "SELECT IDEmployee, NamaEmployee, Jabatan, Gaji FROM Employee WHERE NamaEmployee LIKE ?";
                PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
                preparedStatement.setString(1, "%" + name + "%");

                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    Vector<Object> row = new Vector<>();
                    for (int columnIndex = 1; columnIndex <= 4; columnIndex++) {
                        // Format gaji ke format mata uang Rupiah
                        if (columnIndex == 4) {
                            double gaji = resultSet.getDouble(columnIndex);
                            NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(
                                    new Locale.Builder().setLanguage("id").setRegion("ID").build()
                            );
                            row.add(formatRupiah.format(gaji));
                        } else {
                            row.add(resultSet.getObject(columnIndex));
                        }
                    }
                    tableModel.addRow(row);
                }

                // Close the resources
                resultSet.close();
                preparedStatement.close();

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                MySQLConnection.closeConnection();
            }
        } else {
            System.out.println("Failed to connect to the database!");
        }
    }

    /*Fungsi untuk menambahkan data pegawai*/
    private void addEmployeeData(DefaultTableModel tableModel) {
        // Dialog untuk memasukkan data pegawai
        JPanel panel = new JPanel(new GridLayout(8, 2));
        JTextField employeeIdField = new JTextField();
        JTextField employeeNameField = new JTextField();
        JTextField positionField = new JTextField();
        JTextField salaryField = new JTextField();
        JTextField additionalAccessField = new JTextField();
        JTextField specialResponsibilityField = new JTextField();
        JTextField handledCashField = new JTextField();
        JComboBox<String> employeeTypeComboBox = new JComboBox<>(new String[]{"Admin", "Staff", "Kasir"});

        panel.add(new JLabel("Employee ID:"));
        panel.add(employeeIdField);
        panel.add(new JLabel("Employee Name:"));
        panel.add(employeeNameField);
        panel.add(new JLabel("Position:"));
        panel.add(positionField);
        panel.add(new JLabel("Salary:"));
        panel.add(salaryField);
        panel.add(new JLabel("Additional Access:"));
        panel.add(additionalAccessField);
        panel.add(new JLabel("Special Responsibility:"));
        panel.add(specialResponsibilityField);
        panel.add(new JLabel("Handled Cash:"));
        panel.add(handledCashField);
        panel.add(new JLabel("Employee Type:"));
        panel.add(employeeTypeComboBox);

        int result = JOptionPane.showConfirmDialog(null, panel, "Tambah Pegawai", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            try {
                // Mendapatkan data dari inputan pengguna
                int employeeId = Integer.parseInt(employeeIdField.getText());
                String employeeName = employeeNameField.getText();
                String position = positionField.getText();
                double salary = Double.parseDouble(salaryField.getText());
                String additionalAccess = additionalAccessField.getText().isEmpty() ? null : additionalAccessField.getText();
                String specialResponsibility = specialResponsibilityField.getText().isEmpty() ? null : specialResponsibilityField.getText();
                String handledCash = handledCashField.getText().isEmpty() ? null : handledCashField.getText();
                String employeeType = (String) employeeTypeComboBox.getSelectedItem();

                // Menambahkan data ke database
                addEmployeeToDatabase(employeeId, employeeName, position, salary, additionalAccess,
                    specialResponsibility, handledCash, employeeType);

                // Menambahkan data ke tabel
                Vector<Object> rowData = new Vector<>();
                rowData.add(employeeId);
                rowData.add(employeeName);
                rowData.add(position);
                rowData.add(salary);
                rowData.add(additionalAccess);
                rowData.add(specialResponsibility);
                rowData.add(handledCash);
                rowData.add(employeeType);

                tableModel.addRow(rowData);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Masukkan data dengan format yang benar.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Fungsi untuk menambahkan data pegawai ke database
    private void addEmployeeToDatabase(int employeeId, String employeeName, String position, double salary,
            String additionalAccess, String specialResponsibility, String handledCash, String employeeType) {
        Connection connection = MySQLConnection.getConnection();

        if (connection != null) {
            try {
                String insertQuery = "INSERT INTO Employee (IDEmployee, NamaEmployee, Jabatan, Gaji, IzinAksesTambahan, " +
                        "TanggungJawabKhusus, KasDitangani, EmployeeType) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
                preparedStatement.setInt(1, employeeId);
                preparedStatement.setString(2, employeeName);
                preparedStatement.setString(3, position);
                preparedStatement.setDouble(4, salary);
                preparedStatement.setString(5, additionalAccess);
                preparedStatement.setString(6, specialResponsibility);
                preparedStatement.setString(7, handledCash);
                preparedStatement.setString(8, employeeType);

                preparedStatement.executeUpdate();
                preparedStatement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                MySQLConnection.closeConnection();
            }
        } else {
            System.out.println("Failed to connect to the database!");
        }
    }

        
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_pegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel b_log_out;
    private javax.swing.JLabel b_log_out1;
    private javax.swing.JLabel b_log_out2;
    private javax.swing.JLabel b_log_out3;
    private javax.swing.JLabel b_transaksi;
    private javax.swing.JLabel b_transaksi2;
    private javax.swing.JButton btn_nonaktif;
    private javax.swing.JLabel btn_distributor;
    private javax.swing.JButton btn_export;

    private javax.swing.JButton btn_aktif;
    private javax.swing.JLabel btn_laporan;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JButton btn_add;
    private javax.swing.JLabel btn_pegawai;
    private javax.swing.JLabel btn_produk;
    private javax.swing.JLabel btn_transaksi;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label_nama;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menu2;
    private DefaultTableModel tableModel;
    private Admin admin = new Admin();

    // End of variables declaration                   
}
