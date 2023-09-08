package com.service;

import java.sql.SQLException;
import java.util.List;

import com.emp.crud.Employee;

interface EmpServive {
	public List<Employee>getAllEmployee() throws SQLException;
	Integer add(Employee emp) throws SQLException;
	Integer delete(Integer id) throws SQLException;
	Integer update(Employee emp) throws SQLException;


}
