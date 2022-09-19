package com.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData  {
	  File  file;
	  FileInputStream fis;
	  XSSFWorkbook wb;
	 
	  
	  
	  XSSFSheet sheet;
	
	public String path = "D:\\Dipesh\\Velocity\\eclipse-workspace\\DataProvider.zip_expanded\\DataProvider\\src\\main\\java\\com\\qa\\testData\\faceBook.xlsx";
	
	// normal way for featching stata 
	public String readExcellData (int sheetN, int row, int cell) throws IOException {
		
		file = new File(path);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(sheetN);
		String data = sheet.getRow(row).getCell(cell).getStringCellValue();
		return data;	
	}
	
	// last row count 
	public int lastRowN (int sheetN) throws IOException {
		file = new File (path);
		fis = new FileInputStream (file);
		wb = new XSSFWorkbook (fis);
		sheet = wb.getSheetAt(sheetN);
		
		int lastrownum = sheet.getLastRowNum();
		return lastrownum;
	}
	
    // last cell count 
	
	public int lastCellN (int sheetN, int row) throws IOException {
		file = new File (path);
		fis = new FileInputStream (file);
		wb = new XSSFWorkbook (fis);
	    sheet = wb.getSheetAt(sheetN);
		
		int lastcellnum =sheet.getRow(row).getLastCellNum();
		return lastcellnum;
	}
}








