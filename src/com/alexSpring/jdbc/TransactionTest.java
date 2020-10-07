package com.alexSpring.jdbc;

import java.util.List;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TransactionTest {

	@Test
	public void xmlTest() {
		ApplicationContext appcationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountDao accountDao = (AccountDao) appcationContext.getBean("accountDao");
		String outUser = "Jaconara";
		String inUser = "Biaszecelry";
		Double money = 100.0;
		
		accountDao.transfer(outUser, inUser, money);
		
		System.out.println("Successfully transfered!");
		
		
	}

}
