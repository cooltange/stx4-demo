package com.stx.s1.p308;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC演示类 (更新功能)
 * 
 * @author getan
 * 
 */
public class JdbcUpdate {

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

			String sql = "update tbl_student set sname='王小五' where sno='3'";
			// 执行更新操作
			count = stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			// 输出更新操作的行计数(受影响的数据记录条数)
			System.out.printf("共影响记录:%d条。\n", count);
		}

	}
}
