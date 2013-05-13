package com.stx.s3.p61;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 模拟转账 <BR>
 * 事务 演示类<BR>
 * 数据库脚本请参照 ACCOUNT.sql
 * 
 * @author getan
 * 
 */
public class P61Transaction {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = null;
		Statement stmt = null;

		try {
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "stx41", "stx41");

			// 取消自动提交事务(手动处理事务的提交及回滚)
			connection.setAutoCommit(false);
			System.out.println("当前事务是否自动提交:" + connection.getAutoCommit());

			stmt = connection.createStatement();

			// 账户1 减少100
			String sql1 = "update account set balance = balance -100 where ano = 1";
			stmt.executeUpdate(sql1);

			// 模拟发生异常
			// int i = 1 / 0;

			// 账户2 增加100
			String sql2 = "update account set balance = balance +100 where ano = 2";
			stmt.executeUpdate(sql2);

			// 提交当前事务
			connection.commit();
			System.out.println("转账成功,事务已提交");

		} catch (Exception ex) {
			try {
				// 回滚当前事务
				connection.rollback();
				System.out.println("转账失败,事务已回滚");
			} catch (SQLException se) {
				se.printStackTrace();
			}
			ex.printStackTrace();
		}

		finally {
			try {
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}
