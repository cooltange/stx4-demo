package com.stx.s1.p199;

/**
 * 非多态(编译时类型与运行时类型一致)
 * @author stx4
 *
 */
public class P199StaticDuckRun {
	
	public static void main(String[] args) {
		
		Duck duck1 = new Duck();
		System.out.println("duck1");
		duck1.cry();
		
		MrOu mrOu = new MrOu();
		System.out.println("mrOu");
		mrOu.cry();
		
		DonaDuck dona = new DonaDuck();
		System.out.println("dona");
		dona.cry();
		
	}

}
