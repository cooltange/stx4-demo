package com.stx.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.stx.demo.entity.User;
import com.stx.demo.util.JdbcUtil;

/**
 * 用户数据访问对象类(jdbc)
 * 
 * @author getan
 * 
 */
public class UserDao {
	/**
	 * 根据查询条件查询用户信息列表
	 * 
	 * @param stuPO
	 * @return
	 * @throws Exception
	 */
	public List<User> queryUser(User userParams) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 新增用户信息
	 * 
	 * @param user
	 * @throws Exception
	 */
	public void insertUser(User user) throws Exception {
		// 获取connection对象
		Connection con = JdbcUtil.getConnection();
		// 通过connection对象获得"预编译语句"对象
		PreparedStatement ps = con
				.prepareStatement("insert into tbl_user(uname,blogname,password) values(?,?,?)");

		// 设置"预编译语句"对象中的参数(从1开始计数)
		ps.setString(1, user.getLoginName());
		ps.setString(2, user.getUserName());
		ps.setString(3, user.getPassword());

		// 执行sql操作
		ps.executeUpdate();
		
		// 释放数据库连接资源(切勿忘记)
		JdbcUtil.release();
	}
	
	/**
	 * 根据登录名和密码查询用户（判断登录名与密码是否匹配合法）
	 * 
	 * @param loginName
	 * @param password
	 * @return 用户对象
	 * @throws Exception
	 */
	public User getUserByLoginNameAndPassword(String loginName,String password) throws Exception{
		// 获取connection对象
		Connection con = JdbcUtil.getConnection();
		
		// 通过connection对象获得语句对象
		Statement ps = con.createStatement();
		
		// 执行查询获得结果集对象
		ResultSet rs = ps.executeQuery("select usid,loginname,uname from stxuser where loginname = '"
						+ loginName + 
						"' and password = '" + password + "'");

		// 声明用户对象
		User user = null;
		
		// 判断结果集中是否有记录
		if (rs.next()) {
			// 创建用户对象
			user = new User();

			// 将用户表记录的每一个字段的值 赋值给 "用户对象"对应的属性.
			// 即 用户对象.用户id <= 该条用户记录的usid
			user.setUsid(rs.getString("usid"));
			user.setLoginName(rs.getString("loginname"));
			user.setUserName(rs.getString("uname"));
		}
		
		// 如果登录名密码匹配即返回一个用户对象，否则返回null
		return user;
	}

	/**
	 * 删除用户信息
	 * 
	 * @param sno
	 */
	public void deleteUser(String sno) {
		// TODO Auto-generated method stub
	}

	/**
	 * 更新用户信息
	 * 
	 * @param user
	 */
	public void updateUser(User user) {
		// TODO Auto-generated method stub
	}

}
