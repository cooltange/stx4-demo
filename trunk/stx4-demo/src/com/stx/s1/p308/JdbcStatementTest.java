package com.stx.s1.p308;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Statement 示例类<BR>
 * 一个Statement对象 可以执行多个sql语句
 * 
 * @author getan
 * 
 */
public class JdbcStatementTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = null;
		Statement stmt = null;
		ResultSet rsStudent = null;
		ResultSet rsCourse = null;
		try {
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "stx", "stx");

			stmt = connection.createStatement();

			rsStudent = stmt.executeQuery("select sno,sname from tbl_student");
			// 遍历查询结果集
			while (rsStudent.next()) {
				System.out.println(rsStudent.getString("sno") + " , "
						+ rsStudent.getString("sname"));
			}

			System.out.println("=========================");

			rsCourse = stmt.executeQuery("select cno,cname from tbl_course");
			// 遍历查询结果集
			while (rsCourse.next()) {
				System.out.println(rsCourse.getString("cno") + " , "
						+ rsCourse.getString("cname"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 关闭资源
			try {
				if (rsCourse != null) {
					rsCourse.close();
				}
				if (rsStudent != null) {
					rsStudent.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
