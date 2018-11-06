package com.jxcdemo.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jxcdemo.business.IUserBusiness;
import com.jxcdemo.entitys.User;

@Controller
public class UserController {
	@Autowired
	IUserBusiness iUserBusiness;

	@RequestMapping(value = "/hello.do")
	@ResponseBody
	public String hello() {
		System.out.println("接收到请求 ，Hello");
		iUserBusiness.UpdateUserByName("hi");
		return "hi";
	}

	@RequestMapping(value = "/login")
	public String login(String name, String password, HttpServletRequest request,HttpServletResponse response) {
		try {
			User user = iUserBusiness.login(name, password);
			if (user == null) {
				System.out.println("登陆失败");
				return "redirect:/views/login.jsp";
			} else {
				System.out.println("登陆成功");
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				return "redirect:/views/index.jsp";
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("登录失败");
			return "forward:/index";
		}
	}

}