package com.mrlong.dispatch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans_dispatch.xml");
	
		DBUtil dbUtil=(DBUtil) ac.getBean("dbutil");
		System.out.println(dbUtil.getDrivername()+" "+dbUtil.getName());
	
	}

}
