package Genericlib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excellib {

	File filepath = new File("C:\\DevOps\\Testcase.xlsx");
	
	public String getExcelData(String sheetName, int rowNum, int cellNum) throws Exception {
		
		FileInputStream Fis = new FileInputStream(filepath);
		
		//open workbook in a readable format
		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		
		//getting sheet
		XSSFSheet sheet = workbook.getSheet(sheetName);
		
		//row
		XSSFRow row = sheet.getRow(rowNum);
		
		//get data from the cell
		String data = row.getCell(cellNum).getStringCellValue();
		System.out.println("Data from Excel file is = " + data);
		return data;	
	}
	
	public void setExcelData(String sheetName, int rowNum, int cellNum, String data) throws Exception{
		
		FileInputStream fis = new FileInputStream(filepath);
		
		//open workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//get sheet
		XSSFSheet sheet= workbook.getSheet(sheetName);
		
		//get row
		XSSFRow row = sheet.getRow(rowNum);
		
		//get cell
		XSSFCell cell = row.createCell(cellNum);
		
		
		FileOutputStream fos = new FileOutputStream(filepath);
		cell.setCellValue(data);
		workbook.write(fos);
		
		//now close the workbook
		workbook.close();
		
		
	}
}
