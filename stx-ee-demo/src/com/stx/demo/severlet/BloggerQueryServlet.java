package com.stx.demo.severlet;

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
import com.stx.demo.entity.User;

public class BloggerQueryServlet extends HttpServlet {
	// 相当于java类的身份证。主要用于版本控制。
	// serialVersionUID作用是序列化时保持版本的兼容性，即在版本升级时反序列化仍保持对象的唯一性。
	private static final long serialVersionUID = 1l;

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
	 * `* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 * response)
	 */

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		//doPost(request, response);
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

		// 创建博客类数据视图对象(用于封装博文信息的查询条件)
		Blogger blogger = new Blogger();
		HttpSession session = request.getSession();
		
		//不用从登陆客户得到，直接得到主页的信息

		blogger.setTitle(request.getParameter("bl_title"));
		blogger.setContent(request.getParameter("bl_content"));

		try {
			// 调用dao中查询博文列表的方法，获得博文列表的集合
			List<Blogger> bloggerList = dao.queryBlogger(blogger);
			// 将查询结果保存到request对象中
			request.setAttribute("bloggerList", bloggerList);
			// 通过ServletContext对象获取RequestDispatcher对象
			// 通过ServletContext对象获得的路径是 相对Web应用根的路径,即绝对路径.
			RequestDispatcher rd = getServletContext().getRequestDispatcher(
					"/jsp/index.jsp");
			// 请求转发给博客信息列表(/jsp/blogger/bloggerList.jsp)
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

}