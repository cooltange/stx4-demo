package com.stx.demo.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stx.demo.dao.BloggerDao;
import com.stx.demo.entity.Blogger;

/**
 * Servlet implementation class BloggerAddServlet
 */
public class BloggerAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	BloggerDao dao ;
	
	@Override
	public void init() throws ServletException {
		dao = new BloggerDao();
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BloggerAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String btitle = request.getParameter("btitle");
		String content = request.getParameter("message");
		
		Blogger blogger = new Blogger();
		
		blogger.setTitle(btitle);
		blogger.setContent(content);
		
		// TODO
		blogger.setUserId(1);
		blogger.setCatId(1);
		
		try {
			dao.addBlogger(blogger);
			
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/newBlog.jsp");
			
			rd.forward(request, response);
			
			request.setAttribute("message", "博客文章添加成功！");
			
		} catch (SQLException e) {
			e.printStackTrace();
			
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/newBlog.jsp");
			
			rd.forward(request, response);
			
			request.setAttribute("message", "博客文章添加失败！");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
