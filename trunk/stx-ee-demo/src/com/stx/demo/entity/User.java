package com.stx.demo.entity;

import java.util.Date;

/**
 * 博客用户 实体类
 * 
 * @author yaofu
 * 
 * @createDate 2013-1-12
 * 
 */
public class User {
	// 用户编号
	private int us_id;
	// 用户名
	private String us_name;
	// 博客名
	private String us_blogname;
	// 用户密码
	private String us_password;
	// 用户邮箱
	private String us_email;
	// 博客描述
	private String us_description;
	// 创建时间
	private Date us_createtime;
	// 最后修改时间
	private Date us_lastmodifytime;
	// 是否删除标记
	private String us_delflag;

	/*
	 * 生成us_user表中的GET、SET方法
	 */

	public int getUid() {
		return us_id;
	}

	public void setUid(int uid) {
		this.us_id = uid;
	}

	public String getUname() {
		return us_name;
	}

	public void setUname(String uname) {
		this.us_name = uname;
	}

	public String getBlogname() {
		return us_blogname;
	}

	public void setBlogname(String blogname) {
		this.us_blogname = blogname;
	}

	public String getPassword() {
		return us_password;
	}

	public void setPassword(String password) {
		this.us_password = password;
	}

	public String getEmail() {
		return us_email;
	}

	public void setEmail(String email) {
		this.us_email = email;
	}

	public String getDescription() {
		return us_description;
	}

	public void setDescription(String description) {
		this.us_description = description;
	}

	public String getDelflag() {
		return us_delflag;
	}

	public void setDelflag(String delflag) {
		this.us_delflag = delflag;
	}

	public Date getUs_createtime() {
		return us_createtime;
	}

	public void setUs_createtime(Date us_createtime) {
		this.us_createtime = us_createtime;
	}

	public Date getUs_lastmodifytime() {
		return us_lastmodifytime;
	}

	public void setUs_lastmodifytime(Date us_lastmodifytime) {
		this.us_lastmodifytime = us_lastmodifytime;
	}

}
