package controller;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Vector;

public class EmployeeDataController {

    public static void displayEmployeeData(DefaultTableModel tableModel, JPanel jPanel) {
        Connection connection = MySQLConnection.getConnection();

        if (connection != null) {
            try {
                String selectQuery = "SELECT IDEmployee, NamaEmployee, Jabatan, Gaji FROM Employee";
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
}
