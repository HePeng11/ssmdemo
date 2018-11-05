package com.jxcdemo.dao;

import org.apache.ibatis.annotations.Param;

import com.jxcdemo.entitys.User;

public interface UserDao {
	User selectUserByName(@Param("name") String name);
	
	void UpdateUserByName(@Param("name") String name);
	void UpdateUserByName1(@Param("name") String name);
}
