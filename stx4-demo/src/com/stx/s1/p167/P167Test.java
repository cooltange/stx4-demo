package com.stx.s1.p167;

public class P167Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 通过用户类创建一个用户对象
		User userA = new User();
		
		//userA.age = 200;
		userA.setAge(200);
		
		System.out.println(userA.getAge());
		

	}

}
