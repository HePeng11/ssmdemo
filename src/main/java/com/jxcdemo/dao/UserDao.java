package com.jxcdemo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jxc.dto.UserDto;
import com.jxcdemo.entitys.User;

public interface UserDao {
	
	User selectUserByName(@Param("name") String name);
	
	List<User> getusers(UserDto userDto);

}
