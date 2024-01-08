package controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/inventoryapp";
    private static final String USERNAME = "BagusSutha";
    private static final String PASSWORD = "bagussutha123#";

    // JDBC variables for opening, closing and managing connection
    private static Connection connection;

    // Method to establish a connection to the database
    public static Connection getConnection() {
        try {
            // If the connection is not established, create a new one
            if (connection == null || connection.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    // Method to close the connection
    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Example of using the connection
        Connection dbConnection = MySQLConnection.getConnection();
        if (dbConnection != null) {
            System.out.println("Connected to the database!");
            // Perform database operations here
            // ...

            // Close the connection when done
            MySQLConnection.closeConnection();
        } else {
            System.out.println("Failed to connect to the database!");
        }
    }
}
