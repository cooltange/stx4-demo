package com.stx.demo.entity;

import java.util.Date;

/**
 * 博客文章 实体类
 * 
 * 
 * @author yaofu
 * 
 */
public class Blogger {
	// 博文ID
	private int bl_id;
	// 用户ID
	private int us_id;
	// 博文标题
	private String bl_title;
	// 博文内容
	private String bl_content;
	// 分类ID
	private int ca_id;

	// 公开程度A=公开，M=自已可见，H=好友可见
	private String bl_levels;

	// 是否可评论 Y/N
	private String bl_readable;

	// 创建时间
	private Date bl_createtime;

	// 是否删除标志 Y/N
	private String bl_delflag;

	public int getBlogId() {
		return bl_id;
	}

	public void setBlogId(int blogId) {
		this.bl_id = blogId;
	}

	public int getUserId() {
		return us_id;
	}

	public void setUserId(int userId) {
		this.us_id = userId;
	}

	public String getTitle() {
		return bl_title;
	}

	public void setTitle(String title) {
		this.bl_title = title;
	}

	public String getContent() {
		return bl_content;
	}

	public void setContent(String content) {
		this.bl_content = content;
	}

	public int getCatId() {
		return ca_id;
	}

	public void setCatId(int catId) {
		this.ca_id = catId;
	}

	public String getLevel() {
		return bl_levels;
	}

	public void setLevel(String level) {
		this.bl_levels = level;
	}

	public String getReadable() {
		return bl_readable;
	}

	public void setReadable(String readable) {
		this.bl_readable = readable;
	}

	public Date getCreateTime() {
		return bl_createtime;
	}

	public void setCreateTime(Date createTime) {
		this.bl_createtime = createTime;
	}

	public String getDelFlag() {
		return bl_delflag;
	}

	public void setDelFlag(String delFlag) {
		this.bl_delflag = delFlag;
	}

}
