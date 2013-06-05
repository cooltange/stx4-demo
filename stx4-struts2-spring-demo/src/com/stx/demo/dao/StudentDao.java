package com.stx.demo.dao;

import java.util.List;

import com.stx.demo.entity.Student;
import com.stx.demo.util.Pager;

/**
 * 学生数据访问对象接口(jdbc)
 * 
 * @author getan
 * 
 */
public interface StudentDao {
	/**
	 * 根据查询条件查询学生信息列表
	 * 
	 * @param studentParams
	 * @return
	 * @throws Exception
	 */
	public List<Student> queryStudent(Student studentParams) throws Exception;

	/**
	 * 新增学生信息
	 * 
	 * @param student
	 * @throws Exception
	 */
	public void insertStudent(Student student) throws Exception;

	/**
	 * 删除学生信息
	 * 
	 * @param sno
	 */
	public void deleteStudent(String sno);

	/**
	 * 更新学生信息
	 * 
	 * @param student
	 */
	public void updateStudent(Student student);

	/**
	 * (分页)查询学生信息列表
	 * 
	 * @param Pager pager
	 * @return
	 */
	public void queryStudentPage(Pager pager, Object... params);

}
