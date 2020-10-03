package com.alexSpring.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateTest {

	/**
	 * Use execute() to create tables
	 * @param args
	 */
//	public static void main(String[] args) {
//		// Load config file
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		
//		// Obtain JDBC Template instance
//		JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
//		
//		// Use execute() to execute SQL and create Account Table
//		jdbcTemplate.execute("create table account("
//						   + "id int primary key auto_increment,"
//						   + "userName varchar(50),"
//						   + "balance double)");
//		
//		System.out.println("Table Account succesfully created!");
//		
//
//	}
	
	
	/**
	 * Learn junit4 Test
	 */
	@Test
	public void mainTest() {
		// Load config file
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Obtain JDBC Template instance
		JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
		
		// Use execute() to execute SQL and create Account Table
		jdbcTemplate.execute("create table account("
						   + "id int primary key auto_increment,"
						   + "userName varchar(50),"
						   + "balance double)");
		
		System.out.println("Table Account succesfully created!");
	}

}
