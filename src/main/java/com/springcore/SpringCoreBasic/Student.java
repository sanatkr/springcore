package com.springcore.SpringCoreBasic;

public class Student {
	
	int id;
	String name;
	String address;
	Department department;
	
	public Student(){
		
	}
	
	
	public Student(int id, String name, String address) {
		System.out.println("Student class constructor called");
		this.id = id;
		this.name = name;
		this.address = address;
	}
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("setter called to set id");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setter called to set name");
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		System.out.println("setter called to set address");
		this.address = address;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", department=" + department + "]";
	}


	
	
	
	

}
