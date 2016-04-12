package com.mrlong.myspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//单例模式
final public class ApplicationContextUtil {
	private static ApplicationContext aContext =null;
	
	private ApplicationContextUtil (){
	}
	static{
		aContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	public static ApplicationContext getApplicationContextUtil() {
		return aContext;
		
	}
}
