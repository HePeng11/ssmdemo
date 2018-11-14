package com.jxcdemo.dto;

import com.jxcdemo.enums.UserSex;

public class UserDto {
	private int id;
	private String loginName;
	private String realName;
	private String phone;
	private UserSex sex;
	
	public UserDto(int id, String loginname, String realname, String phone, UserSex sex) {
		super();
		this.id = id;
		this.loginName = loginname;
		this.realName = realname;
		this.phone = phone;
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginname() {
		return loginName;
	}
	public void setLoginname(String loginname) {
		this.loginName = loginname;
	}
	public String getRealname() {
		return realName;
	}
	public void setRealname(String realname) {
		this.realName = realname;
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
