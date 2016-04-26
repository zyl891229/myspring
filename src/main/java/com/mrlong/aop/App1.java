package com.mrlong.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans_aop.xml");
		TestServiceInter tService = ac.getBean("proxyFactoryBean", TestServiceInter.class);
		tService.sayhello();
		((TestServiceInter2)tService).sayBye();
	}
}
