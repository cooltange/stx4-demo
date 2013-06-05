package com.stx.demo.action;

import java.util.List;

import com.stx.demo.entity.Student;
import com.stx.demo.service.StudentService;

public class StudentAction extends PagerAction {
	private String sno;
	// 删除用复选框
	private String[] cbs;
	private Student student;
	private List<Student> stuList;
	private StudentService service;// 使用以下的setService方法注入实现类对象
	
	/**
	 * 查询学生列表
	 * 
	 * @return
	 * @throws Exception
	 */
	public String query() throws Exception {
		stuList = service.queryStudent(new Student());
		return "success";
	}
	
	/**
	 * 查询学生列表
	 * 
	 * @return
	 * @throws Exception
	 */
	public String queryPage() throws Exception {
		// 自定义每页最大显示记录条数
		getPager().setMaxPageItems(5);
		// 调用分页service方法
		service.queryStudentPage(getPager(), student.getSname(), student.getSsex());
		return "success";
	}

	/**
	 * 添加学生信息
	 * 
	 * @return
	 * @throws Exception
	 */
	public String add() throws Exception {
		// 调用添加学生的方法
		service.addStudent(student);
		addActionMessage("添加学生成功!");
		return "success";
	}
	
	/**
	 * 删除学生信息
	 * 
	 * @return
	 */
	public String del(){
		service.delStudent(sno);
		addActionMessage("删除学生成功!");
		return "success";
	}
	
	/**
	 * 删除多名学生
	 * 
	 * @return
	 */
	public String dels(){
		service.delStudents(cbs);
		addActionMessage("删除学生成功!");
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
	
	/**
	 * @return sno
	 */
	public String getSno() {
		return sno;
	}


	/**
	 * @param sno
	 */
	public void setSno(String sno) {
		this.sno = sno;
	}

	/**
	 * @return cbs
	 */
	public String[] getCbs() {
		return cbs;
	}

	/**
	 * @param cbs
	 */
	public void setCbs(String[] cbs) {
		this.cbs = cbs;
	}
	
	/**
	 * @param service
	 */
	public void setService(StudentService service) {
		this.service = service;
	}
}
