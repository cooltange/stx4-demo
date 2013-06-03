package com.stx.demo.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.stx.demo.dao.StudentDao;
import com.stx.demo.entity.Student;

/**
 * 学生数据访问对象 测试类
 * 
 * @author getan
 *
 */
public class StudentDaoTest {

	@Test
	public void testQueryStudent() throws Exception {
		StudentDao dao = new StudentDao();

		List<Student> stuList = dao.queryStudent(new Student());
		// 测试"查询学生信息列表"功能是否正常
		assertTrue(stuList.size() > 0);
	}

}
