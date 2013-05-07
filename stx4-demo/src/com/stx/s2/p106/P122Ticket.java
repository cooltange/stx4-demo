package com.stx.s2.p106;

/**
 * 售票示例类(实现同步)
 * 
 * 多线程中实现同步控制的示例
 * 
 * @author getan
 * 
 */
public class P122Ticket {

	public static void main(String[] args) {
		// 创建车票对象
		SynchronizedTicket ticket = new SynchronizedTicket();

		// 创建一个售票窗口售票
		new Thread(ticket, "A").start();

	}

}

/**
 * 车票类(实现同步)
 * 
 * @author getan
 * 
 */
class SynchronizedTicket implements Runnable {// 实现Runnable接口方便多个售票窗口售票
	// 车票的总数(成员变量)
	private int ticket = 10;
	Object lockObj = new Object();

	public void run() {
		// 假设每个窗口排了50个购票人
		for (int i = 1; i < 50; i++) {
			// 使用同步块，保证每次售票操作只运行一个线程访问。
			synchronized (lockObj) {
				// 在有票的情况下才售票
				if (ticket > 0) {
					// 当前线程休眠1秒(为了使"同步"必要性的效果更明显)
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					// 售票并显示是哪个窗口售出的票
					System.out.println(Thread.currentThread().getName()
							+ "号窗口卖出" + this.ticket-- + "号票");
				}
			}
		}
	}
}