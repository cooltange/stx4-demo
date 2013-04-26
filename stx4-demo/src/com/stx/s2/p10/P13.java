package com.stx.s2.p10;

/**
 * 使用抽象类的继承结构,抽象类不能被实例化，含有0个或多个抽象方法，并且抽象方法没有方法体
 * 
 * @author getan
 * 
 */
abstract class P13Employee {
	protected int basic = 2000;

	abstract void salary();// 抽象方法(无方法体)
	
	void say(){
		System.out.println("我是一个员工！");
	}
}

class P13Manager extends P13Employee {
	// 子类可以实现父类中的抽象方法,如果不实现，子类成为抽象类，用abstract关键字修饰
	void salary() {
		System.out.println("薪资等于 " + basic * 5);
	}
}

class P13Worker extends P13Employee {
	void salary() {
		System.out.println("薪资等于 " + basic * 2);
	}
}

class P13 {
	public static void main(String[] args) {
//		 P13Employee employee = new P13Employee();// 无法创建抽象类的对象(实例)
		P13Manager employee = new P13Manager();// 只能创建其子类(且实现了抽象方法)的类的对象
		employee.salary(); // 子类调用的是其具体的方法实现
	}
}