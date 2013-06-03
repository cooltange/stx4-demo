package com.stx.demo.servlet.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stx.demo.dao.StudentDao;
import com.stx.demo.entity.Student;

/**
 * 学生信息新增Servlet类
 * 
 * @author getan
 * 
 */
public class StudentAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 学生Dao对象
	StudentDao dao = null;

	/**
	 * 初始化方法
	 * 
	 * 将初始化dao对象的操作放入init()方法,可保证dao只被创建一次
	 */
	@Override
	public void init() throws ServletException {
		// 初始化学生Dao对象
		dao = new StudentDao();
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
		
		// 创建学生数据视图对象(用于封装新增学生信息的数据)
		Student studentParams = new Student();

		// 从页面获取新增数据
		studentParams.setSno(request.getParameter("sno"));
		studentParams.setSname(request.getParameter("sname"));
		// 使用Integer.parseInt(String str)方法 将 字符串对象str 转换为 整数
		studentParams.setSage(Integer.parseInt(request.getParameter("sage")));
		studentParams.setSsex(request.getParameter("ssex"));

		try {
			// 调用dao中的新增学生信息方法
			dao.insertStudent(studentParams);
			
			// 将新增结果保存到request对象中(该提示信息会显示在JSP页面中的 <div id='msgs'>${messages}</div>处)
			request.setAttribute("messages", "添加学生成功!");
			
			// 调用查询学生列表的Servlet,再次显示新增该学生后的学生信息列表
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/studentQuery");
			// 请求转发给学生信息列表Servlet(/studentQuery)
			rd.forward(request, response);
			
		} catch (Exception e) {
			// 控制台输出异常信息
			e.printStackTrace();
			
			// 将新增结果保存到request对象中(该提示信息会显示在JSP页面中的 <div id='msgs'>${messages}</div>处)
			request.setAttribute("messages", "添加学生失败!");
			
			// 返回新增学生信息页面，重新填写学生信息
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/student/studentAdd.jsp");
			// 请求转发给新增学生信息页面(/jsp/student/studentAdd.jsp)
			rd.forward(request, response);
		}
	}
}
