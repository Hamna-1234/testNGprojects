package excelReadAndWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("C://Excel Files/data123.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook();
		XSSFSheet sheet =workbook.createSheet("data1");
		
		for(int r=0;r<=5;r++)
		{
			XSSFRow row=sheet.createRow(r);
			
			for(int c=0;c<3;c++)
			{
				row.createCell(c).setCellValue("wdfsgrh");
			}
			
		}
		
		
		workbook.write(file);
		System.out.println("succefully written");
		
		
		
		
		

	}

}
