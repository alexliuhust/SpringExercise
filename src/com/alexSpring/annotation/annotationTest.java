package com.alexSpring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationTest {

	public static void main(String[] args) {
		String xmlPath = "com/alexSpring/annotation/annoBean.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserController userController = (UserController) applicationContext.getBean("userController");
		userController.save();

	}

}
