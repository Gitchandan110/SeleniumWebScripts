package com.TestNGScript.file;

import static org.testng.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.Test;

public class JDBC_VerifyEmailData {
	
	int columnNumber;

	@Test

	public void testPostgresDB() throws ClassNotFoundException, SQLException {

		Class.forName("org.postgresql.Driver");

		System.out.println("Database Driver Loaded");

		Connection dbconnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/chandan", "postgres",
				"omsai11ram");

		System.out.println("Connected to PostGres SQL");

		Statement stmnt = dbconnection.createStatement();

		ResultSet rs = stmnt.executeQuery("select email from users where id = 7");
		ResultSetMetaData rsmd=rs.getMetaData();
		columnNumber=rsmd.getColumnCount();
		System.out.println("columnNumber is : "+ columnNumber);
		
		while(rs.next())
			
		{
		
		String email=rs.getString("email").trim();
		assertEquals(email, "Mi@yopmail.com");
		System.out.println("Email is :" + email);
	
		}
	}

}