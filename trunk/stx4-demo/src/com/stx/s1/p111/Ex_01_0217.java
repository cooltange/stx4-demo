package com.stx.s1.p111;

/**
 * 8*8乘法表
 * 
 * @author qinguoqiang
 * 
 */
public class Ex_01_0217 {
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		for (i = 1; i < 9; i++) {
			for (j = 1; j < i + 1; j++) {
				System.out.printf("%d*%d=%-6d", j, i, i * j);
			}
			System.out.println();
		}
	}
}
