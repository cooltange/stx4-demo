package com.stx.s2.p68.guess;

/**
 * 游戏控制人
 * 
 * @author stx4
 * 
 */
public class Manager {

	public static void main(String[] args) {

		System.out.println("请输入0-100的整数");

		// 创建出题人对象
		QuestionMan qtman = new QuestionMan();
		// 创建猜题人对象
		GuessMan asMan = new GuessMan();

		// 是否猜中
		boolean isSame = false;
		do {
			// 判断数字是否被猜中
			isSame = qtman.isSame(asMan.guessNum());
		} while (!isSame);// 猜中即结束循环，否则继续猜数字

	}

}
