package view;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

import controller.MySQLConnection;


public class DashboardAdminprototype extends JFrame {

    public DashboardAdminprototype() {
        // Set up the JFrame
        setTitle("Admin Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 605);
        setLocationRelativeTo(null); // Center the frame on the screen

        // Create a panel for the dashboard components
        JPanel dashboardPanel = new JPanel();
        dashboardPanel.setLayout(new BorderLayout());

        // Add components to the panel
        JLabel welcomeLabel = new JLabel("Welcome, Admin!");
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        dashboardPanel.add(welcomeLabel, BorderLayout.NORTH);

        // Add a JButton to trigger the display of employee data
        JButton displayDataButton = new JButton("Display Employee Data");
        dashboardPanel.add(displayDataButton, BorderLayout.CENTER);

        // Add action listener to the displayDataButton
        displayDataButton.addActionListener(e -> {
            displayEmployeeData();
        });

        // Set the content pane of the frame
        setContentPane(dashboardPanel);
    }

    private void displayEmployeeData() {
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

                // Create a table model
                DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);

                // Create a JTable with the table model
                JTable table = new JTable(tableModel);

                // Add the JTable to a new JFrame using JScrollPane
                JFrame tableFrame = new JFrame("Employee Data");
                tableFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                tableFrame.setSize(500, 300);
                tableFrame.add(new JScrollPane(table));
                tableFrame.setVisible(true);

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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DashboardAdminprototype adminDashboard = new DashboardAdminprototype();
            adminDashboard.setVisible(true);
        });
    }
}
////