package com.alexSpring.jdk;

public class JdkTest {

	public static void main(String[] args) {
		// Create Proxy object
		JdkProxy jdkProxy = new JdkProxy();
		
		// Create target object
		UserDao userDao = new UserDaoImpl();
		
		// Obtain the advised object from the proxy object
		UserDao userDao1 = (UserDao) jdkProxy.createProxy(userDao);
		
		// Execute methods
		userDao1.addUser();
		userDao1.deleteUser();
		

	}

}
