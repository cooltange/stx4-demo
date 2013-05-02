package com.stx.s2.p68.guess;

import java.util.Random;

/**
 * 出题人
 * 
 * @author stx4
 * 
 */
public class QuestionMan {
	// 出题数字
	private int qtNum;

	/**
	 * 出题人构造方法
	 */
	public QuestionMan() {
		Random random = new Random();
		// 产生随机数字
		qtNum = random.nextInt(100);
	}

	public boolean isSame(int asNum) {
		if (asNum > qtNum) {
			System.out.println("太大");
			return false;
		} else if (asNum < qtNum) {
			System.out.println("太小");
			return false;
		} else {
			System.out.println("恭喜您，您猜对了，这个数就是" + qtNum);
			return true;
		}
	}
}
