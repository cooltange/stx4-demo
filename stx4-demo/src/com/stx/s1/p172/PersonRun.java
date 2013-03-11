package com.stx.s1.p172;

/**
 * 静态变量(类变量)与实例变量 区别
 * 
 * @author stx4
 *
 */
class Person {
	// 定义一个实例变量
	public String name;
	// 定义一个静态变量(类变量)
	public static int eyeNum;
	
	public static int getEyeNum(){
		
		return eyeNum;
		
	}
}

/**
 * 静态变量(类变量)与实例变量 区别 运行类
 * 
 * @author stx4
 *
 */
public class PersonRun {
	public static void main(String[] args) {
		// Person类已经初始化了，则eyeNum变量起作用了，输出0
		System.out.println("Person的eyeNum类变量值:" + Person.eyeNum);
		
		// 创建Person对象 p1
		Person p1 = new Person();
		
		// 通过Person对象的引用p1来访问Person对象name实例变量
		// 直接通过类访问eyeNum类变量
		System.out.println("p1变量的name 变量值是：" + p1.name + "; Person类的eyeNum 变量值是：" + Person.eyeNum); 
		
		// 直接为name实例变量赋值
		p1.name = "孙悟空";
		// 通过p访问eyeNum类变量，依然是访问Person的eyeNum类变量
		Person.eyeNum = 2;
		
		// 再次通过p1对象来访问name实例变量和eyeNum类变量
		System.out.println("p1变量的name 变量值是：" + p1.name + "; p1的eyeNum 变量值是：" + p1.eyeNum);
		
		// 前面通过p修改了Person的eyeNum，此处的Person.eyeNum将输出2
		System.out.println("Person的eyeNum类变量值:" + Person.eyeNum);
		
		// 创建Person对象 p2
		Person p2 = new Person();
		
		// p2访问的eyeNum类变量依然引用Person类的，因此依然输出2
		System.out.println("p2对象的eyeNum类变量值:" + p2.eyeNum); // 通过对象亦可访问类变量
	
	}
}
