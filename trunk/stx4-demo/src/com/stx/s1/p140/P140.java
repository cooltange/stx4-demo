package com.stx.s1.p140;

/**
 * 字符串 : ==与 equals
 * 
 * @author getan
 * 
 */
public class P140 {

	public static void main(String[] args) {
		String a = "test";
		String b = "test";
		String c = new String("test");
		String d = "te" + "st";
		String e = "te";
		String f = "st";
		String g = e + f;
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(c == a);
		System.out.println(a.equals(c));
		System.out.println(d == a);// d在编译时已确定字符串值
		System.out.println(a.equals(d));
		System.out.println(g == a);// g在编译时未确定字符串值
		System.out.println(a.equals(g));

	}
}
