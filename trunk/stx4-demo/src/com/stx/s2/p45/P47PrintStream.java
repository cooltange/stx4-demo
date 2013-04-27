package com.stx.s2.p45;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 打印流字节输出流
 * 
 * @author getan
 * 
 */
public class P47PrintStream {
	public static void main(String[] args) throws IOException {
		PrintStream ps = null;
		try {
			// 创建一个节点输出流：FileOutputStream
			FileOutputStream fos = new FileOutputStream("d:\\PrintStream.txt");

			// 以PrintStream来包装FileOutputStream输出流
			ps = new PrintStream(fos);

			// 使用PrintStream执行输出
			ps.print("普通字符串");

		} catch (IOException ioe) {
			ioe.printStackTrace(ps);
		} finally {
			ps.close();
		}
	}
}
