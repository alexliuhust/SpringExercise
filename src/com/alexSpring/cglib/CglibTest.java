package com.alexSpring.cglib;

import com.alexSpring.jdk.UserDao;
import com.alexSpring.jdk.UserDaoImpl;

public class CglibTest {

	public static void main(String[] args) {
		// Create Proxy object
		CglibProxy clibProxy = new CglibProxy();
		
		// Create target object
		UserDao userDao = new UserDaoImpl();
		
		// Obtain the advised object from the proxy object
		UserDao userDao1 = (UserDao) clibProxy.createProxy(userDao);
		
		// Execute methods
		userDao1.addUser();
		userDao1.deleteUser();		

	}

}
