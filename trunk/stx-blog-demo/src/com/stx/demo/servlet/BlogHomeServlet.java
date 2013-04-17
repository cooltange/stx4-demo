package com.stx.demo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.stx.demo.dao.BloggerDao;
import com.stx.demo.entity.Blogger;

/**
 * 博客首页 Servlet类
 * 
 * @author getan
 * 
 * @createDate 2013-4-12
 *
 */
public class BlogHomeServlet extends HttpServlet {

	// 博文dao对象
	BloggerDao dao = null;

	/**
	 * 初始化方法
	 * 
	 * 将初始化dao对象的操作放入init()方法,可保证dao只被创建一次
	 */

	public void init() throws ServletException {
		// 初始化学生Dao对象
		dao = new BloggerDao();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// 设置请求编码集为utf-8(避免中文乱码)
		request.setCharacterEncoding("utf-8");

		// 调用dao中查询博文列表的方法，获得博文列表的集合
		List<Blogger> bloggerList = null;

		try {
			bloggerList = dao.queryBlogger();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 将查询结果保存到request对象中
		request.setAttribute("bloggerList", bloggerList);

		// 通过ServletContext对象获取RequestDispatcher对象
		// 通过ServletContext对象获得的路径是 相对Web应用根的路径,即网站的绝对根路径.
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/home.jsp");

		// 请求转发给博客信息列表(/jsp/blogger/bloggerList.jsp)
		rd.forward(request, response);

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
