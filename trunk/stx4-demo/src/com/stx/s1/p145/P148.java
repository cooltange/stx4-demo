package com.stx.s1.p145;
/**
 * 字符串与其他类型相互转换
 * 
 * @author getan
 * 
 */
public class P148 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// 字符串 => 整数及 浮点类型

		String str = "110";
		// 将字符串(内容为数值)对象转化为 int类型
		int i = Integer.parseInt(str);
		// 将字符串(内容为数值)对象转化为 int类型
		double d = Double.parseDouble(str);

		i++;
		d++;

		System.out.println(i);
		System.out.println(d);

		// 整数 => 字符串
		int a = 110;
		// 方法1:数值加上字符串 => 字符串
		String str1 = a + "";
		// 方法2:将数值类型转化为 字符串对象
		String str2 = String.valueOf(a);

		System.out.println(str1);
		System.out.println(str2);

	}

}