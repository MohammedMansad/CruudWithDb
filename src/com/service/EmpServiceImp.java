package com.service;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import com.Dao.EmpDaoImp;
import com.emp.crud.Employee;

public class EmpServiceImp implements EmpServive {

	@Override
	public List<Employee> getAllEmployee() throws SQLException {
		// TODO Auto-generated method stub
		
		EmpDaoImp  daoImpl=new EmpDaoImp();
		
		return daoImpl.getAllEmployee();
	}

	@Override
	public Integer add(Employee emp) throws SQLException {
		// TODO Auto-generated method stub
		int status=1;
		EmpDaoImp  daoImpl=new EmpDaoImp();
		List<Employee> allEmployee = daoImpl.getAllEmployee();
		Iterator<Employee> iterator = allEmployee.iterator();
		while(iterator.hasNext())
		{
			Employee e = iterator.next();
			if(e.getId()==emp.getId())
			{
				status=0;
			}
		}
		if(status>0)
		{
			daoImpl.add(emp);
		}
		return status;
	}

	@Override
	public Integer delete(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		int status = 0;
		EmpDaoImp  daoImpl=new EmpDaoImp();
		List<Employee> allEmployee = daoImpl.getAllEmployee();
		Iterator<Employee> iterator = allEmployee.iterator();
		while(iterator.hasNext())
		{
			Employee emp = iterator.next();
			if(emp.getId()==id)
			{
				status=1;
			}
		}
		if(status>0)
		{
			daoImpl.delete(id);
		}
		return status;
	}

	@Override
	public Integer update( Employee emp) throws SQLException {
		// TODO Auto-generated method stub
		int status=0;
		EmpDaoImp  daoImpl=new EmpDaoImp();
		
		List<Employee> allEmployee = daoImpl.getAllEmployee();
		Iterator<Employee> iterator = allEmployee.iterator();
		while(iterator.hasNext())
		{
			Employee e = iterator.next();
			if(e.getId()==emp.getId())
			{
				status=1;
			}
			
		}
		if(status>0)
		{
			daoImpl.update(emp);
		}
		return status;
	}
	
	
}
