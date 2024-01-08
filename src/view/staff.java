package view;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class staff extends JFrame {
    private DefaultTableModel model;
    private JTable table;
    private JTextField txtKode, txtNama, txtHarga, txtStok, txtKategori, txtKadaluarsa;
    private JButton btnTambah, btnHapus, btnEdit, btnCari, btnSort, btnKeluar, btnPengaturan, btnLogout;
    private Connection connection;

    public staff() {
        super("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);


        JPanel sidePanel = new JPanel();
        sidePanel.setBackground(new Color(51, 0, 255));
        sidePanel.setPreferredSize(new Dimension(200, getHeight()));


        JLabel titleLabel = new JLabel("UDAYANA POS", SwingConstants.CENTER);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));


        JLabel menuLabel = new JLabel("STAFF", SwingConstants.CENTER);
        menuLabel.setForeground(Color.WHITE);
        menuLabel.setFont(new Font("Arial", Font.BOLD, 16));


        JLabel namaStaffLabel = new JLabel("Nama: Candra", SwingConstants.CENTER);
        namaStaffLabel.setForeground(Color.WHITE);


        btnPengaturan = new JButton("Pengaturan");
        btnLogout = new JButton("Logout");

        setButtonStyle(btnPengaturan);
        setButtonStyle(btnLogout);

        btnPengaturan.addActionListener(e -> bukaPengaturan());
        btnLogout.addActionListener(e -> logout());

        GroupLayout sidePanelLayout = new GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
                sidePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(sidePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(sidePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(titleLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(menuLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(namaStaffLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnPengaturan, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnLogout, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        sidePanelLayout.setVerticalGroup(
                sidePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(sidePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menuLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(namaStaffLabel)
                                .addGap(30, 30, 30)
                                .addComponent(btnPengaturan)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLogout)
                                .addContainerGap(300, Short.MAX_VALUE))
        );

        add(sidePanel, BorderLayout.WEST);

        model = new DefaultTableModel();
        model.addColumn("Kode Produk");
        model.addColumn("Nama Produk");
        model.addColumn("Harga");
        model.addColumn("Stok");
        model.addColumn("Kategori");
        model.addColumn("Tanggal Kadaluarsa");

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new GridLayout(7, 2));
        txtKode = new JTextField();
        txtNama = new JTextField();
        txtHarga = new JTextField();
        txtStok = new JTextField();
        txtKategori = new JTextField();
        txtKadaluarsa = new JTextField();

        inputPanel.add(new JLabel("Kode Produk:"));
        inputPanel.add(txtKode);
        inputPanel.add(new JLabel("Nama Produk:"));
        inputPanel.add(txtNama);
        inputPanel.add(new JLabel("Harga:"));
        inputPanel.add(txtHarga);
        inputPanel.add(new JLabel("Stok:"));
        inputPanel.add(txtStok);
        inputPanel.add(new JLabel("Kategori:"));
        inputPanel.add(txtKategori);
        inputPanel.add(new JLabel("Tanggal Kadaluarsa:"));
        inputPanel.add(txtKadaluarsa);

    
        btnTambah = new JButton("Tambah");
        btnHapus = new JButton("Hapus");
        btnEdit = new JButton("Edit");
        btnCari = new JButton("Cari");
        btnSort = new JButton("Sort");
        btnKeluar = new JButton("Keluar");

        setButtonStyle(btnTambah);
        setButtonStyle(btnHapus);
        setButtonStyle(btnEdit);
        setButtonStyle(btnCari);
        setButtonStyle(btnSort);
        setButtonStyle(btnKeluar);

        btnTambah.addActionListener(e -> tambahProduk());
        btnHapus.addActionListener(e -> hapusProduk());
        btnEdit.addActionListener(e -> editProduk());
        btnCari.addActionListener(e -> cariProduk());
        btnSort.addActionListener(e -> sortProduk());
        btnKeluar.addActionListener(e -> keluarProgram());

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(btnTambah);
        buttonPanel.add(btnHapus);
        buttonPanel.add(btnEdit);
        buttonPanel.add(btnCari);
        buttonPanel.add(btnSort);
        buttonPanel.add(btnKeluar);

        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(inputPanel, BorderLayout.NORTH);
        bottomPanel.add(buttonPanel, BorderLayout.CENTER);

        add(bottomPanel, BorderLayout.SOUTH);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        try {
            String jdbcURL = "jdbc:mysql://localhost:3306/inventoryapp";
            String username = "root";
            String password = "";
            connection = DriverManager.getConnection(jdbcURL, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal terhubung ke database", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        fetchDataFromDatabase();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void setButtonStyle(JButton button) {
        button.setBackground(new Color(51, 0, 255));  
        button.setForeground(Color.WHITE);
    }

    private void fetchDataFromDatabase() {
        model.setRowCount(0);

        try {
            String query = "SELECT * FROM produk";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String kode = resultSet.getString("KodeProduk");
                String nama = resultSet.getString("NamaProduk");
                String harga = resultSet.getString("Harga");
                String stok = resultSet.getString("Stok");
                String kategori = resultSet.getString("Kategori");
                String kadaluarsa = resultSet.getString("TanggalKadaluarsa");

                model.addRow(new Object[]{kode, nama, harga, stok, kategori, kadaluarsa});
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal mengambil data dari database", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

private void tambahProduk() {
        String kode = txtKode.getText();
        String nama = txtNama.getText();
        String harga = txtHarga.getText();
        String stok = txtStok.getText();
        String kategori = txtKategori.getText();
        String kadaluarsa = txtKadaluarsa.getText();
    
        if (kode.isEmpty() || nama.isEmpty() || harga.isEmpty() || stok.isEmpty() || kategori.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field (kecuali Tanggal Kadaluarsa) harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    
        try {
            String query = "INSERT INTO produk (KodeProduk, NamaProduk, Harga, Stok, Kategori, TanggalKadaluarsa) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, kode);
            preparedStatement.setString(2, nama);
            preparedStatement.setString(3, harga);
            preparedStatement.setString(4, stok);
            preparedStatement.setString(5, kategori);
            
            if (kadaluarsa.isEmpty()) {
                preparedStatement.setNull(6, Types.DATE); 
            } else {
                preparedStatement.setString(6, kadaluarsa);
            }
    
            preparedStatement.executeUpdate();
    
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to add product to the database: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    
        fetchDataFromDatabase(); 
        kosongkanInput();
    }
    
    
    
    private void hapusProduk() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan dihapus!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    
        try {
            String kodeProduk = model.getValueAt(selectedRow, 0).toString();
            String query = "DELETE FROM produk WHERE KodeProduk=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, kodeProduk);
            preparedStatement.executeUpdate();
    
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to delete product from the database: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    
        fetchDataFromDatabase();
    }
    
    
    private void editProduk() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan diedit!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    
        String kodeProduk = model.getValueAt(selectedRow, 0).toString();
        String nama = txtNama.getText();
        String harga = txtHarga.getText();
        String stok = txtStok.getText();
        String kategori = txtKategori.getText();
        String kadaluarsa = txtKadaluarsa.getText();
    
        if (nama.isEmpty() || harga.isEmpty() || stok.isEmpty() || kategori.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field (kecuali Tanggal Kadaluarsa) harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    
        try {
            String query = "UPDATE produk SET NamaProduk=?, Harga=?, Stok=?, Kategori=?, TanggalKadaluarsa=? WHERE KodeProduk=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nama);
            preparedStatement.setString(2, harga);
            preparedStatement.setString(3, stok);
            preparedStatement.setString(4, kategori);
    
            if (kadaluarsa.isEmpty()) {
                preparedStatement.setNull(5, Types.DATE);  
            } else {
                preparedStatement.setString(5, kadaluarsa);
            }
    
            preparedStatement.setString(6, kodeProduk);
            preparedStatement.executeUpdate();
    
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to edit product in the database: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    
        fetchDataFromDatabase(); 
        kosongkanInput();
    }
    
    
    

    private void kosongkanInput() {
        txtKode.setText("");
        txtNama.setText("");
        txtHarga.setText("");
        txtStok.setText("");
        txtKategori.setText("");
        txtKadaluarsa.setText("");
    }

    private void cariProduk() {
        String keyword = JOptionPane.showInputDialog(this, "Masukkan keyword pencarian:");
        if (keyword == null) {
            return;
        }
    
        boolean found = false;
    
        table.clearSelection();
    
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                Object value = model.getValueAt(i, j);
    
                if (value != null && value.toString().toLowerCase().contains(keyword.toLowerCase())) {
                    table.clearSelection();
                    table.setRowSelectionInterval(i, i);
                    found = true;
                }
            }
        }
    
        if (!found) {
            JOptionPane.showMessageDialog(this, "Produk tidak ditemukan!", "Not Found", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    

    private void sortProduk() {
        int columnIndex = table.getSelectedColumn();
        if (columnIndex == -1) {
            JOptionPane.showMessageDialog(this, "Pilih kolom untuk sorting!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);
        sorter.setSortable(columnIndex, true);
        sorter.toggleSortOrder(columnIndex);
    }

    private void keluarProgram() {
        int result = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.exit(0);
        }
    }

    private void bukaPengaturan() {
        JOptionPane.showMessageDialog(this, "Pengaturan belum diimplementasikan", "Info", JOptionPane.INFORMATION_MESSAGE);
    }

 
    private void logout() {
        // Close the current dashboard
        dispose();
        
        // Make the login form visible
        new login().setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new staff());
    }
}
