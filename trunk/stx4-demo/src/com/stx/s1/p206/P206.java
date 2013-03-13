package com.stx.s1.p206;

/**
 * 重写equals方法 示例
 * 
 * @author stx4
 *
 */
public class P206 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 创建一个身份证为7的鸭子
		Duck duck1 = new Duck(7);
		// 创建另一个身份证为7的鸭子
		Duck duck2 = new Duck(7);

		// 使用在Duck类内重写后的equals()方法(身份证一样即是同一只鸭子)
		boolean result = duck1.equals(duck2);

		System.out.println("相等比较结果" + result);

	}

}
