package com.stx.s1.p215;

/**
 * throw、try/catch 使用方法
 * 
 * @author stx4
 * 
 */
public class P216 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = null;
		try {
			hello(name);
			System.out.println("OK");// 异常发生时不会被执行
		} catch (NullPointerException e) {
			System.out.println("出错了");
			e.printStackTrace();
		}

		// 正常执行完成
		System.out.println("程序结束");
	}

	private static void hello(String name) {
		// name 为 null 时 抛出空指针异常
		if (name == null)
			throw new NullPointerException();
		System.out.println("Hello " + name); // 当name为空时这行代码不会执行

	}

}
