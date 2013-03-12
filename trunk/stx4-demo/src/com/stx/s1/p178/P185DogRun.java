package com.stx.s1.p178;

/**
 * 对象作为参数
 * 
 * @author getan
 * 
 */
public class P185DogRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog hero = new Dog();
		hero.setName("英雄");

		// 对象作为参数,只是将对象的"副本"传递给方法
		test(hero);

		// hero == null?
		// hero == "英雄"狗?
		System.out.println(hero.getName());

	}

	/**
	 * 对象作为参数 测试方法
	 * 
	 * @param dog
	 */
	static void test(Dog dog) {
		Dog p185Dog = new Dog();
		p185Dog.setName("狗熊");
		// 只是改变了"副本"的引用值
		dog = p185Dog;
	}
}
