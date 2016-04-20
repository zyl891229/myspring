package com.mrlong.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans_collect.xml");
		Department department=(Department) ac.getBean("department");
		System.out.println(department.getName());
		for(String emName:department.getEmpName()){
			System.out.println(emName);
		}
		//list可以存放相同的镜像
		System.out.println("*****通过list取出数据  保证顺序*********");
		for(Employee e : department.getEmpList()){
			System.out.println("name="+e.getName()+"   id="+e.getId());
		}
		//set不可以存放相同的
		System.out.println("**********ͨ通过set取出数据  不保证顺序*****");
		for(Employee e : department.getEmpsets()){
			
			System.out.println("name="+e.getName()+"   id="+e.getId());
		}
		
		System.out.println("*******ͨ通过map 迭代器取出数据****");
		//1.使用迭代器
		Map<String,Employee> empmaps=department.getEmpMaps();
		Iterator it=empmaps.keySet().iterator();
		while(it.hasNext()){
			String key=(String) it.next();
			Employee emp=empmaps.get(key);
			System.out.println("key="+key+" name="+emp.getName());
		}
		
		System.out.println("******通过map  entry取出数据****");
		//2.简介方法
		for(Entry<String,Employee> entry1:department.getEmpMaps().entrySet()){
			
			System.out.println("key="+entry1.getKey()+"  name="+entry1.getValue().getName());
		}
		
		System.out.println("*****通过Propertis取出数据*****");
		Properties pp=department.getPp();
		System.out.println(pp.get("pp1").toString());
		for(Entry<Object, Object> e:pp.entrySet()){
			System.out.println(e.getKey().toString()+" "+e.getValue().toString());
		}
		
//		System.out.println("*****通过Propertis  Iterator取出数据*****");
//
//		Iterator iterator = pp.keySet().iterator();
//		while (iterator.hasNext()) {
//			String key=(String) it.next();
//			Employee emp=empmaps.get(key);
//			System.out.println("key="+key+" name="+emp.getName());
//			
//		}
		
		
		System.out.println("*****通过Enumeration取出数据*****");
		Enumeration en= pp.keys();
		while(en.hasMoreElements()){
		//	Entry<Object,Object> elment= (Entry<Object, Object>) en.nextElement();
		//	System.out.println(elment.getKey()+" "+elment.getValue());
			String key=(String) en.nextElement();
			System.out.println(key+" "+pp.getProperty(key));
		}
	}

}
