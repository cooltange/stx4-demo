package com.stx.demo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.stx.demo.dao.UserDao;
import com.stx.demo.entity.User;

/**
 * 用户数据访问对象类(jdbc)
 * 
 * @author getan
 * 
 */
public class UserDaoImpl implements UserDao{
	
	private JdbcTemplate jdbcTemplate;
	
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
		String sql = "insert into tbl_user(uname,blogname,password) values(?,?,?)";
		Object[] params = { user.getLoginName(), user.getUserName(),
				user.getPassword() };
		jdbcTemplate.update(sql, params);
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
		// sql语句
		String sql = "select * from stxuser where loginname = ? and password = ?";
		// 参数列表
		Object[] params = {loginName,password};
		// 返回查询结果集合
		List userList = jdbcTemplate.query(sql, params, new UserRowMapper());
	
		// 判断结果集合是否为空(用户名密码是否匹配)
		if(!userList.isEmpty()){
			// 匹配
			return (User)userList.get(0);
		}else{
			// 不匹配
			return null;
		}
	}
	
	/**
	 * 根据登录名查询用户对象
	 * 
	 * @param loginName
	 * @param password
	 * @return 用户对象
	 * @throws Exception
	 */
	@Override
	public User getUserByLoginName(String loginName) {
		// TODO 自动生成的方法存根
		return null;
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

	/**
	 * @param jdbcTemplate
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/**
	 * 用户的RowMapper对象(ResultSet => Object)
	 * 
	 * @author getan
	 *
	 */
	private class UserRowMapper implements RowMapper{
		@Override
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			// ResultSet对象=>对象 映射操作开始
			user.setUsid(rs.getString("usid"));
			user.setLoginName(rs.getString("loginname"));
			user.setUserName(rs.getString("uname"));
			// ResultSet对象=>对象 映射操作结束
			
			// 返回映射后的用户对象
			return user;
		}
	}

}
