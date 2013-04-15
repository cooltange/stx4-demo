package com.stx.demo.servlet.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.stx.demo.dao.UserDao;
import com.stx.demo.entity.User;

/**
 * 用户登录Servlet类
 * 
 * @author getan
 * 
 */
public class LoginServlet extends HttpServlet {
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

		// 从页面获取登录数据
		String loginName = request.getParameter("loginName");
		String password = request.getParameter("password");

		try {
			// 调用dao判断用户登录名与密码是否合法(非法时返回为null，合法时返回一个当前登录用户的用户对象)
			User currentUser = dao.getUserByLoginNameAndPassword(loginName, password);
			
			// 判断登录名与密码是否正确
			if(currentUser != null){
				// 从request对象获得session(会话)对象
				HttpSession session = request.getSession();
				/*
				 * 将保持有当前用户信息状态的user对象存放入session(会话)对象 
				 * 为未后续的各种操作如发文章,添加文章种类等提供便利(因为此类操作需要获得当前用户的id *^_^*)
				 */
				session.setAttribute("currentUser", currentUser);
				
				// 请求转发给用系统首页(/jsp/index.jsp)
				getServletContext().getRequestDispatcher("/jsp/index.jsp").forward(request, response);
				
			} else{
				// 将登录失败提示信息保存到request对象中(该提示信息会显示在JSP页面中的 <div id='msgs'>${messages}</div>处)
				request.setAttribute("messages", "用户登录名或密码错误!");
				
				// 请求转发给用户登录页面(/jsp/login.jsp),重新登录
				getServletContext().getRequestDispatcher("/jsp/login.jsp").forward(request, response);
			}
		} catch (Exception e) {
			// 控制台输出异常信息
			e.printStackTrace();
			// 将登录失败提示信息保存到request对象中(该提示信息会显示在JSP页面中的 <div class="alert alert-error"><%=request.getAttribute("messages")%></div>处)
			request.setAttribute("messages", "用户登录功能异常,请联系管理员!");
			
			// 请求转发给用户登录页面(/jsp/login.jsp),重新登录
			getServletContext().getRequestDispatcher("/jsp/login.jsp").forward(request, response);
		}
	}
}
