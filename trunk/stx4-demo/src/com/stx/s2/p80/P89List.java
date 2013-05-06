package com.stx.s2.p80;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List接口及ArrayList类 使用示例
 * 
 * @author getan
 * 
 */
public class P89List {

	public static void main(String[] args) {
		// 创建多个学生对象
		Student stu1 = new Student("猪八戒", 2000);
		Student stu2 = new Student("孙悟空", 10000);
		Student stu3 = new Student("唐僧", 25);
		Student stu4 = new Student("沙僧", 10000);
		Student stu5 = new Student("白龙马", 10000);

		// Student[] stus = new Student[4];
		// 创建列表对象(用于存放多个学生对象)
		List<Student> stuList = new ArrayList<Student>();

		// stus[0] = stu1;
		stuList.add(stu1);
		// stus[1] = stu2;
		stuList.add(stu2);
		// stus[2] = stu3;
		stuList.add(stu3);
		// stus[3] = stu4;
		stuList.add(stu4);

		// 将索引为3(位置为4)的对象替换为 stu5
		stuList.set(3, stu5);

		// 传统for循环遍历一个List对象
		for (int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
		System.out.println("=========================");

		// 使用迭代器遍历List对象
		for (Iterator<Student> iterator = stuList.iterator(); iterator.hasNext();) {
			Student student = iterator.next();
			System.out.println(student);
		}
		System.out.println("=========================");

		// foreach方式遍历一个List对象
		for (Student stu : stuList) {
			System.out.println(stu);
		}

	}

}
