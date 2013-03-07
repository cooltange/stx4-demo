package com.stx.s1.p151;

import java.util.Arrays;

/**
 * 方法调用中的参数传递
 * 
 * @author getan
 * 
 */
public class P151 {

	public static void main(String[] args) {

		TestParameters param = new TestParameters();
		// 不变
		String s = "";

		int n = 0;
		
		// 变
		StringBuffer buffer = new StringBuffer("");

		String[] strings = new String[1];

		strings[0] = "";

		int[] numbers = new int[] { 0 };
		
		// 不变
		System.out.println(s);
		System.out.println(n);
		
		// 变
		System.out.println(buffer);
		System.out.println(Arrays.toString(strings));
		System.out.println(Arrays.toString(numbers));

		param.increase(n);
		param.increase(numbers);
		param.append(s);
		param.append(buffer);
		param.append(strings);

		System.out.println("------------分割线--------------");

		// 不变
		System.out.println(n);
		System.out.println(s);
		// 变
		System.out.println(buffer);
		System.out.println(Arrays.toString(strings));
		System.out.println(Arrays.toString(numbers));
	}

}

class TestParameters {

	public void increase(int n) {
		n++;
	}

	public void increase(int[] nums) {
		nums[0]++;
	}

	public void append(String s) {
		s += 1;
	}

	public void append(StringBuffer s) {
		s.append(1);
	}

	public void append(String[] strings) {
		strings[0] += 1;
	}

}
