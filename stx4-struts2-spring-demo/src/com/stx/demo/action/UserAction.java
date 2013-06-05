package com.stx.demo.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.stx.demo.entity.User;
import com.stx.demo.service.UserService;

public class UserAction extends ActionSupport {
	private User user;
	// UserDao dao = new UserDaoImpl();// 传统创建实现类对象的方式
	private UserService service;// 使用以下的setService方法注入实现类对象

	/**
	 * 用户登录
	 * 
	 * @return
	 * @throws Exception
	 */
	public String login() throws Exception {

		User currentUser = service.login(
				user.getLoginName(), user.getPassword());
		
		// 判断用户名密码是否匹配
		if (currentUser != null) {
			ActionContext context = ActionContext.getContext();
			Map<String, Object> session = context.getSession();
			session.put("currentUser", currentUser);
			return SUCCESS;
		} else {
			addActionError("用户名或密码错误!");
			return INPUT;
		}

	}
	
	/**
	 * 检查用户登录名是否已存在
	 * 
	 * @return
	 * @throws Exception 
	 */
	public String checkLoginName() throws Exception{
		// 用户登录名是否已存在(true 为已存在)
		boolean hasExist = service.checkLoginNameExist(user.getLoginName());
		
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out = response.getWriter();
		
		// 用户登录名已存在
		if(hasExist){
			out.print(true);
		}else{
			out.print(false);
		}
		
		return null;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @param service
	 */
	public void setService(UserService service) {
		this.service = service;
	}
}
