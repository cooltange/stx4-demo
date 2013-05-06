package com.stx.s2.p80;

import java.util.Arrays;

/**
 * 对象的排序
 * 
 * @author getan
 * 
 */
public class P83Comparable {

	public static void main(String[] args) {
		// 基本数据类型的排序
		// int[] array = { 1, 9, 4, 2, 7, 10, 0 };
		// System.out.println(Arrays.toString(array));
		// Arrays.sort(array);
		// System.out.println(Arrays.toString(array));

		// 以下为对象(引用类型)排序
		// 创建多个学生对象
		Student stu1 = new Student("猪八戒", 2000);
		Student stu2 = new Student("孙悟空", 20000);
		Student stu3 = new Student("唐僧", 25);
		Student stu4 = new Student("沙僧", 10000);

		// 声明数组对象
		Student[] stus = new Student[4];
		// 对数组对象赋值
		stus[0] = stu1;
		stus[1] = stu2;
		stus[2] = stu3;
		stus[3] = stu4;
		// 输出排序前的顺序
		System.out.println(Arrays.toString(stus));

		// 对象数组的排序（按年龄,该对象的类必须实现comparable接口）
		Arrays.sort(stus);
		System.out.println("=========================");

		// 输出排序后的顺序(按年龄)
		System.out.println(Arrays.toString(stus));
	}

}

/**
 * 学生对象(实现了comparable接口)
 * 
 * @author getan
 * 
 */
class Student implements Comparable<Student> {

	public String name;

	public int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "姓名:" + this.name + ",年龄:" + this.age;
	}

	/*
	 * 请阅读文档中的Comparable接口的compareTo()方法用法
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Student anotherStu) {
		if (this.age > anotherStu.age) {
			// 大于情况
			return 1;
		} else if (this.age < anotherStu.age) {
			// 小于情况
			return -1;
		} else {
			// 相等情况
			return 0;
		}
	}

}
