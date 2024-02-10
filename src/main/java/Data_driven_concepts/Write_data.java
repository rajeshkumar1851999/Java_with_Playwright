package Data_driven_concepts;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * This class demonstrates how to write data to an Excel file using Apache POI.
 */
public class Write_data {

    /**
     * The main method to run the Excel data writing example.
     *
     * @param args Command line arguments (not used in this example).
     * @throws IOException If an I/O error occurs.
     */
    public static void main(String[] args) throws IOException {
        // Create a new workbook and sheet
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet1");

        // Define sample data for headings and a row
        String[] headings = {"Name", "Age", "City", "Occupation", "Salary"};
        String[] rowValues = {"Rajesh", "25", "USA", "Software Engineer", "35000"};

        // Write headings to the first row
        Row row1 = sheet.createRow(0);
        for (int i = 0; i < headings.length; i++) {
            Cell cell = row1.createCell(i);
            cell.setCellValue(headings[i]);
        }

        // Write data to the second row
        Row row2 = sheet.createRow(1);
        for (int i = 0; i < rowValues.length; i++) {
            Cell cell = row2.createCell(i);
            cell.setCellValue(rowValues[i]);
        }

        // Save the workbook to a file
        try (FileOutputStream fileOut = new FileOutputStream("Datadriven_atit.xlsx")) {
            workbook.write(fileOut);
        }
    }
}
