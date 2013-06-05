package com.stx.demo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.stx.demo.dao.StudentDao;
import com.stx.demo.entity.Student;
import com.stx.demo.util.Pager;
import com.stx.demo.util.SQLParam;
import com.stx.demo.util.PageSQLUtil;

/**
 * 学生数据访问对象类(jdbc)
 * 
 * @author getan
 * 
 */
public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbcTemplate;

	/**
	 * 根据查询条件查询学生信息列表
	 * 
	 * @param studentParams
	 * @return
	 * @throws Exception
	 */
	public List<Student> queryStudent(Student studentParams) throws Exception {
		String sql = "select * from student";
		List studentList = jdbcTemplate.query(sql, new StudentRowMapper());

		return studentList;
	}

	/**
	 * (分页)查询学生信息列表
	 * 
	 * @param pager
	 * @param params
	 *            
	 */
	public void queryStudentPage(Pager pager, Object... params) {
		// 分页查询基本sql
		String sqlPageBase = "select * from student";
		// 统计查询总记录数基本sql
		String sqlCountBase = "select count(sno) from student";
		
		// 通过以上基本sql语句创建分页SQL工具类对象
		PageSQLUtil psUtil = new PageSQLUtil(sqlPageBase, sqlCountBase);
		// 设置查询条件参数
		psUtil.addParam(new SQLParam("sname", "like", params[0] + "%"));
		psUtil.addParam(new SQLParam("ssex", "=", params[1]));
		
		// 获取分页查询sql语句
		String pageSql = psUtil.getPageSql(pager.getOffset(),pager.getMaxPageItems());
		// 一次分页查询的数据
		List stuList = jdbcTemplate.query(pageSql, new StudentRowMapper());
		// 将一次分页查询的数据放入pager对象中
		pager.setDataList(stuList);

		// 获取查询总记录数sql语句
		String countSql = psUtil.getCountSql();
		// 查询总记录数
		int count = jdbcTemplate.queryForInt(countSql);
		// 将查询总记录数放入pager对象中
		pager.setTotal(count);
	}

	/**
	 * 学生的RowMapper对象(ResultSet => Object)
	 * 
	 * @author getan
	 * 
	 */
	private class StudentRowMapper implements RowMapper {

		@Override
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student student = new Student();
			// ResultSet对象=>对象 映射操作开始
			student.setSno(rs.getString("sno"));
			student.setSname(rs.getString("sname"));
			student.setSsex(rs.getString("ssex"));
			student.setSage(rs.getInt("sage"));
			// ResultSet对象=>对象 映射操作结束

			// 返回映射后的学生对象
			return student;
		}

	}

	/**
	 * 新增学生信息
	 * 
	 * @param student
	 * @throws Exception
	 */
	public void insertStudent(Student student) throws Exception {
		String sql = "insert into student values(?,?,?,?)";
		Object[] params = { student.getSno(), student.getSname(),
				student.getSage(), student.getSsex() };
		jdbcTemplate.update(sql, params);
	}

	/**
	 * 删除学生信息
	 * 
	 * @param sno
	 */
	public void deleteStudent(String sno) {
		String sql = "delete from student where sno = ?";
		Object[] params = { sno };
		jdbcTemplate.update(sql, params);
	}

	/**
	 * 更新学生信息
	 * 
	 * @param student
	 */
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
	}

	/**
	 * @param jdbcTemplate
	 *            要设置的 jdbcTemplate
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
