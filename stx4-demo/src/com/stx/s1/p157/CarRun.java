package com.stx.s1.p157;

/**
 * 汽车运行类
 * @author stx4
 *
 */
public class CarRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 通过车类创建一个车的对象
		Car car1 = new Car();
		
		// 加速
		car1.boost();
		
		System.out.println(car1.getSpeed() + "M/H");
		
		// 加速
		car1.boost();
		
		System.out.println(car1.getSpeed() + "M/H");
		
		// 减速
		car1.brake();
		
		System.out.println(car1.getSpeed() + "M/H");

	}

}
