package MyPreparation.zExperimentPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Converter {
  private static final String FILE_NAME = "/Users/mohantyn/Downloads/journalmodel.xlsx";

  @SuppressWarnings("deprecation")
  public static void main(String[] args) {

    try {

      FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
      Workbook workbook = new XSSFWorkbook(excelFile);
      Sheet datatypeSheet = workbook.getSheetAt(0);
      Iterator<Row> iterator = datatypeSheet.iterator();

      while (iterator.hasNext()) {

        Row currentRow = iterator.next();
        Iterator<Cell> cellIterator = currentRow.iterator();

        String attrName = currentRow.getCell(0).toString();

        if (attrName.trim().length() == 0) {
          continue;
        }

        char[] charters = attrName.toCharArray();
        charters[0] = Character.toLowerCase(charters[0]);
        attrName = new String(charters);

        String dataType = "";
        if (currentRow.getCell(1).toString().contains("Text")) dataType = "String";
        else if (currentRow.getCell(1).toString().contains("Numeric")) dataType = "int";
        else if (currentRow.getCell(1).toString().contains("Date")) dataType = "LocalDate";
        System.out.print("private " + dataType + " " + attrName + ";");
        //
        System.out.println();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
