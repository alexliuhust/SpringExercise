package com.alexSpring.annotation;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("userService")
public class userServiceImpl implements UserService {

	@Resource (name = "userDao")
	private UserDao userDao;
	
	@Override
	public void save() {
		this.userDao.save();
		System.out.println("userService saved your life!");
	}

}