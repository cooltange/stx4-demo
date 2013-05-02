package com.stx.s2.p68.guess;

import java.util.Scanner;

/**
 * 猜题人
 * 
 * @author stx4
 *
 */
public class GuessMan {

	public int guessNum() {
		// 通过标准字节输入流创建扫描器对象
		Scanner sc = new Scanner(System.in);
		// 通过扫描器对象得到用户输入的int
		return sc.nextInt();
	}

}
