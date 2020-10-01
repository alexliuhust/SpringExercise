package com.alexSpring.aspectj.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alexSpring.jdk.UserDao;

public class XmlAspectJTest {

	public static void main(String[] args) {
		String xmlPath = "com/alexSpring/aspectj/xml/applicationContext.xml";
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		
		userDao.addUser();

	}

}
