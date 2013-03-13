package com.stx.s1.p195;

/**
 * 造物者类
 * @author getan
 *
 */
class Creature {
	public Creature() {
		// super();(隐式声明)
		System.out.println("Creature无参数的构造器");
	}
}

/**
 * 动物类
 * 
 * @author stx4
 *
 */
class Animal extends Creature {
	public Animal(String name) {
		// super();(隐式声明)
		System.out.println("Animal带一个参数的构造器，" + "该动物的name为" + name);
	}

	public Animal(String name, int age) {
		// super();(隐式声明)
		// 使用this调用同一个重载的构造器
		this(name);
		System.out.println("Animal带两个参数的构造器，" + "其age为" + age);
	}

	public Animal() {
		// super(); (隐式声明)
		System.out.println("Animal无参数的构造器");
	}
}

/**
 * 狼类
 * 
 * @author stx4
 *
 */
public class Wolf extends Animal {
	public Wolf() {
		// 显式调用父类有两个参数的构造器
		super("灰太狼", 3);
		// 如果显示声明super构造方法(无论有参无参),即该隐式调用父类无参构造方法无效.
		// super();(隐式声明) 
		System.out.println("Wolf无参数的构造器");
	}

}
