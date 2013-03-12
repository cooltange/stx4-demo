package com.stx.s1.p178;

public class Person {
	// 实例变量
	private String name;

	// 静态变量
	private static int eyeNum;

	/**
	 * 构造方法（无参）
	 */
	public Person() {
		System.out.println("构造方法（无参）被执行!");
	}

	/**
	 * 构造方法（赋初始值）
	 * 
	 * @param name
	 */
	public Person(String name) {
		System.out.println("构造方法（赋初始值）被执行!");
		this.name = name;
	}

	/**
	 * 实例方法
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 实例方法
	 * 
	 * @param name
	 */
	public void setName(String name) {
		// 形参 name 局部变量
		this.name = name;
	}

	/**
	 * 静态方法
	 * 
	 * @return
	 */
	public static int getEyeNum() {
		return eyeNum;
	}

	/**
	 * 静态方法
	 * 
	 * @param eyeNum
	 */
	public static void setEyeNum(int eyeNum) {
		Person.eyeNum = eyeNum;
	}

	/**
	 * 说话行为(实例方法)
	 * 
	 */
	public void say() {
		System.out.println("-------------");
		System.out.println("您好,我是" + name);
		System.out.println("-------------");
	}

	//实例代码块
	{
		System.out.println("实例代码块被执行!");
	}

	// 静态代码块
	static {
		System.out.println("静态代码块被执行!");
		System.out.println("-------------");
	}

}