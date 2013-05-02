package com.stx.s2.p51;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 复制文件
 * 
 * (缓冲区)字符输入(出)流 示例
 * 
 * @author getan
 * 
 */
public class P53BufferedReader {

	/**
	 * 使用字符缓冲输入(出)流 复制文件
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// 创建字符输入流
		Reader reader = new FileReader("d:\\1.txt");
		BufferedReader bfReader = new BufferedReader(reader);

		// 创建字符输出流
		Writer writer = new FileWriter("d:\\2.txt");
		BufferedWriter bfWriter = new BufferedWriter(writer);

		try {
			// 用于保存每次读取的一行字符串
			String str = null;
			// 使用循环来重复读取每行字符
			while ((str = bfReader.readLine()) != null) {
				// 将指定的字符写入此缓冲的输出流
				bfWriter.write(str);
				// 换行
				bfWriter.newLine();
			}
		} finally {
			// 保证最后可以关闭字符缓冲输入(出)流
			bfReader.close();
			bfWriter.close();
		}

	}
}