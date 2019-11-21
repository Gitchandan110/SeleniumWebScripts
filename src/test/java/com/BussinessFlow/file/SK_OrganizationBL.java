package com.BussinessFlow.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Commonutills.file.ExcelUtils;
import com.Commonutills.file.ExcelWrite;
import com.PageObjectRepository.file.SK_OrganizationPL;

public class SK_OrganizationBL extends SK_OrganizationPL {

	SK_OrganizationPL organizationpl;
	String OrganizationSheet = "Web_Organization";

	public void getOrgPageRowCount() {

		int OrgRowCount = totalRowOrganization().size();
		System.out.println("OrgRowCount are : " + OrgRowCount);

	}

	public void getOrgPageColumnCount() {
		int OrgColumnCount = columnHeaderOrganization().size();
		System.out.println("OrgColumnCount are : " + OrgColumnCount);

	}

	public void getColumnHeader() throws IOException {

		try {
			int OrgColumnCount = columnHeaderOrganization().size();
			for (int i = 1; i <= OrgColumnCount; i++) {
				String ColumnHeader = driver
						.findElement(By.xpath("//*[@id='content']//div//div[3]//table//thead//tr//td[" + i + "]"))
						.getText();
				System.out.println("Column Header are :" + ColumnHeader);

			//	ExcelWrite.writeInputDataExcel(OrganizationSheet, 0, i - 1, ColumnHeader);
				ExcelWrite.writeOutputDataExcel(OrganizationSheet, 0, i-1, ColumnHeader);
			}

		} catch (Exception ex) {

			System.out.println(ex);
		}
	}

	public void getOrganizationName() throws IOException {
		/*
		 * int OrgRowCount = totalRowOrganization().size(); for (int j = 1; j <=
		 * OrgRowCount; j++) { String OrgName = driver
		 * .findElement(By.xpath("//*[@id='content']//div//div[3]//table//tbody//tr[" +
		 * j + "]//td[3]")) .getText(); System.out.println("OrgName are :" + OrgName);
		 * ExcelWrite.writeAppDataExcel(OrganizationSheet, j, 2 , OrgName);
		 */

		int j = 1;
		while (totalRowOrganization().size() >= j) {

			String OrgName = driver
					.findElement(By.xpath("//*[@id='content']//div//div[3]//table//tbody//tr[" + j + "]//td[3]"))
					.getText();
			System.out.println("OrgName are :" + OrgName);
		//	ExcelWrite.writeInputDataExcel(OrganizationSheet, j, 2, OrgName);
			ExcelWrite.writeOutputDataExcel(OrganizationSheet, j, 2, OrgName);
			j++;

		}

	}

	public void getOrganizationAddress() throws IOException {

		int OrgRowCount = totalRowOrganization().size();
		for (int i = 1; i <= OrgRowCount; i++) {

			String orgAddress = driver
					.findElement(By.xpath("//*[@id='content']//div//div[3]//table//tbody//tr[" + i + "]//td[4]"))
					.getText();
			System.out.println("orgAddress are :" + orgAddress);

		//	ExcelWrite.writeInputDataExcel(OrganizationSheet, i, 3, orgAddress);
			ExcelWrite.writeOutputDataExcel(OrganizationSheet, i, 3, orgAddress);
		}

	}

	public void getOrganizationCity() throws IOException {

		for (int i = 1; i <= totalRowOrganization().size(); i++) {

			String orgCity = driver
					.findElement(By.xpath("//*[@id='content']//div//div[3]//table//tbody//tr[" + i + "]//td[5]"))
					.getText();

			System.out.println("orgCity are :" + orgCity);

		//	ExcelWrite.writeInputDataExcel(OrganizationSheet, i, 4, orgCity);
			ExcelWrite.writeOutputDataExcel(OrganizationSheet, i, 4, orgCity);
		}

	}

	public void getOrganizationState() throws IOException {

		int OrgRowCount = totalRowOrganization().size();
		for (int i = 1; i <= OrgRowCount; i++) {

			String orgState = driver
					.findElement(By.xpath("//*[@id='content']//div//div[3]//table//tbody//tr[" + i + "]//td[6]"))
					.getText();

			System.out.println("orgState are :" + orgState);

		//	ExcelWrite.writeInputDataExcel(OrganizationSheet, i, 5, orgState);
			ExcelWrite.writeOutputDataExcel(OrganizationSheet, i, 5, orgState);
		}

	}

	public void getOrganizationPostalCode() throws IOException {

		int OrgRowCount = totalRowOrganization().size();
		for (int i = 1; i <= OrgRowCount; i++) {

			String orgPostalCode = driver
					.findElement(By.xpath("//*[@id='content']//div//div[3]//table//tbody//tr[" + i + "]//td[7]"))
					.getText();

			System.out.println("orgPostalCode are :" + orgPostalCode);

			ExcelWrite.writeOutputDataExcel(OrganizationSheet, i, 6, orgPostalCode);

		}

	}

	public void getOrganizationCountry() throws IOException {

		int OrgRowCount = totalRowOrganization().size();
		for (int i = 1; i <= OrgRowCount; i++) {

			String orgCountry = driver
					.findElement(By.xpath("//*[@id='content']//div//div[3]//table//tbody//tr[" + i + "]//td[8]"))
					.getText();

			System.out.println("orgCountry are :" + orgCountry);

			ExcelWrite.writeOutputDataExcel(OrganizationSheet, i, 7, orgCountry);

		}

	}

	public void getOrganizationStatus() throws IOException {

		int OrgRowCount = totalRowOrganization().size();
		for (int i = 1; i <= OrgRowCount; i++) {

			String orgStatus = driver
					.findElement(By.xpath("//*[@id='content']//div//div[3]//table//tbody//tr[" + i + "]//td[9]"))
					.getText();

			System.out.println("orgStatus are :" + orgStatus);

			ExcelWrite.writeOutputDataExcel(OrganizationSheet, i, 8, orgStatus);

		}

	}

}
