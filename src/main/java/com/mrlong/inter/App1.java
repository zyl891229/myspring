package com.mrlong.inter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext aContext = new ClassPathXmlApplicationContext("beans_inter.xml");
//		UpperLetter changeLetter = (UpperLetter) aContext.getBean("changeLette");
//		System.out.println(changeLetter.change());
		ChangeLetter changeLetter1 = (ChangeLetter) aContext.getBean("changeLette");
		System.out.println(changeLetter1.change());

	}
}
