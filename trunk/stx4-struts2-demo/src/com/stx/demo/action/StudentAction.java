package com.stx.demo.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.stx.demo.dao.StudentDao;
import com.stx.demo.entity.Student;

public class StudentAction extends ActionSupport {
	private Student student;
	private List<Student> stuList;
	private StudentDao dao = new StudentDao();

	/**
	 * 查询学生列表
	 * 
	 * @return
	 * @throws Exception
	 */
	public String query() throws Exception {
		stuList = dao.queryStudent(new Student());
		return "success";
	}

	/**
	 * 添加学生的方法
	 * 
	 * @return
	 * @throws Exception
	 */
	public String add() throws Exception {
		// 调用添加学生的方法
		dao.insertStudent(student);
		addActionMessage("添加学生成功!");
		return "success";
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Student> getStuList() {
		return stuList;
	}

	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
	}
}
