package com.stx.demo.servlet.student;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stx.demo.dao.StudentDao;
import com.stx.demo.entity.Student;

/**
 * 学生信息查询Servlet类
 * 
 * @author getan
 * 
 */
public class StudentQueryServlet extends HttpServlet {
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
		// 创建学生数据视图对象(用于封装查询学生信息的查询条件)
		Student studentParams = new Student();

		// 从页面获取查询条件
		// request.getParameter("");
		// TODO 此处忽略查询条件,待完成

		try {
			// 调用dao中查询学生信息列表方法,获得学生对象的集合
			List<Student> stuList = dao.queryStudent(studentParams);

			// 将查询结果保存到request对象中
			request.setAttribute("stuList", stuList);

			// 通过ServletContext对象获取RequestDispatcher对象
			// 通过ServletContext对象获得的路径是 相对Web应用根的路径,即绝对路径.
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/student/studentList.jsp");

			// 请求转发给学生信息列表页面(/jsp/student/studentList.jsp)
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
