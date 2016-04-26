package com.mrlong.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor {

	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("\n环绕通知前   ");
		Object object = arg0.proceed();
		System.out.println("环绕通知后   \n");

		return object;
	}

}
