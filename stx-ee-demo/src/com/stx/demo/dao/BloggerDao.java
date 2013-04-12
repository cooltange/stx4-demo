package com.stx.demo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.stx.demo.entity.Blogger;
import com.stx.demo.util.JdbcUtil;

/**
 * 博文数据访问类
 * 
 * @author getan
 * 
 * @createDate 2013-4-12
 * 
 */
public class BloggerDao {

	public ArrayList<Blogger> queryBlogger(Blogger blogger) throws Exception {
		// 获取connection对象
		Connection con = JdbcUtil.getConnection();
		// 创建语句对象
		Statement st = con.createStatement();

		// 查询出最新更新的十条博文信息
		String sql = "Select u.US_ID, u.US_BLOGNAME, b.*\n"
				+ "  From tbl_demo_user u, tbl_demo_blogger b\n"
				+ " Where u.US_ID = b.US_ID\n" + "   And (RowNum <= 10)\n"
				+ " Order By b.bl_createtime Desc";

		// 执行查询操作返回查询结果集对象
		ResultSet rs = st.executeQuery(sql);

		// 创建博客对象(用于存放从数据库查询出博客的信息)
		ArrayList<Blogger> bloggerList = new ArrayList<Blogger>();

		while (rs.next()) {
			// 创建博客对象
			Blogger bloggers = new Blogger();

			// 将数据库记录的每一个字段的值 赋值给 "博客对象"对应的属性.
			bloggers.setBlogId(rs.getInt("bl_id"));
			bloggers.setUserId(rs.getInt("us_id"));
			// bloggers.setUs_blogname(rs.getString("us_blogname"));
			bloggers.setTitle(rs.getString("bl_title"));

			// 如果博文内容大于200字节就截取
			String contents = rs.getString("bl_content");// 博文内容
			// 处理后的文章内容
			String content = null;
			if (contents.length() > 100) {
				content = contents.substring(0, 100);// 截取文章内容的前100个字符
			} else {
				content = contents;
			}

			bloggers.setContent(content);
			bloggers.setCatId(rs.getInt("ca_id"));
			bloggers.setLevel(rs.getString("bl_levels"));
			bloggers.setReadable(rs.getString("bl_readable"));
			bloggers.setCreateTime(rs.getTimestamp("bl_createtime"));

			bloggerList.add(bloggers);
		}

		// 释放数据库连接资源
		JdbcUtil.release();

		// 返回用户信息列表对象(给servlet)
		return bloggerList;
	}
}