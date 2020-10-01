package com.alexSpring.factorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		
		check_Permission();
		
		Object obj = mi.proceed();
		
		log();
		
		return obj;
	}

	public void check_Permission() {
		System.out.println("--------Checking Permission--------");
		
	}
	public void log() {
		System.out.println("--------Log Processing--------");
	}

}
