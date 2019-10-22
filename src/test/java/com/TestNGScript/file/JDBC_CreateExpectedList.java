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

public class JDBC_CreateExpectedList {
	
	String DBDataSheet="DBData";

	@Test

	public void testPostgresDB() throws ClassNotFoundException, SQLException, IOException {

		//To activate and load Database Driver;
		
		Class.forName("org.postgresql.Driver");

		System.out.println("Database Driver Loaded");
		
        //After loading db driver now establish db connection
		
		Connection dbconnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/chandan", "postgres",
				"omsai11ram");

		System.out.println("Connected to PostGres SQL");

		//1) DB driver Loaded 2) DB Connected 3) Now Create Query Statement
		
		Statement stmnt = dbconnection.createStatement();

		// Now execute query and Save Result under ResultSet
		
		ResultSet rs = stmnt.executeQuery("select * from users order by id asc");
		
	    int cc=rs.getMetaData().getColumnCount();
	    
	    System.out.println("Column Count is : "+ cc);

		List<String> ExpectedList = new ArrayList<>();

		String tableData;
		
		while (rs.next()) {
			tableData = rs.getInt(1) + "::" + rs.getString(2).trim() + "::" + rs.getString(3).trim() + "::"
					+ rs.getString(4).trim() + "::" + rs.getLong(5) + "::" + rs.getLong(6) + "::" + rs.getString(7);
			System.out.println("Table Data is :" + tableData);
			
			ExpectedList.add(tableData);
		}
		
		for (int rowNum=0; rowNum< ExpectedList.size(); rowNum++) {
			System.out.println("List val at row : "+ rowNum +" is "+ ExpectedList.get(rowNum));
			ExcelWrite.writeExcel(DBDataSheet, rowNum, 0 , ExpectedList.get(rowNum));
		}

		// Close DB Connection
		dbconnection.close();
		System.out.println("DataBase Connection closed");
	}

}
