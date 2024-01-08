package controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class DataExporter {

    public static void exportToTxt(Vector<Vector<Object>> data, Vector<String> columnNames, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Write column names
            for (String columnName : columnNames) {
                writer.write(columnName);
                writer.write("\t");
            }
            writer.write("\n");

            // Write data rows
            for (Vector<Object> row : data) {
                for (Object cell : row) {
                    writer.write(cell.toString());
                    writer.write("\t");
                }
                writer.write("\n");
            }

            System.out.println("Data exported to " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
