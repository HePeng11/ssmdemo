package com.jxcdemo.business;


import org.springframework.stereotype.Service;

import com.jxc.dto.UserDto;
import com.jxcdemo.common.QueryResult;
import com.jxcdemo.entitys.User;

@Service
public interface IUserBusiness {
	User login(String name, String passsword);
	QueryResult<UserDto> getusers(UserDto userDto);
}
