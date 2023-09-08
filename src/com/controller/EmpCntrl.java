package com.controller;

import java.sql.SQLException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.emp.crud.Employee;
import com.service.EmpServiceImp;
import com.sort.SortByName;
import com.sort.SortingByID;

public class EmpCntrl {

	public static void main(String[] args) throws SQLException {
		
		EmpServiceImp  serviceImpl=new EmpServiceImp();
		
		//get all Employee
/*
		List<Employee> allEmployee = serviceImpl.getAllEmployee();
		System.out.println("Before Sorting");
		Iterator<Employee> iterator = allEmployee.iterator();
		
		
		while(iterator.hasNext())//3 //2   //1
		{
			Employee emp= iterator.next();//1 v  //2V  // 3V
			if(emp.getId()!=104)
			{
				System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getPhoneNumber());

			}
			
			
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("After Sorting");
		Collections.sort(allEmployee,new SortingByID());
		Iterator<Employee> iterator1 = allEmployee.iterator();
		
		
		while(iterator1.hasNext())//3 //2   //1
		{
			Employee emp= iterator1.next();//1 v  //2V  // 3V
			if(emp.getId()!=104)
			{
				System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getPhoneNumber());

			}
			
			
		}
	
		*/
		
		//save
		
		
		Employee emp=new Employee();
		emp.setId(110);
		emp.setName("lock");
		emp.setPhoneNumber(8585483);
		Integer status = serviceImpl.add(emp);
		if(status==0)
		{
			System.out.println("Not Addd to database");
		}
		else
		{
			System.out.println("Successfully added  to database");
			List<Employee> empSave = serviceImpl.getAllEmployee();
			System.out.println("Befor  sorting");
			System.out.println("________________________________________________________________________________");
			for(int i=0;i<empSave.size();i++)
			{
			Employee e = empSave.get(i);
			System.out.println(e.getId()+" "+e.getName()+" "+e.getPhoneNumber());
			
			}
			System.out.println("After  Sorting");
			System.out.println("________________________________________________________________________________");
			Collections.sort(empSave,new SortByName());
			for(int i=0;i<empSave.size();i++)
			{
			Employee e = empSave.get(i);
			System.out.println(e.getId()+" "+e.getName()+" "+e.getPhoneNumber());
			
			}
		}
			
		
		
		
	
		
		
		//delete
		
	/*
		int id = 104;
		Integer status = serviceImpl.delete(id);
		if(status==0)
		{
			System.out.println("Not deleted Any Records");
		}
		else
		{
			System.out.println("Succesfully deleted the records");
			List<Employee> empDelete = serviceImpl.getAllEmployee();
			for (Employee empD : empDelete) {
				System.out.println(empD.getId()+" "+empD.getName()+" "+empD.getPhoneNumber());
			}

		}
				
		*/
		
		//update
	/*
		Employee emp=new Employee();
		emp.setId(102);
		emp.setName("ziyad");
		emp.setPhoneNumber(33131);
		Integer status = serviceImpl.update(emp);
		if(status==0)
		{
			System.out.println("Not updated any records");
		}
		else
		{
			System.out.println("Updated  Succesfully");
			 serviceImpl.getAllEmployee().forEach(x->{System.out.println(x.getId()+" "+x.getName()+x.getPhoneNumber()); });
		}
		   
		*/
		
	}

}
