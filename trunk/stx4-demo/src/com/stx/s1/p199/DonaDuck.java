package com.stx.s1.p199;

/**
 * 唐老鸭类
 * 
 * @author stx4
 * 
 */
public class DonaDuck extends Duck {
	@Override
	public void cry() {
		System.out.println("呵呵、我是唐老鸭");
	}

	/**
	 * 打招呼(唐老鸭自己的行为)
	 */
	public void greet() {
		System.out.println("你好,我是唐老鸭");
	}

}
