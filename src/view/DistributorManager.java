package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class DistributorManager extends JFrame {
    private DefaultTableModel model;
    private JTable table;
    private JTextField txtIDDistributor, txtNamaDistributor, txtAlamatDistributor, txtNoTelepon, txtEmailDistributor, txtStatusDistributor;
    private JButton btnTambah, btnHapus, btnEdit, btnCari;

    public DistributorManager() {
        super("Manajemen Distributor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        // Modifikasi model tabel
        model = new DefaultTableModel();
        model.addColumn("ID Distributor");
        model.addColumn("Nama Distributor");
        model.addColumn("Alamat Distributor");
        model.addColumn("Nomor Telepon");
        model.addColumn("Email Distributor");
        model.addColumn("Status Distributor");

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Modifikasi komponen input
        JPanel inputPanel = new JPanel(new GridLayout(6, 2));
        txtIDDistributor = new JTextField();
        txtNamaDistributor = new JTextField();
        txtAlamatDistributor = new JTextField();
        txtNoTelepon = new JTextField();
        txtEmailDistributor = new JTextField();
        txtStatusDistributor = new JTextField();

        inputPanel.add(new JLabel("ID Distributor:"));
        inputPanel.add(txtIDDistributor);
        inputPanel.add(new JLabel("Nama Distributor:"));
        inputPanel.add(txtNamaDistributor);
        inputPanel.add(new JLabel("Alamat Distributor:"));
        inputPanel.add(txtAlamatDistributor);
        inputPanel.add(new JLabel("Nomor Telepon:"));
        inputPanel.add(txtNoTelepon);
        inputPanel.add(new JLabel("Email Distributor:"));
        inputPanel.add(txtEmailDistributor);
        inputPanel.add(new JLabel("Status Distributor:"));
        inputPanel.add(txtStatusDistributor);

        // Tombol (tidak berubah)
        btnTambah = new JButton("Tambah");
        btnHapus = new JButton("Hapus");
        btnEdit = new JButton("Edit");
        btnCari = new JButton("Cari");
        

        // Listener (perlu modifikasi sesuai dengan logika baru)
        btnTambah.addActionListener(e -> tambahDistributor());
        btnHapus.addActionListener(e -> hapusDistributor());
        btnEdit.addActionListener(e -> editDistributor());
        btnCari.addActionListener(e -> cariDistributor());
        

        // Penambahan komponen input dan tombol ke frame
        add(inputPanel, BorderLayout.SOUTH);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnTambah);
        buttonPanel.add(btnHapus);
        buttonPanel.add(btnEdit);
        buttonPanel.add(btnCari);
        add(buttonPanel, BorderLayout.NORTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Modifikasi metode tambahDistributor, hapusDistributor, editDistributor, dan cariDistributor
    // dengan logika yang sesuai untuk mengelola data distributor baru
    // ...
    private void tambahDistributor() {
      String idDistributor = txtIDDistributor.getText();
      String namaDistributor = txtNamaDistributor.getText();
      String alamatDistributor = txtAlamatDistributor.getText();
      String noTelepon = txtNoTelepon.getText();
      String emailDistributor = txtEmailDistributor.getText();
      String statusDistributor = txtStatusDistributor.getText();
  
      if (idDistributor.isEmpty() || namaDistributor.isEmpty() || alamatDistributor.isEmpty() || noTelepon.isEmpty() || emailDistributor.isEmpty() || statusDistributor.isEmpty()) {
          JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
          return;
      }
  
      model.addRow(new Object[]{idDistributor, namaDistributor, alamatDistributor, noTelepon, emailDistributor, statusDistributor});
  
      txtIDDistributor.setText("");
      txtNamaDistributor.setText("");
      txtAlamatDistributor.setText("");
      txtNoTelepon.setText("");
      txtEmailDistributor.setText("");
      txtStatusDistributor.setText("");
  }
  private void hapusDistributor() {
   int selectedRow = table.getSelectedRow();
   if (selectedRow >= 0) {
       model.removeRow(selectedRow);
   } else {
       JOptionPane.showMessageDialog(this, "Pilih baris yang akan dihapus!", "Error", JOptionPane.ERROR_MESSAGE);
   }
}
private void editDistributor() {
   int selectedRow = table.getSelectedRow();
   if (selectedRow >= 0) {
       String idDistributor = txtIDDistributor.getText();
       String namaDistributor = txtNamaDistributor.getText();
       String alamatDistributor = txtAlamatDistributor.getText();
       String noTelepon = txtNoTelepon.getText();
       String emailDistributor = txtEmailDistributor.getText();
       String statusDistributor = txtStatusDistributor.getText();

       if (idDistributor.isEmpty() || namaDistributor.isEmpty() || alamatDistributor.isEmpty() || noTelepon.isEmpty() || emailDistributor.isEmpty() || statusDistributor.isEmpty()) {
           JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
           return;
       }

       model.setValueAt(idDistributor, selectedRow, 0);
       model.setValueAt(namaDistributor, selectedRow, 1);
       model.setValueAt(alamatDistributor, selectedRow, 2);
       model.setValueAt(noTelepon, selectedRow, 3);
       model.setValueAt(emailDistributor, selectedRow, 4);
       model.setValueAt(statusDistributor, selectedRow, 5);
   } else {
       JOptionPane.showMessageDialog(this, "Pilih baris yang akan diedit!", "Error", JOptionPane.ERROR_MESSAGE);
   }
}
private void cariDistributor() {
   String keyword = JOptionPane.showInputDialog(this, "Masukkan nama distributor untuk dicari:");
   if (keyword != null && !keyword.isEmpty()) {
       for (int i = 0; i < model.getRowCount(); i++) {
           if (model.getValueAt(i, 1).toString().equalsIgnoreCase(keyword)) {
               table.setRowSelectionInterval(i, i);
               return;
           }
       }
       JOptionPane.showMessageDialog(this, "Distributor tidak ditemukan!", "Not Found", JOptionPane.INFORMATION_MESSAGE);
   }
}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DistributorManager());
    }
}
