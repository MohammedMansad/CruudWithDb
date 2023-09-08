package com.emp.crud;

public class Employee {

	
	private Integer id;
	private String Name;
	private long phoneNumber;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Employee(Integer id, String name, long phoneNumber) {
		super();
		this.id = id;
		Name = name;
		this.phoneNumber = phoneNumber;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}/*
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", phoneNumber=" + phoneNumber + "]";
	}
	*/
	
	
	}
	

