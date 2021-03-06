package com.jxcdemo.businessimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jxcdemo.business.IUserBusiness;
import com.jxcdemo.common.ActionCode;
import com.jxcdemo.common.ActionResult;
import com.jxcdemo.common.ActionType;
import com.jxcdemo.common.QueryResult;
import com.jxcdemo.common.StringUtil;
import com.jxcdemo.common.Utils;
import com.jxcdemo.dao.UserDao;
import com.jxcdemo.dto.UserDto;
import com.jxcdemo.entitys.User;
import com.jxcdemo.enums.UserSex;

@Service
public class UserBusiness implements IUserBusiness {
	@Autowired
	UserDao userDao;

	/**
	 * 登陆
	 */
	@Transactional("transactionManager")
	public User login(String name, String passsword, Boolean HasMD5) {
		if (!HasMD5) {
			String md5passsword = Utils.getMD5String(passsword);
			if (md5passsword != null) {
				passsword = md5passsword;
			}
		}
		if (name == null || name.isEmpty()) {
			System.out.println("用戶名不能為空");
			return null;
		}
		if (passsword == null || passsword.isEmpty()) {
			System.out.println("密碼不能為空");
			return null;
		}
		try {
			User user = userDao.login(name, passsword);
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

		List<User> list = userDao.getusers(new UserDto(0, "", "", "", UserSex.未知));// 测试传参
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
		user.setId(0);
		ActionResult r = ValidateModel(user, ActionType.新增);
		if (r.getCode() == ActionCode.Failed) {
			return r;
		}

		Integer i = userDao.adduser(user);
		if (i > 0) {
			r.setCode(ActionCode.Success);
			r.setMsg("添加用户成功！");
		} else {
			r.setMsg("写入数据库失败！");
		}

		return r;
	}

	/**
	 * 修改
	 */
	@Override
	public ActionResult updateUser(User user) {
		ActionResult r = new ActionResult();
		r = ValidateModel(user, ActionType.编辑);
		if (r.getCode() == ActionCode.Failed) {
			return r;
		}
		Integer i = userDao.updateUser(user);
		if (i > 0) {
			r.setCode(ActionCode.Success);
			r.setMsg("更新用户成功！");
		} else {
			r.setMsg("更新数据库失败！");
		}
		return r;
	}

	/**
	 * 删除
	 */
	@Override
	public ActionResult deleteUser(int id) {
		ActionResult r = new ActionResult();
		if (id <= 0) {
			r.setMsg("删除的用户数据无效！");
			return r;
		}
		Integer i = userDao.deleteUser(id);
		if (i > 0) {
			r.setCode(ActionCode.Success);
			r.setMsg("删除用户成功！");
		} else {
			r.setMsg("更新数据库失败！");
		}
		return r;
	}

	/**
	 * 验证数据
	 * 
	 * @param user
	 * @return
	 */
	private ActionResult ValidateModel(User user, ActionType type) {
		ActionResult r = new ActionResult();
		if (type == ActionType.编辑 && user.getId() <= 0) {
			r.setMsg("更新的用户数据无效！");
			return r;
		}
		if (StringUtil.isBlank(user.getLoginName())) {
			r.setMsg("请输入用户名！");
			return r;
		}
		if (StringUtil.isSpecialChar(user.getLoginName())) {
			r.setMsg("用户名包括特殊字符！");
			return r;
		}
		Integer e = userDao.existUser(user.getLoginName(), user.getId());
		if (e != null && e > 0) {
			r.setMsg("该用户名已经存在！");
			return r;
		}
		if (type == ActionType.新增 && StringUtil.isBlank(user.getPassword())) {
			r.setMsg("请输入密码！");
			return r;
		}
		if (!StringUtil.isBlank(user.getPassword()) && user.getPassword().length() < 6) {
			r.setMsg("密码长度应为6位以上！");
			return r;
		}
		String md5password = Utils.getMD5String(user.getPassword());
		if (md5password != null) {
			user.setPassword(md5password);
		}

		r.setCode(ActionCode.Success);
		return r;
	}

}
