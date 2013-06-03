package com.stx.demo.servlet.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 检查用户登录名是否已存在Servlet类
 * 
 * @author getan
 * 
 */
public class CheckLoginNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 初始化方法
	 * 
	 * 将初始化dao对象的操作放入init()方法,可保证dao只被创建一次
	 */
	@Override
	public void init() throws ServletException {

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 设置请求编码集为utf-8(避免中文乱码)
		request.setCharacterEncoding("utf-8");

		// 从页面获取数据
		String loginName = request.getParameter("loginName");

		// 模拟当前系统已经存在名为"admin"的用户登录名
		if("admin".equals(loginName)){
			PrintWriter out = response.getWriter();
			out.print(true);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
	}
}
