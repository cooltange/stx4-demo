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
		setQtNum(random.nextInt(100));
	}

	public boolean isSame(int asNum) {
		if (asNum > getQtNum()) {
			System.out.println("太大");
			return false;
		} else if (asNum < getQtNum()) {
			System.out.println("太小");
			return false;
		} else {
			System.out.println("恭喜您，您猜对了，这个数就是" + getQtNum());
			return true;
		}
	}

	public int getQtNum() {
		return qtNum;
	}

	public void setQtNum(int qtNum) {
		this.qtNum = qtNum;
	}
}
