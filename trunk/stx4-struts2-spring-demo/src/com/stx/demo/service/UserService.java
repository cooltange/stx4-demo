package com.stx.demo.service;

import java.util.List;

import com.stx.demo.entity.User;

public interface UserService {
	/**
	 * 根据查询条件查询用户信息列表
	 * 
	 * @param stuPO
	 * @return
	 * @throws Exception
	 */
	public List<User> queryUser(User userParams) throws Exception;

	/**
	 * 新增用户信息
	 * 
	 * @param user
	 * @throws Exception
	 */
	public void insertUser(User user) throws Exception;

	/**
	 * 根据登录名和密码查询用户（判断登录名与密码是否匹配合法）
	 * 
	 * @param loginName
	 * @param password
	 * @return 用户对象
	 * @throws Exception
	 */
	public User login(String loginName, String password)
			throws Exception;

	/**
	 * 删除用户信息
	 * 
	 * @param sno
	 */
	public void deleteUser(String sno);

	/**
	 * 更新用户信息
	 * 
	 * @param user
	 */
	public void updateUser(User user);

	/**
	 * 检查
	 * 
	 * @param loginName
	 * @return
	 */
	public boolean checkLoginNameExist(String loginName);

}
