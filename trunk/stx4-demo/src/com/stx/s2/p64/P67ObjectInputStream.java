package com.stx.s2.p64;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 将字节序列转换为对象
 * 
 * @author getan
 * 
 */
public class P67ObjectInputStream {
	public static void main(String[] args) {
		ObjectInputStream ois = null;
		try {
			// 创建一个ObjectInputStream输入流
			ois = new ObjectInputStream(new FileInputStream("d:\\object.txt"));
			// 从输入流中读取一个Java对象，并将其强制类型转换为Person类
			Person person = (Person) ois.readObject();
			System.out.println("名字为：" + person.getName() + "\n年龄为：" + person.getAge() + "\n姓:" + person.getFirstName());
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
