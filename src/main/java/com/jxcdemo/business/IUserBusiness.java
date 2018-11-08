package com.jxcdemo.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jxc.dto.UserDto;
import com.jxcdemo.entitys.User;

@Service
public interface IUserBusiness {
	User login(String name, String passsword);
	List<UserDto> getusers(UserDto userDto);
}
