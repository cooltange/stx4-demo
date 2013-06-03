package com.stx.demo.entity;

/**
 * 用户实体类(用于封装用户信息)
 * 
 * @author getan
 * 
 */
public class User {
	// 用户ID
	private String usid;
	// 登录名
	private String loginName;
	// 用户名
	private String userName;
	// 密码
	private String password;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsid() {
		return usid;
	}

	public void setUsid(String usid) {
		this.usid = usid;
	}
}
