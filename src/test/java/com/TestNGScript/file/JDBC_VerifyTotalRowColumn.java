package com.TestNGScript.file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_VerifyTotalRowColumn {

	public void testPostgresDB() throws ClassNotFoundException, SQLException {

		Class.forName("org.postgresql.Driver");

		System.out.println("Database Driver Loaded");

		Connection dbconnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/chandan", "postgres",
				"omsai11ram");

		System.out.println("Connected to PostGres SQL");

		Statement stmnt = dbconnection.createStatement();

		ResultSet rs = stmnt.executeQuery("select * from users");

		while (rs.next())

		{

		}
	}
}
