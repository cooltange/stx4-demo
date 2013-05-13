package com.stx.s3.p90.test;

import java.sql.SQLException;

import com.stx.s3.p90.dao.StudentDao;
import com.stx.s3.p90.dao.impl.StudentDaoImpl;
import com.stx.s3.p90.entity.StudentEntity;

/**
 * DAO模式 演示类<BR>
 * 新增学生 只需要调用 dao对象 使用 新增方法即可完成
 * 
 * @author getan
 * 
 */
public class StudentDAOTest {

	public static void main(String[] args) throws SQLException {
		// 创建学生数据访问对象
		StudentDao dao = new StudentDaoImpl();

		// 创建学生实体对象
		StudentEntity entity = new StudentEntity();
		// 对学生实体对象赋值
		entity.setSno("s100");
		entity.setSname("张三");
		entity.setSage(20);
		entity.setSsex("男");

		// 调用学生数据访问对象的新增学生方法,将实体对象保存到数据库,并且返回保存结果
		boolean result = dao.insertStudent(entity);

		// 根据保存结果输出相关提示信息
		if (result) {
			// 输出新增操作的结果数
			System.out.printf("新增学生信息成功!");
		} else {
			System.out.printf("新增学生信息失败!");
		}
	}

}
