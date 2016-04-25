package com.mrlong.autowire;

public class Master {

	private String name;
	private Dog dog;
	
	public Master(Dog dog) {
		// TODO Auto-generated constructor stub
		System.out.println("master构造被调用");
	this.dog=dog;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
}
