package com.alexSpring.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.alexSpring.aspect.MyAspect;

/**
 * JDK Proxy class
 * @author liu.zehu
 *
 */
public class JdkProxy implements InvocationHandler {

	// Declare the target interface
	private UserDao userDao;
	
	public Object createProxy(UserDao userDao) {
		this.userDao = userDao;
		ClassLoader classLoader = JdkProxy.class.getClassLoader();
		Class<?>[] clazz = this.userDao.getClass().getInterfaces();
		return Proxy.newProxyInstance(classLoader, clazz, this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		MyAspect myAspect = new MyAspect();
		myAspect.checkPermission();
		Object obj = method.invoke(userDao, args);
		myAspect.log();
		return obj;
	}

}



