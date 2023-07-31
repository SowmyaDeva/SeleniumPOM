package utils;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadFromExcel{
	
	public static String[][] readData(String fileName) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int rowNum = sheet.getLastRowNum();
		int colNum = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowNum][colNum];
		for (int i = 1; i <= rowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colNum; j++) {
				String value = row.getCell(j).getStringCellValue();
				data[i-1][j]= value;
			}
		}
		wb.close();
		return data;

	}

}
