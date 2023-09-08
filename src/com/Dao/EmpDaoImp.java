package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connection.Connections;
import com.emp.crud.Employee;

public class EmpDaoImp implements EmpDao {

	@Override
	public List<Employee> getAllEmployee() throws SQLException {
		// TODO Auto-generated method stub
		
		List<Employee>empList=new ArrayList<>();
		Connection connection = Connections.getConnection();
		Statement createStatement = connection.createStatement();
		String s="Select * from employee";
		ResultSet executeQuery = createStatement.executeQuery(s);
		while(executeQuery.next())
		{
			Employee emp=new Employee();
			emp.setId(executeQuery.getInt(1));
			emp.setName(executeQuery.getString(2));
			emp.setPhoneNumber(executeQuery.getLong(3));
			empList.add(emp);
		}
		
		return empList;
	}

	@Override
	public Integer add(Employee emp) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = Connections.getConnection();
		String s="Insert into employee(id,name,PhoneNumber)values(?,?,?)";
		PreparedStatement prepareStatement = connection.prepareStatement(s);
		prepareStatement.setInt(1,emp.getId());
		prepareStatement.setString(2,emp.getName());
		prepareStatement.setFloat(3, emp.getPhoneNumber());
		int rowsInserted = prepareStatement.executeUpdate();
		return rowsInserted;
	}

	@Override
	public Integer delete(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection connection = Connections.getConnection();
		String s="DELETE from employee where id=?";
		PreparedStatement prepareStatement = connection.prepareStatement(s);
		prepareStatement.setInt(1,id);
		int rowsInserted = prepareStatement.executeUpdate();
		return rowsInserted;
	}
	//id,name,PhoneNumber
	@Override
	public Integer update( Employee emp) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = Connections.getConnection();
		String s="UPDATE employee SET name=?, PhoneNumber=? WHERE id=?";
		PreparedStatement prepareStatement = connection.prepareStatement(s);
		prepareStatement.setString(1, emp.getName());
		prepareStatement.setLong(2, emp.getPhoneNumber());
		prepareStatement.setInt(3, emp.getId());
		
		
		int rowsInserted = prepareStatement.executeUpdate();
		if(rowsInserted>0)
		{
			System.out.println("updated  Succesfully to the database");
		}
		else
		{
			System.out.println("Not updated any records");
		}
		
		
		return rowsInserted;
	}

	
}





