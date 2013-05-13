package com.stx.s3.p90.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Properties;

/**
 * Jdbc工具类<BR>
 * 用于获取connection对象及释放连接资源对象
 * 
 * @author getan
 * 
 */
public class JdbcUtil {

	private static ResultSet rs;
	private static Statement stmt;
	private static Connection con;

	private static String driver;
	private static String url;
	private static String username;
	private static String password;

	static {
		try {
			Properties ptes = new Properties();
			ptes.load(ClassLoader
					.getSystemResourceAsStream("com\\stx\\s3\\p90\\dbcfg.properties"));

			driver = ptes.getProperty("driver");
			url = ptes.getProperty("url");
			username = ptes.getProperty("username");
			password = ptes.getProperty("password");

			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void printRs(ResultSet rs) {
		if (rs == null) {
			System.out.println("resultset is null");
			return;
		}
		try {
			StringBuffer sb = new StringBuffer();
			ResultSetMetaData md = rs.getMetaData();
			int cols = md.getColumnCount();

			for (int i = 1; i <= cols; i++) {
				sb.append(md.getColumnName(i) + "->");
				sb.append(md.getColumnType(i) + "&");
				sb.append(md.getColumnTypeName(i) + " "
						+ md.getColumnDisplaySize(i) + "\n");
			}
			sb.append("\n\n");

			while (rs.next()) {
				for (int i = 1; i <= cols; i++) {
					sb.append(md.getColumnName(i) + "=");
					sb.append(rs.getString(i) + " ");
				}
				sb.append("\n");
			}
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void release(ResultSet rs, Statement stmt, Connection con) {
		try {
			if (rs != null)
				rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		release(stmt, con);

	}

	public static void release(Statement stmt, Connection con) {
		try {
			if (stmt != null)
				rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (con != null)
				rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}