package com.alexSpring.annotation;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	public void save() {
		System.out.println("userDao saved your life!");

	}

}
