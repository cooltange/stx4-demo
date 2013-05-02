package com.stx.s2.p64;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 将对象转换为字节序列
 * 
 * @author getan
 * 
 */
public class P67ObjectOutputStream {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		try {
			// 创建一个ObjectOutputStream输出流
			oos = new ObjectOutputStream(new FileOutputStream("d:\\object.txt"));
			// 创建Peron类的对象
			Person peron = new Person("猪八戒", 2000, "朱");
			// 将peron对象写入输出流
			oos.writeObject(peron);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (oos != null)
					oos.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
