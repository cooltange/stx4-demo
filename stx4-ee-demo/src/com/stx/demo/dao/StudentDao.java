package com.stx.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.stx.demo.entity.Student;
import com.stx.demo.util.JdbcUtil;

/**
 * 学生数据访问对象类(jdbc)
 * 
 * @author getan
 * 
 */
public class StudentDao {
	/**
	 * 根据查询条件查询学生信息列表
	 * 
	 * @param studentParams
	 * @return
	 * @throws Exception
	 */
	public List<Student> queryStudent(Student studentParams) throws Exception {
		// 获取connection对象
		Connection con = JdbcUtil.getConnection();

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("select * from student");

		// 创建学生信息列表对象(用于存放从数据库查询出的多个学生信息)
		List<Student> stuList = new ArrayList<Student>();

		while (rs.next()) {
			// 创建学生数据视图对象
			Student student = new Student();

			// 将数据库记录的每一个字段的值 赋值给 "学生对象"对应的属性.
			// 即 学生对象.学号 <= 该条学生记录的学号
			student.setSno(rs.getString("sno"));
			student.setSname(rs.getString("sname"));
			student.setSage(rs.getInt("sage"));
			student.setSsex(rs.getString("ssex"));

			// 将该学生对象 添入 学生信息列表对象
			stuList.add(student);
		}
		// 释放数据库连接资源(切勿忘记)
		JdbcUtil.release();

		// 返回学生信息列表对象(给servlet)
		return stuList;
	}

	/**
	 * 新增学生信息
	 * 
	 * @param student
	 * @throws Exception
	 */
	public void insertStudent(Student student) throws Exception {
		// 获取connection对象
		Connection con = JdbcUtil.getConnection();
		// 通过connection对象获得"预编译语句"对象
		PreparedStatement ps = con
				.prepareStatement("insert into student(sno,sname,sage,ssex) values(?,?,?,?)");

		// 设置"预编译语句"对象中的参数(从1开始计数)
		ps.setString(1, student.getSno());
		ps.setString(2, student.getSname());
		ps.setInt(3, student.getSage());
		ps.setString(4, student.getSsex());

		// 执行sql操作
		ps.executeUpdate();
		
		// 释放数据库连接资源(切勿忘记)
		JdbcUtil.release();
	}

	/**
	 * 删除学生信息
	 * 
	 * @param sno
	 */
	public void deleteStudent(String sno) {
		// TODO Auto-generated method stub
	}

	/**
	 * 更新学生信息
	 * 
	 * @param student
	 */
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
	}

}
