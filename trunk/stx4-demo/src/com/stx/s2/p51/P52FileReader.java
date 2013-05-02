package com.stx.s2.p51;

import java.io.FileReader;
import java.io.IOException;

/**
 * 字符文件输入流 示例(字符数组读取)
 * 
 * @author getan
 * 
 */
public class P52FileReader {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		try {
			// 创建字符输入流
			fr = new FileReader("d:\\1.txt");
			// 创建一个长度为32的字符数组
			char[] cbuf = new char[1024];
			// 用于保存实际读取的字符数
			int hasRead = 0;
			// 使用循环来重复读取字符流
			while ((hasRead = fr.read(cbuf)) != -1) {
				// 取出字符流中字符(数组)，将字符数组转换成字符串输出
				System.out.print(new String(cbuf, 0, hasRead));
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			// 使用finally块来关闭文件输入流
			if (fr != null) {
				fr.close();
			}
		}
	}
}
