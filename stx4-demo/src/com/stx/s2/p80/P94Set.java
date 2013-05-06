package com.stx.s2.p80;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set接口及HashSet类 使用示例
 * 
 * @author getan
 * 
 */
public class P94Set {

	public static void main(String[] args) {
		// 创建多个学生对象
		Student stu1 = new Student("猪八戒", 2000);
		Student stu2 = new Student("孙悟空", 10000);
		Student stu3 = new Student("唐僧", 25);
		Student stu4 = new Student("沙僧", 10000);

		// Student[] stus = new Student[4];
		Set<Student> stuList = new HashSet<Student>();
		
		// stus[0] = stu1;
		stuList.add(stu1);
		// stus[1] = stu2;
		stuList.add(stu2);
		// stus[2] = stu3;
		stuList.add(stu3);
		// stus[3] = stu4;
		stuList.add(stu4);

		// 在Set中添加重复的stu2(孙悟空)对象
		stuList.add(stu2);
		
		// 使用迭代器遍历Set对象
		for (Iterator<Student> iterator = stuList.iterator(); iterator.hasNext();) {
			Student student = iterator.next();
			System.out.println(student);
		}
		System.out.println("====================");
		
		// Set中并没有多个stu2(孙悟空)对象(Set中的对象不能重复)
		for (Student stu : stuList) {
			System.out.println(stu);
		}

	}

}
