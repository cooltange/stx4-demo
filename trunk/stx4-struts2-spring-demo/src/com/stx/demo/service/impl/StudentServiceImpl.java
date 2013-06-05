package com.stx.demo.service.impl;

import java.util.List;

import com.stx.demo.dao.StudentDao;
import com.stx.demo.entity.Student;
import com.stx.demo.service.StudentService;
import com.stx.demo.util.Pager;

/**
 * 学生业务实现类
 * 
 * @author getan
 *
 */
public class StudentServiceImpl implements StudentService {

	private StudentDao dao;
	
	@Override
	public List<Student> queryStudent(Student studentParams) throws Exception {
		return dao.queryStudent(studentParams);
	}
	
	@Override
	public void queryStudentPage(Pager pager, Object... params) throws Exception {
		dao.queryStudentPage(pager,params);
	}
	
	/**
	 * 新增学生信息
	 * 
	 * @param student
	 * @throws Exception
	 */
	@Override
	public void addStudent(Student student) throws Exception {
		dao.insertStudent(student);
	}
	
	/**
	 * 删除学生信息
	 * 
	 * @return
	 */
	@Override
	public void delStudent(String sno) {
		dao.deleteStudent(sno);
	}

	/**
	 * 删除多名学生
	 * 
	 * @return
	 */
	@Override
	public void delStudents(String[] snos) {
		for (String sno : snos) {
			dao.deleteStudent(sno);
		}
	}
	
	/**
	 * 更新学生信息
	 * 
	 * @return
	 */
	@Override
	public void updateStudent(Student student) {
		// TODO 自动生成的方法存根

	}

	/**
	 * @param dao
	 */
	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

}
