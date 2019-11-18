package com.Commonutills.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	static File PathAppData = new File("C:\\Users\\Chandan\\Git\\ArtifactMaven\\Test Data\\AppData.xlsx");
	static File PathDBData = new File("C:\\Users\\Chandan\\Git\\ArtifactMaven\\Test Data\\DBData.xlsx");

	public static void writeAppDataExcel(String sheetname, int rownum, int cellnum,  String celldata)
			throws IOException {
		try {
			FileInputStream fis = new FileInputStream(PathAppData);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet(sheetname);
			Row row = sheet.getRow(rownum);
			if(row==null) {
			row = sheet.createRow(rownum);
			}
			Cell cell = row.createCell(cellnum);
			cell.setCellValue(celldata);
			FileOutputStream fos = new FileOutputStream(PathAppData);
			workbook.write(fos);
			workbook.close();
		
		} catch (Exception ex) {
			System.out.println("Exception caught in Write Excel is: "+ ex);

		}
	}
	
	public static void writeDBDataExcel(String sheetname, int rownum, int cellnum,  String celldata)
			throws IOException {
		try {
			FileInputStream fis = new FileInputStream(PathDBData);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet(sheetname);
			Row row = sheet.getRow(rownum);
			if(row==null) {
			row = sheet.createRow(rownum);
			}
			Cell cell = row.createCell(cellnum);
			cell.setCellValue(celldata);
			FileOutputStream fos = new FileOutputStream(PathDBData);
			workbook.write(fos);
			workbook.close();
		} catch (Exception ex) {
			System.out.println("Exception caught in Write Excel is: "+ ex);

		}
	}
	
}
