package com.stx.s1.p174;

/**
 * 方法重载 练习
 * 
 * @author stx4
 * 
 */
public class P174 {
	public static void main(String args[]) {
		Calculation c = new Calculation();

		System.out.println(c.add(10, 20));
		System.out.println(c.add(40.0f, 30.0f));
		System.out.println(c.add("早上", "好"));
	}

}

class Calculation {
	public float add(float f1, float f2) {
		return f1 + f2;
	}

	public String add(String str1, String str2) {
		return str1.concat(str2);
	}

	public int add(int i1, int i2) {
		return i1 + i2;
	}

}
