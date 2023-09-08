package com.emp.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeesConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbc","root","root");
			
			System.out.println("Hello");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		//Statement createStatement = connection.createStatement();
		
	}
	
}
