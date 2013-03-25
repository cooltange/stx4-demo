package com.stx.s1.p309;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC演示类
 * 
 * @author getan 
 * 
 */
public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		// 0.加载驱动
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 1.使用DriverManager获取数据库连接
		Connection connection = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "stx41", "stx41");

		// 2.创建语句对象(使用Connection对象来创建Statment对象)
		Statement stmt = connection.createStatement();

		// SQL语句
		String sql = "select sno,sname from tbl_student";

		// 3.执行SQL语句
		ResultSet rs = stmt.executeQuery(sql);

		// 4.处理结果(遍历查询结果集)
		while (rs.next()) {
			System.out.println(rs.getString("sno") + " , "
					+ rs.getString("sname"));
		}

		// 5.释放资源(释放资源的顺序与创建资源的顺序相反)
		rs.close();
		stmt.close();
		connection.close();
	}

}
