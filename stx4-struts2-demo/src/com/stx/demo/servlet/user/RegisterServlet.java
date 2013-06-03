package com.stx.demo.servlet.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stx.demo.dao.UserDao;
import com.stx.demo.entity.User;

/**
 * 用户登录Servlet类
 * 
 * @author getan
 * 
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 用户Dao对象
	UserDao dao = null;

	/**
	 * 初始化方法
	 * 
	 * 将初始化dao对象的操作放入init()方法,可保证dao只被创建一次
	 */
	@Override
	public void init() throws ServletException {
		// 初始化用户Dao对象
		dao = new UserDao();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 设置请求编码集为utf-8(避免中文乱码)
		request.setCharacterEncoding("utf-8");
		
		// 创建用户数据视图对象(用于封装新增用户信息的数据)
		User userParams = new User();

		// 从页面获取新增数据
		userParams.setLoginName(request.getParameter("loginName"));
		userParams.setUserName(request.getParameter("userName"));
		userParams.setPassword(request.getParameter("password"));

		try {
			// 调用dao中的新增用户信息方法
			dao.insertUser(userParams);
			
			// 将新增结果保存到request对象中(该提示信息会显示在JSP页面中的 <div id='msgs'>${messages}</div>处)
			request.setAttribute("messages", "用户注册成功!");
			
			// 调用查询用户列表的Servlet,再次显示新增该用户后的用户信息列表
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/userQuery");
			// 请求转发给用户信息列表Servlet(/userQuery)
			rd.forward(request, response);
			
		} catch (Exception e) {
			// 控制台输出异常信息
			e.printStackTrace();
			
			// 将新增结果保存到request对象中(该提示信息会显示在JSP页面中的 <div id='msgs'>${messages}</div>处)
			request.setAttribute("messages", "用户注册失败!");
			
			// 调用查询用户列表的Servlet,再次显示新增该用户后的用户信息列表
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/user/userAdd.jsp");
			// 请求转发给用户信息列表Servlet(/userQuery)
			rd.forward(request, response);
		}
	}
}
