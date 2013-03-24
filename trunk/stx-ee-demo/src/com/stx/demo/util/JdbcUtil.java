package com.stx.demo.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * jdbc工具类
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
			// 加载数据库源的配置文件
			ptes.load(JdbcUtil.class.getResourceAsStream("/jdbc.properties"));

			driver = ptes.getProperty("jdbc.driver");
			url = ptes.getProperty("jdbc.url");
			username = ptes.getProperty("jdbc.username");
			password = ptes.getProperty("jdbc.password");

			Class.forName(driver);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException cfe) {
			cfe.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * 获得Connection对象
	 * 
	 * @return Connection
	 */
	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	/**
	 * 释放jdbc连接资源
	 * 
	 */
	public static void release() {
		try {
			if (rs != null)
				rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
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

	public static String getCurrentDate() {
		Date date = new Date();
		date.getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss");
		return dateFormat.format(date);
	}

}