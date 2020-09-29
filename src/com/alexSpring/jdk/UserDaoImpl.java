package com.alexSpring.jdk;

/**
 * Target Class
 * @author liu.zehu
 *
 */
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
