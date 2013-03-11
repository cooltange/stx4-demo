package com.stx.s1.p165;

/**
 * 用户类（P167演示类 ）
 * 
 * @author getan
 * 
 */
public class User {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String n) {
		// 设置姓名方法 加入了 控制逻辑(限制对属性的不合理操作)
		if (n == null || n.equals("")) {
			System.out.println("姓名不能为空！");
		} else {
			this.name = n;
		}
	}

}