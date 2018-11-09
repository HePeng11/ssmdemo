package com.jxcdemo.entitys;

import com.jxcdemo.enums.UserSex;

public class User {
	private int id;
	private int userid;
	private int userpassword;
	private String loginname;
	private String password;
	private String realname;
	private String phone;
	private UserSex sex;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
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
