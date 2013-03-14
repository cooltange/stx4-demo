package com.stx.s1.p215;

/**
 * finally 使用方法
 * 
 * @author stx4
 *
 */
public class P233 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String name = null;  //情况一 (异常发生)
		String name = "Kitty"; //情况二 (异常未发生)
		try {
			hello(name);
			System.out.println("OK");
		} catch (NullPointerException e) {
			System.out.println("出错了");
			e.printStackTrace();
		} finally {
			// 无论异常是否发生,finally中的语句都会被执行
			System.out.println("finally块");
		}
		

		System.out.println("程序结束");
	}

	private static void hello(String name) {

		if (name == null)
			throw new NullPointerException();

		System.out.println("Hello " + name); // 当name为空时这行代码不会执行

	}

}
