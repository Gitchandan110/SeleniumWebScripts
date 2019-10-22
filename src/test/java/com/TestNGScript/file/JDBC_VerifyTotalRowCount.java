package com.TestNGScript.file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class JDBC_VerifyTotalRowCount {

	@Test

	public void testPostgresDB() throws ClassNotFoundException, SQLException {

		Class.forName("org.postgresql.Driver");

		System.out.println("Database Driver Loaded");

		Connection dbconnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/chandan", "postgres",
				"omsai11ram");

		System.out.println("Connected to PostGres SQL");

		Statement stmnt = dbconnection.createStatement();

		ResultSet rs = stmnt.executeQuery("select count(*) from users");
	//	ResultSet rs = stmnt.executeQuery("select count(*) AS first_name from users");
		rs.next();
		
	//	int count = rs.getInt("first_name");
		int count = rs.getInt(1);
		rs.close();

		System.out.println("Total Row Count is : " + count);
		
	}
}
