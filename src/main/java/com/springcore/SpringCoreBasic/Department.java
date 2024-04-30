package com.springcore.SpringCoreBasic;

import org.springframework.stereotype.Component;

@Component("dept")
public class Department {
	
	int id;
	String name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

}
