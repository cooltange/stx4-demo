package com.stx.s1.p145;

/**
 * StringBuffer(可变字符串类)基本用法
 * 
 * @author getan
 * 
 */
public class P145 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = new String("welcome to ");
		str += "here";
		System.out.println(str);

		// 创建可变字符串类的对象
		StringBuffer buffer = new StringBuffer();
		// 追加字符
		buffer.append("welcome to ");
		// 追加字符
		buffer.append("here");
		System.out.println(buffer.toString());

	}

}