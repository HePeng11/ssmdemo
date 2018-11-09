package com.jxcdemo.businessimpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jxc.dto.UserDto;
import com.jxcdemo.business.IUserBusiness;
import com.jxcdemo.common.QueryResult;
import com.jxcdemo.dao.UserDao;
import com.jxcdemo.entitys.User;

@Service
public class UserBusiness implements IUserBusiness {
	@Autowired
	UserDao mDao;

	@Transactional("transactionManager")
	public User login(String name, String passsword) {
		System.out.println(name + passsword);
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String hehe = dateFormat.format(now);
		System.out.println(hehe);

		if (name == null || name.isEmpty()) {
			System.out.println("用戶名不能為空");
			return null;
		}
		if (passsword == null || passsword.isEmpty()) {
			System.out.println("密碼不能為空");
			return null;
		}
		try {
			User user = mDao.login(name,passsword);
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public QueryResult<UserDto> getusers(UserDto userDto) {
		List<User> list = mDao.getusers(userDto);
		List<UserDto> result = new ArrayList<UserDto>();
		for (User user : list) {
			result.add(new UserDto(user.getId(), user.getLoginname(), user.getRealname(), user.getPhone(), user.getSex()));
		}

		QueryResult<UserDto> r=new QueryResult<UserDto>();
		r.setCount(100);
		r.setData(result);
		
		return r;
	}

}
