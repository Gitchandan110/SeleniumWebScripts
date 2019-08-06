package com.Commonutills.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractice {
	
	static File path= new File("C:\\Users\\Chandan\\git\\repository\\ArtifactMaven\\Test Data\\TestData.xlsx");	

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream(path);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Login");
		
		
		
	
		

	
	
	
	
	}

}
