package com.mrlong.myspring;

public class ByeService {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sayBye() {
		System.out.println("bye "+name);
	}

}
