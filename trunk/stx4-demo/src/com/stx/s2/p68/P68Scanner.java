package com.stx.s2.p68;

import java.util.Scanner;

/**
 * Scanner示例
 * 
 * @author stx4
 *
 */
public class P68Scanner {
	
	public static void main(String[] args) {
		// 通过标准字节输入流创建扫描器对象
		Scanner sc = new Scanner(System.in);
		
		// 通过扫描器对象得到用户输入的字符串
		String inputStr = sc.next();
		
		// String => int
		int inputInt = Integer.parseInt(inputStr);
		
		// 通过标准输出流输出 转换后的 int
		System.out.println(inputInt);
		
	}

}
