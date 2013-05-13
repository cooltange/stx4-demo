package com.stx.s3.p90.dao;

import java.sql.SQLException;
import java.util.List;

import com.stx.s3.p90.entity.StudentEntity;

/**
 * 学生数据访问对象接口<BR>
 * 该接口声明了 学生相关的CRUD抽象方法<BR>
 * 具体实现类为StudentDaoImpl类
 * 
 * @author getan
 * 
 */
public interface StudentDao {
	/**
	 * 新增学生信息
	 * 
	 * @param entity
	 * @return 新增是否成功
	 * @throws SQLException
	 */
	boolean insertStudent(StudentEntity entity) throws SQLException;

	/**
	 * 通过学号删除一个学生
	 * 
	 * @return 删除是否成功
	 */
	boolean deleteStudent(String sno) throws SQLException;

	/**
	 * 通过查询条件查询学生信息集合
	 * 
	 * @param entity
	 * @return 学生信息集合
	 */
	List<StudentEntity> queryStudent(StudentEntity entity) throws SQLException;

	/**
	 * 更新学生信息
	 * 
	 * @param entity
	 * @return 更新是否成功
	 */
	boolean updateStudent(StudentEntity entity) throws SQLException;
}
