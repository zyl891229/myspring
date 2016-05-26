package com.mrlong.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello spring! from outofmemory.cn
 *
 */
public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans_annotation.xml");
		PersonService service = appContext.getBean(PersonService.class);
		Person p = service.getPerson(1);
		System.out.println(p.getName());
	}
}