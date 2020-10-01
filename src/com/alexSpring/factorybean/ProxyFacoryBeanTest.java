package com.alexSpring.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alexSpring.jdk.UserDao;

public class ProxyFacoryBeanTest {

	public static void main(String[] args) {
		String xmlPath = "com/alexSpring/factorybean/applicationContext.xml";
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		
		UserDao userDao = (UserDao) applicationContext.getBean("userDaoProxy");
		
		userDao.addUser();
		userDao.deleteUser();
		

	}

}
