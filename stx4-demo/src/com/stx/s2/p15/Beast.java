package com.stx.s2.p15;

/**
 * 怪兽基类(包含重量和高度等基本属性)
 * 
 * @author getan
 * 
 */
public class Beast {
	// 怪兽重量
	private double weight;
	// 怪兽高度
	private double hight;

	// 获得怪物的重量
	public double getWeight() {
		return weight;
	}

	// 设置怪物的重量
	public void setWeight(double weight) {
		this.weight = weight;
	}

	// 获得怪物的高度
	public double getHight() {
		return hight;
	}

	// 设置怪物的高度
	public void setHight(double hight) {
		this.hight = hight;
	}
}
