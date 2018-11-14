package com.jxcdemo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jxcdemo.dto.UserDto;
import com.jxcdemo.entitys.User;

public interface UserDao {
	/**
	 * 登陆
	 * @param name
	 * @param password
	 * @return
	 */
	User login(@Param("name")String name,@Param("password")String password);
	
	/**
	 * 查询
	 * @param userDto
	 * @return
	 */
	List<User> getusers(UserDto userDto);
	
	/**
	 * 新增
	 * @param user
	 * @return
	 */
	Integer adduser(User user);
	
	/**
	 * 修改
	 * @param user
	 * @return
	 */
	Integer updateUser(User user);
	
	/**
	 * 删除
	 * @param user
	 * @return
	 */
	Integer deleteUser(int id);
	
	/**
	 *  是否存在用户
	 * @param loginName
	 * @param id
	 * @return
	 */
	Integer existUser(@Param("loginName") String loginName,@Param("id") int id);

}
