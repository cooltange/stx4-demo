package com.stx.s1.p165;

/**
 * 封装 演示类
 * 
 * @author getan
 * 
 */
public class P167 {

	public static void main(String[] args) {
		User user1 = new User();

		// 用户类 name属性被private(私有),以下操作无效(编译失败)
		// user.name = "猪八戒";

		user1.setName("猪八戒");

		System.out.println("user1:" + user1.getName());

		User user2 = new User();
		// User类的setName()方法 被加入了 控制逻辑,以下操作均未无效操作(赋值无效)
		user2.setName("");
		user2.setName(null);

		System.out.println("user2:" + user2.getName());
	}

}
