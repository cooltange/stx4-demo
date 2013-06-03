package com.stx.demo.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.stx.demo.dao.UserDao;
import com.stx.demo.entity.User;

public class UserAction extends ActionSupport {
	private User user;
	UserDao dao = new UserDao();

	public String login() throws Exception {
		
		User currentUser = dao.getUserByLoginNameAndPassword(
				user.getLoginName(), user.getPassword());
		
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
