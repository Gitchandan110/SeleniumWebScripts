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

	String DBDataSheet = "DBData";

	@Test

	public void ExportDBtoExcel() throws ClassNotFoundException, SQLException, IOException {

		Class.forName("org.postgresql.Driver");

		Connection dbconnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/chandan", "postgres",
				"omsai11ram");

		Statement stmnt = dbconnection.createStatement();

		ResultSet rs = stmnt.executeQuery("select * from users order by id asc");

		int cc = rs.getMetaData().getColumnCount();

		System.out.println("Column Count is : " + cc);

		for (int i = 1; i <= cc; i++) {

			String headerVal = rs.getMetaData().getColumnName(i).trim();
			ExcelWrite.writeExcel(DBDataSheet, 0, i - 1, headerVal);
			System.out.println("Column Name is :" + headerVal);
		}

		String rowData;
		List<String> rowList = new ArrayList<>();
		List<List<String>> allRowList = new ArrayList<>();
		
		while (rs.next()) {
			rowList = new ArrayList<>();
			for (int j = 1; j <= cc; j++) {
				rowData = rs.getString(j).trim();
				System.out.println("Row Data at index "+ j + " is :" + rowData);
				rowList.add(rowData);				
			}
			allRowList.add(rowList);

		}
		
		
		int rn=1;
		for (int row = 0; row < allRowList.size(); row++) {
			List<String> rowValue = new ArrayList<>();
			rowValue=allRowList.get(row);
			System.out.println("rowValue at index "+ row + " is " + rowValue);
			for (int column = 0; column < rowValue.size(); column++) {
				System.out.println("Column data is :"+ rowValue.get(column).trim());						
				ExcelWrite.writeExcel(DBDataSheet, rn, column , rowValue.get(column).trim());				
			}
			rn++;
		}

		
		
		
		
	}

}