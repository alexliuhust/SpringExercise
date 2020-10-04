package com.alexSpring.jdbc;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateTest {

	/**
	 * Use execute() to create tables
	 * 
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

	@Test
	public void addTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");

		Account account = new Account();
		account.setUsername("Alexander");
		account.setBalance(0.00);

		int num = accountDao.addAccount(account);
		if (num > 0) {
			if (num == 1)
				System.out.println("Successfully inserted 1 record!");
			else
				System.out.println("Successfully inserted " + num + " record(s)!");
		} else
			System.out.println("Failed to insert!");

	}

	@Test
	public void updateTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");

		Account account = new Account();
		account.setId(1);
		account.setUsername("Atkinson Smith");
		account.setBalance(1000.29);

		int num = accountDao.updateAccount(account);
		if (num > 0) {
			if (num == 1)
				System.out.println("Successfully updated 1 record!");
			else
				System.out.println("Successfully updated " + num + " record(s)!");
		} else
			System.out.println("Failed to update!");
	}

	@Test
	public void deleteTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
		int num = accountDao.deleteAccount(3);
		if (num > 0) {
			if (num == 1)
				System.out.println("Successfully deleted 1 record!");
			else
				System.out.println("Successfully deleted " + num + " record(s)!");
		} else
			System.out.println("Failed to delete!");
	}
	
	@Test
	public void findByIdTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
		
		Account account = accountDao.findAccountById(1);
		System.out.println(account);
	}
	
	@Test
	public void findAllTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
		
		List<Account> accounts = accountDao.findAccountAll();
		for (Account account : accounts) 
			System.out.println(account);
	}

}
