package com.alexSpring.jdk;

import org.springframework.stereotype.Repository;

/**
 * Target Class
 * @author liu.zehu
 *
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Override
	public void addUser() {
		System.out.println("Add a user!");
	}

	@Override
	public void deleteUser() {
		System.out.println("Delete a user!");
	}

}
