package com.stx.s2.p38;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

/**
 * 序列输入流 示例(单字节读取)
 * 
 * @author getan
 * 
 */
public class P41SequenceInputStream {

	/**
	 * 读取文件信息
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		InputStream in1 = new FileInputStream("d:\\1.txt");
		InputStream in2 = new FileInputStream("d:\\2.txt");

		// 创建序列输入流合并两个输入流
		InputStream in = new SequenceInputStream(in1,in2);

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
			in1.close();
			in2.close();
		}

	}
}