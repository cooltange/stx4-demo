package com.stx.s1.p157;

/**
 * 汽车类
 * 
 * @author stx4
 *
 */
public class Car {

	private int speed;

	public void brake() {
		speed -= 10;
	}

	public void boost() {
		speed += 10;
	}

	public int getSpeed() {
		return speed;
	}

}