package com.Commonutills.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static File Path = new File("C:\\Users\\Chandan\\git\\repository\\ArtifactMaven\\Test Data\\TestData.xlsx");
		
	public static String ReadExcel(String sheetName, int rownum, int cellnum) throws IOException {

		FileInputStream fis = new FileInputStream(Path);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		//System.out.println("Row data:" + sheet.getRow(rownum).getCell(cellnum));
		return sheet.getRow(rownum).getCell(cellnum).toString();

	}

	public static String WriteExcel(String sheetName, int rownum, int cellnum) throws IOException {

	
		FileInputStream fis = new FileInputStream(Path);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		sheet.getRow(rownum).createCell(cellnum).setCellValue("Pass");
		FileOutputStream fos = new FileOutputStream(Path);
		workbook.write(fos);
		fos.close();
		return sheetName;

	}

}