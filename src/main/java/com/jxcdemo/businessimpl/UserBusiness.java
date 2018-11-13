package com.jxcdemo.businessimpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jxc.dto.UserDto;
import com.jxcdemo.business.IUserBusiness;
import com.jxcdemo.common.ActionCode;
import com.jxcdemo.common.ActionResult;
import com.jxcdemo.common.QueryResult;
import com.jxcdemo.dao.UserDao;
import com.jxcdemo.entitys.User;
import com.jxcdemo.enums.UserSex;

@Service
public class UserBusiness implements IUserBusiness {
	@Autowired
	UserDao mDao;

	/**
	 * 登陆
	 */
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
			User user = mDao.login(name, passsword);
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 分页查询
	 */
	@Override
	public QueryResult<UserDto> getusers(int page, int limit) {
		PageHelper.startPage(page, limit, true);

		List<User> list = mDao.getusers(new UserDto(0, "", "", "", UserSex.未知));// 测试传参
		PageInfo<User> info = new PageInfo<>(list);

		List<UserDto> result = new ArrayList<UserDto>();
		for (User user : list) {
			result.add(
					new UserDto(user.getId(), user.getLoginName(), user.getRealName(), user.getPhone(), user.getSex()));
		}

		QueryResult<UserDto> r = new QueryResult<UserDto>();
		r.setCount((int) info.getTotal());
		r.setData(result);

		return r;
	}

	/**
	 * 新增用户
	 */
	@Override
	public ActionResult addUser(User user) {
		Integer i = mDao.adduser(user);
		ActionResult r = new ActionResult(ActionCode.Success, "添加成功", i);

		return r;
	}

}
