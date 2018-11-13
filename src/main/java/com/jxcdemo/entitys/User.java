package com.jxcdemo.entitys;

import com.jxcdemo.enums.UserSex;

public class User {
	private int id;
	private String loginName;
	private String password;
	private String realName;
	private String phone;
	private UserSex sex;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public UserSex getSex() {
		return sex;
	}
	public void setSex(UserSex sex) {
		this.sex = sex;
	}
	
	
}
