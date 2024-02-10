package Data_driven_concepts;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read_data {


    public static void main(String[] args) throws IOException {

        String filePath = "Datadriven_tit.xlsx";

        // Create a FileInputStream to read the Excel file
        FileInputStream fis = new FileInputStream(filePath);

        // Create a Workbook instance
        Workbook workbook = WorkbookFactory.create(fis);

        // Assuming your data is in the first sheet
        Sheet sheet = workbook.getSheetAt(0);

        // Iterate through rows and columns to read data
        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.print(cell.getStringCellValue() + "\t");
            }
            System.out.println(); // Move to the next line after each row
        }

        // Close the workbook and the FileInputStream
        workbook.close();
        fis.close();





    }






}
