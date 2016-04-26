package com.mrlong.aop;

import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestListener;

public class Test1Service implements TestServiceInter ,TestServiceInter2 {
	
	private String name;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void sayhello() {
		// TODO Auto-generated method stub
		System.out.println("hi  "+name);
	}


	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("Bye  "+name);

	}

}
