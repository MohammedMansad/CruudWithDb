package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connections{

	public static Connection getConnection()
	{
		Connection connection = null;
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbc","root","root");
			//sprinig jdbc=dataBaseName
			 //root=username
			 //root=password
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return connection;
	}
}
