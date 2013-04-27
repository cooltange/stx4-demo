package com.stx.s2.p38;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 字节文件输入流 示例(单字节读取)
 * 
 * @author getan
 * 
 */
public class P39FileInputStream {

	/**
	 * 读取文件信息
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// 创建字节输入流
		InputStream in = new FileInputStream("d:\\1.txt");

		try {
			// 用于保存读取的单字节值
			int n = 0;
			// 使用循环来重复读取字节流
			while ((n = in.read()) != -1) {
				// 循环取出字节流中单字节，将单字节转换成字符串输出
				System.out.print((char) n);
			}
		} finally {
			// 保证最后可以关闭字节文件输入流
			in.close();
		}

	}
}