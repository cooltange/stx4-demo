package com.stx.s3.p90.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.stx.s3.p90.dao.StudentDao;
import com.stx.s3.p90.entity.StudentEntity;
import com.stx.s3.p90.util.JdbcUtil;

/**
 * 学生数据访问对象接口实现类(jdbc方式)<BR>
 * 该实现类具体实现了StudentDao接口定义的 学生相关的CRUD抽象方法<BR>
 * 只实现了 新增学生方法,其他方法未实现,只是 "空实现".
 * 
 * @author getan
 * 
 */
public class StudentDaoImpl implements StudentDao {
	/**
	 * 新增学生信息
	 * 
	 * @param entity
	 * @return 新增是否成功
	 * @throws SQLException
	 */
	@Override
	public boolean insertStudent(StudentEntity entity) throws SQLException {

		Connection con = JdbcUtil.getConnection();
		PreparedStatement ps = con
				.prepareStatement("insert into student values(?,?,?,?)");

		ps.setString(1, entity.getSno());
		ps.setString(2, entity.getSname());
		ps.setInt(3, entity.getSage());
		ps.setString(4, entity.getSsex());

		int count = ps.executeUpdate();

		// 释放jdbc资源
		JdbcUtil.release(ps, con);

		// 判断是否新增成功
		if (count > 0) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean deleteStudent(String sno) {

		return false;
	}

	@Override
	public List<StudentEntity> queryStudent(StudentEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateStudent(StudentEntity entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
