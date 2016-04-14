package com.mrlong.ioc;

public class Student {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Student(){
		System.out.println("student 实例化");
	}
	//有一个默认的无参数的
}
