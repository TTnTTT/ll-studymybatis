package com.test.dao;

import java.io.Console;

import com.sun.istack.internal.logging.Logger;

public class Login {
	/**
	 * 检查用户登录
	 * @param username
	 * @param password
	 * @return
	 */
	public boolean execute(String username, String password ) {
		boolean r= false;
		System.out.println("用户名"+username);
		System.out.println("密码"+password);
		if(username.trim()=="001"&&password.trim()=="111"){
			r=true;
		}
		return r;
	}
}
