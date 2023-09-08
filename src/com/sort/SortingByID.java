package com.sort;

import java.util.Comparator;

import com.emp.crud.Employee;

public class SortingByID implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		
		if(emp1.getId()>emp2.getId())
		{
			return 1;
		}
		else if(emp1.getId()<emp2.getId())
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}
	
	
	
	
}
