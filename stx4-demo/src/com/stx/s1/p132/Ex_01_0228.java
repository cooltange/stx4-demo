package com.stx.s1.p132;

/**
 * 循环打印出数组中元素，打印到5停止
 * 
 * @author qinguoqiang
 * 
 */
public class Ex_01_0228 {

	public static void main(String[] args) {
		int[][] array = new int[3][];
		array[0] = new int[] { 1, 2, 3 };
		array[1] = new int[] { 4, 5, 6, 7 };
		array[2] = new int[] { 8, 9, 10, 11, 12 };

		st: for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
				if (array[i][j] == 5)
					break st;
			}
			System.out.println();
		}
	}

}