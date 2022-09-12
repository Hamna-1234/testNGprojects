package seleniumwebdriver1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C://Excel Files/data.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		
		XSSFSheet sheet =workbook.getSheet("sheet1");
		
		int rows=sheet.getLastRowNum();
		int columns =sheet.getRow(0).getLastCellNum();
		
		System.out.println(rows);
		System.out.println(columns);

	}

}
