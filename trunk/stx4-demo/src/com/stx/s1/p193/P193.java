package com.stx.s1.p193;

public class P193 {

	public static void main(String[] args) {
		// 创建Apple的对象
		Apple apple = new Apple();
		// Apple对象本身没有weight Field
		// 因为Apple的父类有weight Field，也可以访问Apple对象的Field
		apple.weight = 56;
		apple.setColor("红色");
		// 调用Apple对象的info方法
		apple.info();
	}
}
