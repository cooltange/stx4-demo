package com.stx.s2.p106;

/**
 * 多线程编程<BR>
 * 使用继承线程类Thread方式实现
 * 
 * @author getan
 * 
 */
class SayHelloThread extends Thread {
	@Override
	public void run() {// 重写父类方法
		// 循环输出1-1000的整数
		for (int i = 0; i < 1000; i++) {
			System.out.println("Hello World,thread0!" + i);
		}
	}
}

/**
 * 线程类Thread 示例类
 * 
 * @author getan
 * 
 */
public class P114SayHello {

	public static void main(String[] args) {
		/** main方法的主线程开始 */

		// 创建线程类Thread的子类的对象
		SayHelloThread thread0 = new SayHelloThread();
		// 启动一个新线程
		thread0.start();

		// 在main方法的主线程中 循环输出1-1000的整数
		for (int i = 0; i < 1000; i++) {
			System.out.println("main thread!" + i);
		}

		/** main方法的主线程结束 */
	}

}
