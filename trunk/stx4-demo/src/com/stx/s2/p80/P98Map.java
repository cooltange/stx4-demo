package com.stx.s2.p80;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map接口及HashMap类 使用示例
 * 
 * @author getan
 * 
 */
public class P98Map {

	public static void main(String[] args) {
		// 创建Map对象(使用带泛型的HashMap类)
		Map<String, Student> map = new HashMap<String, Student>();

		// 创建多个学生对象
		Student stu1 = new Student("猪八戒", 2000);
		Student stu2 = new Student("孙悟空", 10000);
		Student stu3 = new Student("唐僧", 25);
		Student stu4 = new Student("沙僧", 10000);

		map.put("二师兄", stu1);
		map.put("大师兄", stu2);
		map.put("师傅", stu3);
		map.put("沙师弟", stu4);

		// 通过key获得value对象
		// Student student = map.get("大师兄");
		// System.out.println(student);

		// 通过先获得key的set集合的方式遍历Map
		Set<String> stuKeySet = map.keySet();
		// 遍历keySet的同时遍历所有的value对象
		for (String keyStr : stuKeySet) {
			Student stu = map.get(keyStr);
			System.out.println(stu);
		}

		System.out.println("======================");

		// 通过直接获得value的Collection集合的方式遍历Map
		Collection<Student> stuValues = map.values();
		for (Student student : stuValues) {
			System.out.println(student);
		}

	}

}
