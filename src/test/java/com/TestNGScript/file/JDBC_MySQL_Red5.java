package com.TestNGScript.file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class JDBC_MySQL_Red5 {
	
@Test
	
	public void testMySQLDB() throws ClassNotFoundException, SQLException {
	
		
           Class.forName("com.mysql.jdbc.Driver");
			
		   System.out.println("MySQL Driver Loaded");
			
			Connection dbconnection=DriverManager.getConnection("jdbc:mysql://safety-kuvrr-red5pro.caybjakxkdgf.us-east-1.rds.amazonaws.com:3306/safety_kuvrr_red5pro","safetyred5pro","NS_KUVRR$12345");
			
			System.out.println("Connected to MySQL DB");
			
			Statement stmnt=dbconnection.createStatement();
			
			ResultSet rs=stmnt.executeQuery("SELECT * FROM safety_kuvrr_red5pro.auth_user WHERE last_name='Kumar'");
			
			while(rs.next())
			
			{
				
				int id=rs.getInt(1);
				System.out.println("Id:"+ id);
				
				String firstName=rs.getString("first_name");
				System.out.println("DataBase First name record is :"+ firstName);
				

				String lastName=rs.getString("last_name");
				System.out.println("DataBase Last name record is :"+ lastName);
				
				
				String email=rs.getString("email");
				System.out.println("DataBase Email record is :"+ email);
					
				
				
			}
			
			//Close DB Connection
			dbconnection.close();
			System.out.println("DataBase Connection closed");
	} 



}



