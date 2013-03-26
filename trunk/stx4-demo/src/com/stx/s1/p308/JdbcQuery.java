package com.stx.s1.p308;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC演示类 (查询功能)
 * 
 * @author getan
 * 
 */
public class JdbcQuery {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "stx", "stx");

			stmt = connection.createStatement();

			String sql = "select sno,sname from tbl_student";

			rs = stmt.executeQuery(sql);

			// 遍历查询结果集
			while (rs.next()) {
				System.out.println(rs.getString("sno") + " , "
						+ rs.getString("sname"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 释放资源(释放资源的顺序与创建资源的顺序相反)
				rs.close();
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}
