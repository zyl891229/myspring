package com.mrlong.inter;

public class LowwerLetter implements ChangeLetter {
	private String str;
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String change() {
		// TODO Auto-generated method stub
		return str.toLowerCase();
	}

}
