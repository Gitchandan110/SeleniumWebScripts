package com.TestNGScript.file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class JDBC_InsertData {

	@Test

	public void testPostgresDB() throws ClassNotFoundException, SQLException {

		Class.forName("org.postgresql.Driver");

		System.out.println("Database Driver Loaded");

		Connection dbconnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/chandan", "postgres",
				"omsai11ram");

		System.out.println("Connected to PostGres SQL");

		Statement stmnt = dbconnection.createStatement();

		String query="insert into users values (7, 'Mi','kuvrr','Mi@yopmail.com', 5435465632, 12345678, 'sk')";
		
		stmnt.executeUpdate(query);

		System.out.println("Insert Data done successfull verify DB");

		// Close DB Connection
		dbconnection.close();
		System.out.println("DataBase Connection closed");

	}

}
