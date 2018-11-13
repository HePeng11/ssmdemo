package com.jxcdemo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jxc.dto.UserDto;
import com.jxcdemo.entitys.User;

public interface UserDao {
	/**
	 * 
	 * @param name
	 * @param password
	 * @return
	 */
	User login(@Param("name")String name,@Param("password")String password);
	
	List<User> getusers(UserDto userDto);
	
	Integer adduser(User user);

}
