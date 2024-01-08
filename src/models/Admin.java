package models;  // Ensure that the package declaration matches your directory structure

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import controller.MySQLConnection;

public class Admin extends Pegawai {
    private String izinAksesTambahan;

    public Admin(String namaPegawai, String idPegawai, String jabatan, int gaji, String izinAksesTambahan) {
        super(namaPegawai, idPegawai, jabatan, gaji);
        this.izinAksesTambahan = izinAksesTambahan;
    }

    // Konstruktor tanpa parameter
    public Admin() {
        super("Default", "DefaultID", "DefaultJabatan", 0);
        // Tidak memberikan nilai awal pada izinAksesTambahan
    }

    // Getter and Setter for izinAksesTambahan
    public String getIzinAksesTambahan() {
        return izinAksesTambahan;
    }

    public void setIzinAksesTambahan(String izinAksesTambahan) {
        this.izinAksesTambahan = izinAksesTambahan;
    }

    // Method to manage products (add, edit, delete)
    public void kelolaProduk(String aksi, Produk produk) {
        // Implementasi untuk menambah, mengedit, atau menghapus produk
    }

    // Method to manage employees (add, edit, delete)
    public void kelolaPegawai(String aksi, Pegawai pegawai) {
        // Implementasi untuk menambah, mengedit, atau menghapus pegawai
    }
    // Search employee by name
    public void searchEmployeeByName(String name, DefaultTableModel tableModel) {
        // Clear existing data in the table
        tableModel.setRowCount(0);

        // Perform the search query
        Connection connection = MySQLConnection.getConnection();

        if (connection != null) {
            try {
                String selectQuery = "SELECT IDEmployee, NamaEmployee, Jabatan, Gaji, status FROM Employee WHERE NamaEmployee LIKE ?";
                PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
                preparedStatement.setString(1, "%" + name + "%");

                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    Vector<Object> row = new Vector<>();
                    for (int columnIndex = 1; columnIndex <= 5; columnIndex++) {
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
    // Additional methods as needed

    public void searchProductByName(String name, DefaultTableModel tableModel) {
        // Clear existing data in the table
        tableModel.setRowCount(0);
    
        // Perform the search query
        Connection connection = MySQLConnection.getConnection();
    
        if (connection != null) {
            try {
                String selectQuery = "SELECT KodeProduk, NamaProduk, Harga, Stok, Kategori, Tanggalkadaluarsa FROM produk WHERE NamaProduk LIKE ?";
                PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
                preparedStatement.setString(1, "%" + name + "%");
    
                ResultSet resultSet = preparedStatement.executeQuery();
    
                while (resultSet.next()) {
                    Vector<Object> row = new Vector<>();
                    for (int columnIndex = 1; columnIndex <= resultSet.getMetaData().getColumnCount(); columnIndex++) {
                        // Format harga ke format mata uang Rupiah
                        if (resultSet.getMetaData().getColumnName(columnIndex).equals("Harga")) {
                            double harga = resultSet.getDouble(columnIndex);
                            NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(
                                    new Locale.Builder().setLanguage("id").setRegion("ID").build()
                            );
                            row.add(formatRupiah.format(harga));
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
    
    public void searchDistributorByName(String name, DefaultTableModel tableModel) {
        // Clear existing data in the table
        tableModel.setRowCount(0);
    
        // Perform the search query
        Connection connection = MySQLConnection.getConnection();
    
        if (connection != null) {
            try {
                String selectQuery = "SELECT IDDistributor, NamaDistributor, AlamatDistributor, NomorTelepon, EmailDistributor, statusDistributor FROM distributor WHERE NamaDistributor LIKE ?";
                PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
                preparedStatement.setString(1, "%" + name + "%");
    
                ResultSet resultSet = preparedStatement.executeQuery();
    
                while (resultSet.next()) {
                    Vector<Object> row = new Vector<>();
                    for (int columnIndex = 1; columnIndex <= resultSet.getMetaData().getColumnCount(); columnIndex++) {
                        // Format harga ke format mata uang Rupiah
                        if (resultSet.getMetaData().getColumnName(columnIndex).equals("Harga")) {
                            double harga = resultSet.getDouble(columnIndex);
                            NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(
                                    new Locale.Builder().setLanguage("id").setRegion("ID").build()
                            );
                            row.add(formatRupiah.format(harga));
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
    
    /* Search produk by name */
    public void searchTransactionByID(String transactionId, DefaultTableModel tableModel) {
        // Clear existing data in the table
        tableModel.setRowCount(0);

        // Perform the search query
        Connection connection = MySQLConnection.getConnection();

        if (connection != null) {
            try {
                String selectQuery = "SELECT 'Pembelian' AS TransaksiType, "
                + "p.IDPembelian AS TransaksiID, p.Tanggal AS TransaksiTanggal, "
                + "d.NamaDistributor AS NamaPelangganDistributor, "
                + "e.NamaEmployee AS NamaPegawai, dp.KodeProduk, pr.NamaProduk, "
                + "dp.Jumlah, dp.Harga, (dp.Jumlah * dp.Harga) AS TotalHarga "
                + "FROM pembelian p "
                + "JOIN distributor d ON p.IDDistributor = d.IDDistributor "
                + "JOIN employee e ON p.IDPegawai = e.IDEmployee "
                + "JOIN detailpembelian dp ON p.IDPembelian = dp.IDPembelian "
                + "JOIN produk pr ON dp.KodeProduk = pr.KodeProduk "
                + "WHERE p.IDPembelian = ? " // Tambahkan WHERE untuk IDPembelian
                + "UNION ALL "
                + "SELECT 'Penjualan' AS TransaksiType, "
                + "s.IDPenjualan AS TransaksiID, s.Tanggal AS TransaksiTanggal, "
                + "c.NamaPelanggan, e.NamaEmployee AS NamaPegawai, "
                + "dp.KodeProduk, pr.NamaProduk, dp.Jumlah, dp.Harga, (dp.Jumlah * dp.Harga) AS TotalHarga "
                + "FROM penjualan s "
                + "JOIN pelanggan c ON s.IDPelanggan = c.IDPelanggan "
                + "JOIN employee e ON s.IDPegawai = e.IDEmployee "
                + "JOIN detailpenjualan dp ON s.IDPenjualan = dp.IDPenjualan "
                + "JOIN produk pr ON dp.KodeProduk = pr.KodeProduk "
                + "WHERE s.IDPenjualan = ?"; // Tambahkan WHERE untuk IDPenjualan
        

                PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
                preparedStatement.setString(1, transactionId); // Assuming name is the transaction ID you want to search
                preparedStatement.setString(2, transactionId);

                ResultSet resultSet = preparedStatement.executeQuery();

                boolean found = false;

                while (resultSet.next()) {
                    found = true;
                    Vector<Object> row = new Vector<>();
                    for (int columnIndex = 1; columnIndex <= 4; columnIndex++) {
                        // Format Harga ke format mata uang Rupiah
                        if (columnIndex == 4) {
                            double Harga = resultSet.getDouble(columnIndex);
                            NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(
                                    new Locale.Builder().setLanguage("id").setRegion("ID").build());
                            row.add(formatRupiah.format(Harga));
                        } else {
                            row.add(resultSet.getObject(columnIndex));
                        }
                    }
                    tableModel.addRow(row);
                }

                if (!found) {
                    JOptionPane.showMessageDialog(null, "No matching Transactions found.",
                            "Search Result", JOptionPane.INFORMATION_MESSAGE);
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

}
