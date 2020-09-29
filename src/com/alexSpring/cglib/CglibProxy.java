package com.alexSpring.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * Proxy Class
 * @author liu.zehu
 *
 */
public class CglibProxy implements MethodInterceptor {

	
	
	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		
		return null;
	}

}
