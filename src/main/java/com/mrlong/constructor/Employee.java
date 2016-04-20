package com.mrlong.constructor;
public class Employee {
	private String name;
	private int id;
	
	public Employee() {
	}
	
	public Employee(String name, int id) {
		System.out.println("public Employee(String name, int id)");
		this.name = name;
		this.id = id;
	}
	
	public Employee(String name) {
		System.out.println("public Employee(String name)");
		this.name = name;
	}
	
	
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
}
