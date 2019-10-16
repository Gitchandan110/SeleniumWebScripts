package com.TestNGScript.file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class JDBC_SelectAllTableData {
	
	
@Test
	
	public void testPostgresDB() throws ClassNotFoundException, SQLException {
		
		
           Class.forName("org.postgresql.Driver");
			
		   System.out.println("Database Driver Loaded");
			
			Connection dbconnection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/chandan","postgres","omsai11ram");
			
			System.out.println("Connected to PostGres SQL");
			
			Statement stmnt=dbconnection.createStatement();
			
			ResultSet rs=stmnt.executeQuery("select * from users order by id asc");
			
			while(rs.next())
			
			{
				
				String firstName=rs.getString("first_name");
				System.out.println("DataBase First name record is :"+ firstName);
				

				String lastName=rs.getString("last_name");
				System.out.println("DataBase Last name record is :"+ lastName);
				
				
				String email=rs.getString("email");
				System.out.println("DataBase Email record is :"+ email);
				
				
				String mobile=rs.getString("mobile_number");
				System.out.println("DataBase Mobile record is :"+ mobile);
				
			}
			
			//Close DB Connection
			dbconnection.close();
			System.out.println("DataBase Connection closed");
	} 



}



