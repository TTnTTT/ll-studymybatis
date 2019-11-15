package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.test.dao.Login;

import domain.User;

@Controller
@RequestMapping(value="/login",produces="text/html;charset=utf-8")//表明该控制器所有请求都被映射到/login路径下
public class LoginController {
	//获取前台传参方式一，直接形参获取，注意名字与前台相同,不同时参数加
	/*作业1@RequestMapping(value="/login1",method=RequestMethod.POST)//servlet别名定义为login1，表单提交地址到login1
	public ModelAndView checkUser(@ModelAttribute("username")String username, String password) {//不同名时用注解
		Login login = new Login();
		if (login.execute(username.trim(), password.trim())) {
	//后台传参到前台
			ModelAndView modelAndView=new ModelAndView("login_succ");//前台url，返回路径
			//return "login_succ";//框架自动寻找对应的返回路径，需在xml配置好
			modelAndView.addObject("username","这人输入正确");
			return modelAndView;
		} else {
			ModelAndView modelAndView=new ModelAndView("login_err");//前台url，返回路径
			//return "login_succ";//框架自动寻找对应的返回路径，需在xml配置好
			modelAndView.addObject("username","这人输入错误");
			return modelAndView;
		}
	}*/
	//获取前台传参方式二，用对象，注意对象的属性和前台一致
	@RequestMapping("/login1")//servlet别名定义为login1，表单提交地址到login1
	public String checkUser(User user) {
		Login login = new Login();
		if (login.execute(user.getUsername(), user.getPassword())) {
			return "login_succ";//框架自动寻找对应的返回路径，需在xml配置好
		} else {
			return "login_err";
		}
		
	}
	/*@RequestMapping(value="/login1",produces="text/html;charset=utf-8")
	@ResponseBody//提交返回一个特殊的json格式数据,不是跳转地址
	public String checkUser(String username, String password) {
		Login login = new Login();
		if (login.execute(username, password)) {
			return "登录成功"+username;
		} else {
			return "登录失败";
		}
	}*/

}
