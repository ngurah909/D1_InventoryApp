package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AuthenticationController {

    public static String authenticateAndGetEmployeeType(String username, String password) {
        Connection connection = MySQLConnection.getConnection();

        if (connection != null) {
            try {
                String query = "SELECT EmployeeType FROM Employee WHERE Username = ? AND Password = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);

                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);

                ResultSet resultSet = preparedStatement.executeQuery();

                // Check if there is a matching username and password
                if (resultSet.next()) {
                    return resultSet.getString("EmployeeType");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                MySQLConnection.closeConnection();
            }
        } else {
            System.out.println("Failed to connect to the database!");
        }

        return null;
    }
}