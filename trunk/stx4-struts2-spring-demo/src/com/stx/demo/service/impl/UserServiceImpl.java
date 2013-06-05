package com.stx.demo.service.impl;

import java.util.List;

import com.stx.demo.dao.UserDao;
import com.stx.demo.entity.User;
import com.stx.demo.service.UserService;

/**
 * 用户业务实现类
 * 
 * @author getan
 * 
 */
public class UserServiceImpl implements UserService {

	private UserDao dao;

	@Override
	public List<User> queryUser(User userParams) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertUser(User user) throws Exception {
		// TODO Auto-generated method stub

	}
	
	/**
	 * 用户登录
	 * 
	 * @ return 登录用户对应的user对象
	 */
	@Override
	public User login(String loginName, String password)
			throws Exception {
		User user = dao.getUserByLoginNameAndPassword(loginName, password);

		return user;
	}
	

	/**
	 * 用户登录名是否已存在(true 为已存在)
	 * 
	 * @param 用户登录名
	 * @return boolean
	 */
	@Override
	public boolean checkLoginNameExist(String loginName) {
		User user = dao.getUserByLoginName(loginName);
		// 用户对象非空(即该用户登录名已存在)
		if (user != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void deleteUser(String sno) {
		dao.deleteUser(sno);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param dao
	 */
	public void setDao(UserDao dao) {
		this.dao = dao;
	}

}
