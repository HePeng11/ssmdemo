package com.jxcdemo.business;


import org.springframework.stereotype.Service;

import com.jxc.dto.UserDto;
import com.jxcdemo.common.ActionResult;
import com.jxcdemo.common.QueryResult;
import com.jxcdemo.entitys.User;

@Service
public interface IUserBusiness {
	
	/**
	 * 登陆
	 * @param name
	 * @param passsword
	 * @return
	 */
	User login(String name, String passsword);
	/**
	 * 分页查询
	 * @param page 第几页
	 * @param limit 每页条数
	 * @return
	 */
	QueryResult<UserDto> getusers(int page,int limit);
	
	/**
	 * 新增用户
	 * @param userDto
	 * @return
	 */
	ActionResult addUser(User user);
}
