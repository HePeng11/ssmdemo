package com.jxc.dto;

public class UserDto {
	private int id;
	private String loginname;
	private String realname;
	private String phone;
	private String sex;
	
	public UserDto(int id, String loginname, String realname, String phone, String sex) {
		super();
		this.id = id;
		this.loginname = loginname;
		this.realname = realname;
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
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
