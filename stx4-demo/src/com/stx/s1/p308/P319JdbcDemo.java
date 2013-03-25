package com.stx.s1.p308;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * jdbc示例
 * 
 * @author stx4
 * 
 */
public class P319JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		// 0.加载数据库驱动
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 1.获取连接
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@172.17.248.3:1521:orcl", "stx41", "stx41");

		// 2.创建语句对象
		Statement stmt = con.createStatement();

		// 3.执行sql语句
		ResultSet rs = stmt.executeQuery("select uname from TBL_USER");// 查询

		// 4.处理执行结果
		while (rs.next()) {
			// System.out.println(rs.getString(1));// 列号(索引)
			System.out.println(rs.getString("uname"));// 列名
		}

		// 5.关闭资源
		rs.close();
		stmt.close();
		con.close();

	}

}
