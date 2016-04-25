package com.mrlong.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans_autowire.xml");
		//获取
		Master master=ac.getBean("master",Master.class);
		System.out.println(master.getName()+" 养了一只 "+master.getDog().getName());
	}

}
