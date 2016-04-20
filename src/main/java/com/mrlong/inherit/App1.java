package com.mrlong.inherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans_inherit.xml");
		Student student = (Student) ac.getBean("student");
		System.out.println("名字："+student.getName()+"  年龄："+student.getAge());

		Gradate gradate=(Gradate) ac.getBean("grdate");
		System.out.println("名字："+gradate.getName()+"  年龄："+gradate.getAge()+" 学位："+gradate.getDegree());
	}

}
