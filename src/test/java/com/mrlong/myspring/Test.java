package com.mrlong.myspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用传统的方法
//		UserService name = new UserService();
//		name.setName("张三");
//		name.sayHello();
		//使用spring
		ApplicationContext aContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) aContext.getBean("userService");
		userService.sayHello();
	}

}
