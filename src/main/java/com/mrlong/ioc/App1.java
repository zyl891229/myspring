package com.mrlong.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	@Autowired
	private static Student s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext aContext = new ClassPathXmlApplicationContext("beans_ioc.xml");
		// ApplicationContext aContext1 = new
		// FileSystemXmlApplicationContext("G:\\workspace\\myspring\\src\\main\\java\\beans_ioc.xml");
		Student s1 = (Student) aContext.getBean("student");
		Student s2 = (Student) aContext.getBean("student");
		s = (Student) aContext.getBean(Student.class);

		System.out.println(s1.equals(s2));
		System.out.println(s1.getName());
		System.out.println(s.getName());
/*
 * 		当我们实例化bean 该文件中配置被实例
 * 		从ApplicationContext应用上下文中获取bean 和从bean工厂中获取有什么区别
 *		从bean工厂 加载，使用beanFatctory 当你只是实例化容器容器里面的bean不会被实例化，
 *		当你使用某个bean的时候才会实时创建
 *		
 *
 *
 *		bean的生命周期
 *		重点
 *
 */

		
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans_ioc.xml"));
//		factory.getBean("student");
	}

}
