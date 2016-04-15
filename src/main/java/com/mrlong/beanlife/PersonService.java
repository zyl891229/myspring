package com.mrlong.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class PersonService implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean	 {
	private String name;
    public  PersonService() {
		System.out.println("init构造函数");
	}
    
    public  PersonService(String aString) {
		System.out.println("init "+aString);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName函数");
		this.name = name;
	}
	public void sayHi() {
		System.out.println("hi "+name);
	}

	public void setBeanName(String args) {
		// TODO Auto-generated method stub
		System.out.println("setBeanName "+args);
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setBeanFactory "+beanFactory);
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setApplicationContext  "+applicationContext);
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet" );
	}
	public void init() {
		System.out.println("my init!!!");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy    close!!!!!");
		
	}
	
	public void mydestroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("my my destroy close!!!!!");
		
	}
}
