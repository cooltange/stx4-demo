package com.stx.s2.p10;

/**
 * 未使用抽象类的继承结构
 * 
 * @author getan
 * 
 */
class P11Employee {
	// 基本工资
	protected int basic = 2000;

	void salary() {
	};// 空方法体
}

class P11Manager extends P11Employee {
	// 子类覆盖父类方法
	void salary() {
		System.out.println("薪资等于 " + basic * 5);
	}
}

class P65Worker extends P11Employee {
	// 子类覆盖父类方法
	void salary() {
		System.out.println("薪资等于 " + basic * 2);
	}
}

public class P11 {
	public static void main(String[] args) {
		P11Employee employee = new P11Employee();// 无意义的对象(它算不出具体某岗位的工资)
		employee.salary(); // 无意义的对象里无意义的方法调用(计算工资的方法是空方法)
	}
}