package com.ty.shopping.controller;

import com.ty.shopping.dao.UserDao;
import com.ty.shopping.dto.User;

public class TestUserInsert {
	public static void main(String[] args) {
		User user = new User();
		user.setId(8);
		user.setName("kumar");
		user.setEmail("kumar@gmail.com");
		user.setPassword("kuma@asf45");
		user.setMobile(551155882255l);
		UserDao userDao = new UserDao();
		userDao.saveUser(user);
		//User res = userDao.validateUser("eshwar@gmail.com", "eshwar@asf45");

//		if (res > 0) {
//			System.out.println("data inserted");
//		} else {
//			System.out.println("data is not inserted");
//		}
		// UserDao.validateUser("eshwar@gmail.com","eshwar@asf45");
		//if (res != null) {
		//	System.out.println("details");
		//	System.out.println(res.getName());
		//	System.out.println(res.getMobile());
		//} else {
		//	System.out.println("user is email or password is wrong");
		//}

	}

}
