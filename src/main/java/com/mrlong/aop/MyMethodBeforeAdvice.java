package com.mrlong.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

	
	/*
	 * method被调用的 方法
<<<<<<< HEAD
=======
	 * 
	 * 
	 * 
>>>>>>> branch 'master' of git@github.com:zyl891229/myspring.git
	 * (non-Javadoc)
	 * @see org.springframework.aop.MethodBeforeAdvice#before(java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 */
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("记录日志log   "+method.getName());
	}

}
