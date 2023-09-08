package com.sort;

import java.util.Comparator;

import com.emp.crud.Employee;

public class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		int compareByName = emp1.getName().compareTo(emp2.getName());
		int compareById = emp1.getId().compareTo(emp2.getId());
		
		return (compareByName==0)?compareByName:compareById;
	}

/*
	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		
		
		return emp1.getName().compareTo(emp2.getName());
	}
*/
}
