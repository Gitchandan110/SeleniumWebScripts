package com.TestNGScript.file;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Commonutills.file.ExcelCompare;

public class CompareTwoExcelData{
	
	String OrganizationSheet="Organization";
	
	
	@Test
	public void testExcelData() throws IOException {
		
	
		ExcelCompare.compareTwoSheet(OrganizationSheet);
	
		
		
			
	}

}
