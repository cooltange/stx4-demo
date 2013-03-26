package com.stx.s1.p308;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC演示类 (新增功能)
 * 
 * @author getan
 * 
 */
public class JdbcInsert {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection connection = null;
		Statement stmt = null;

		// 行计数(受影响的数据记录条数)
		int count = 0;

		try {
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "stx", "stx");
			stmt = connection.createStatement();

			String sql = "insert into tbl_student values('11','王老五','42')";
			count = stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

			// 输出新增操作的行计数(受影响的数据记录条数)
			System.out.printf("共影响记录:%d条。\n", count);
		}

	}
}
