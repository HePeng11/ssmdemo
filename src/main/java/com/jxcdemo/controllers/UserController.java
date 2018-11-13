package com.jxcdemo.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jxc.dto.UserDto;
import com.jxcdemo.business.IUserBusiness;
import com.jxcdemo.common.ActionResult;
import com.jxcdemo.common.QueryResult;
import com.jxcdemo.entitys.User;

@Controller
public class UserController {
	@Autowired
	IUserBusiness iUserBusiness;

	/**
	 * 分页查询
	 * @param page
	 * @param limit
	 * @return
	 */
	@GetMapping(value = "/users")
	@ResponseBody
	public QueryResult<UserDto> getusers(int page, int limit) {

		return iUserBusiness.getusers(page, limit);
	}

	/**
	 * 【GET】 /users # 查询用户信息列表 【GET】 /users/1001 # 查看某个用户信息 【POST】 /users # 新建用户信息
	 * 【PUT】 /users/1001 # 更新用户信息(全部字段) 【PATCH】 /users/1001 # 更新用户信息(部分字段) 【DELETE】
	 * /users/1001 # 删除用户信息
	 * 
	 * @return
	 */
	@PostMapping(value = "/users")
	@ResponseBody
	public ActionResult adduser(User user) {

		return iUserBusiness.addUser(user);
	}

	/**
	 * 登陆
	 * @param name
	 * @param password
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/login")
	public String login(String name, String password, HttpServletRequest request, HttpServletResponse response) {
		try {
			User user = iUserBusiness.login(name, password);
			if (user == null) {
				System.out.println("登陆失败");
				return "redirect:/views/login.jsp";
			} else {
				System.out.println("登陆成功");
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				return "redirect:/views/index.html";
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("登录失败");
			return "forward:/index";
		}
	}

}