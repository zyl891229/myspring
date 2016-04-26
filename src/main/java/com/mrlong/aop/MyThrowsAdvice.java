package com.mrlong.aop;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdvice implements ThrowsAdvice {
	public void afterThrowing(Method m,Object[] objects ,Object tager,Exception e){
		System.out.println("出大事了   "+e.getMessage());
	};
}
