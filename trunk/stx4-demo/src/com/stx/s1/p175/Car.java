package com.stx.s1.p175;

/**
 * 汽车类
 * 
 * @author stx4
 *
 */
public class Car {

	private int speed;
	
	private String color;

	public void brake() {
		speed -= 10;
	}

	public void boost() {
		speed += 10;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * 启动汽车
	 */
	public void run(){
		// 实例方法中调用其他实例方法
		boost();
	}
	
	/**
	 * 默认无参构造方法
	 */
	public Car(){
	}
	
	/**
	 * 构造方法(设置初始速度)
	 * 
	 * @param initSpeed
	 */
	public Car(int initSpeed){
		speed = initSpeed;
	}
	
	/**
	 * 构造方法(设置初始速度和初始颜色)
	 * @param initSpeed
	 * @param initColor
	 */
	public Car(int initSpeed ,String initColor){
		//speed = initSpeed;
		this(initSpeed); // 使用this关键字调用其他构造方法
		color = initColor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
