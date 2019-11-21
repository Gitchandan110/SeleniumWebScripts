package com.TestNGScript.file;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.Commonutills.file.ExcelWrite;

public class JDBC_ExportDB_ExcelSheet {

	String OutputDataSheet = "OutputData";

	@Test

	public void ExportDBtoExcel() throws ClassNotFoundException, SQLException, IOException {

		Class.forName("org.postgresql.Driver");

		Connection dbconnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/chandan", "postgres",
				"omsai11ram");

		Statement stmnt = dbconnection.createStatement();

		ResultSet rs = stmnt.executeQuery("select * from users order by id asc");

		int cellcount = rs.getMetaData().getColumnCount();

		System.out.println("Column Count is : " + cellcount);

		for (int headrcount = 1; headrcount <= cellcount; headrcount++) {

			String headerVal = rs.getMetaData().getColumnName(headrcount).trim();
			ExcelWrite.writeOutputDataExcel(OutputDataSheet, 0, headrcount - 1, headerVal);
			System.out.println("Column Name is :" + headerVal);
		}

		String cellData;
		List<String> rowList = new ArrayList<>();
		List<List<String>> allRowList = new ArrayList<>();

		while (rs.next()) {
			rowList = new ArrayList<>();
			for (int cell = 1; cell <= cellcount; cell++) {
				cellData = rs.getString(cell).trim();
				System.out.println("Cell Data at index " + cell + " is :" + cellData);
				rowList.add(cellData);
			}
			allRowList.add(rowList);

		}

		/*
		 * int rn=1; for (int row = 0; row < allRowList.size(); row++) { List<String>
		 * rowValue = new ArrayList<>(); rowValue=allRowList.get(row);
		 * System.out.println("rowValue at index "+ row + " is " + rowValue); for (int
		 * column = 0; column < rowValue.size(); column++) {
		 * System.out.println("Column data is :"+ rowValue.get(column).trim());
		 * ExcelWrite.writeDBDataExcel(DBDataSheet, rn, column ,
		 * rowValue.get(column).trim()); } rn++; }
		 */

		// Now Enter allRowList array data in Excel Sheet

		Integer sheetRow = 1, sheetColumn;
		for (List<String> rowData : allRowList) {
			sheetColumn = 0;
			for (String columndata : rowData) {
				ExcelWrite.writeOutputDataExcel(OutputDataSheet, sheetRow, sheetColumn, columndata.trim());
				sheetColumn++;
			}
			sheetRow++;
		}

	}

}