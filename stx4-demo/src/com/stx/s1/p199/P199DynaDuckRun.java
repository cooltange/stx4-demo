package com.stx.s1.p199;

/**
 * 多态(编译时类型与运行时类型不一致)
 * 
 * @author getan
 *
 */
public class P199DynaDuckRun {

	public static void main(String[] args) {
		// 多态绑定
		Duck duck1 = new DonaDuck();

		duck1.cry();
		
		// 多态绑定
		Duck duck2 = new MrOu();
		
		duck2.cry();

	}

}
