package com.stx.s2.p38;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 字节文件输入流 示例(字节数组读取)
 * 
 * @author getan
 * 
 */
public class P39FileInputStreamWithBytes {

	/**
	 * 读取文件信息
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// 创建字节输入流
		InputStream in = new FileInputStream("d:\\logo.jpg");

		// 创建一个长度为1024的字节数组
		byte[] bbuf = new byte[1024];

		try {
			// 用于保存实际读取的字节数
			int hasRead = 0;
			// 使用循环来重复读取字节流
			while ((hasRead = in.read(bbuf)) != -1) {
				// 取出字节流中字节(数组)，将字节数组转换成字符串输出
				System.out.print(new String(bbuf, 0, hasRead));
			}
		} finally {
			// 保证最后可以关闭字节文件输入流
			in.close();
		}

	}
}