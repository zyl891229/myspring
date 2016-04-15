package com.mrlong.beanlife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext aContext = new ClassPathXmlApplicationContext("beans_beanlife.xml");
		PersonService personService  = aContext.getBean("personService",PersonService.class);
		personService.sayHi();

	}
}
