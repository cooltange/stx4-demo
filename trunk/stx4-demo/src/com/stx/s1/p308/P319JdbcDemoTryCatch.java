package com.stx.s1.p308;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * jdbc示例(捕获/处理异常)
 * 
 * @author stx4
 * 
 */
public class P319JdbcDemoTryCatch {

	public static void main(String[] args) {
		try {
			// 0.加载数据库驱动
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1.获取连接
			// 如果该句出现异常
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@172.17.248.254:1521:orcl", "stx41",
					"stx41");

			// 2.创建语句对象
			stmt = con.createStatement();

			// 3.执行sql语句
			rs = stmt.executeQuery("select uname from TBL_USER");// 查询

			// 4.处理执行结果
			while (rs.next()) {
				// System.out.println(rs.getString(1));// 列号(索引)
				System.out.println(rs.getString("uname"));// 列名
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5.关闭资源(释放资源的顺序与创建资源的顺序相反)
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
