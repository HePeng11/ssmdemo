package com.jxcdemo.business;

import org.springframework.stereotype.Service;

import com.jxcdemo.entitys.User;

@Service
public interface IUserBusiness {
	User login(String name, String passsword);
	Void UpdateUserByName(String name);
}
