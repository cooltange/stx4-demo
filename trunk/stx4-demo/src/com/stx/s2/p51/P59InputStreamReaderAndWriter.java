package com.stx.s2.p51;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * 字节流 => 字符流 综合实例 (将文件信息输出到控制台显示)
 * 
 * @author getan
 * 
 */
public class P59InputStreamReaderAndWriter {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			// 字节输入流 => 字符输入流
			Reader reader = new InputStreamReader(new FileInputStream(
					"d:\\1.txt"),"utf-8"); // 设置输入流源 及 字符编码集
			// 将普通Reader包装成BufferedReader
			br = new BufferedReader(reader);

			// 字节输出流 => 字符输出流
			Writer writer = new OutputStreamWriter(System.out); // 控制台
			// 将普通Writer包装成BufferedWriter
			bw = new BufferedWriter(writer);

			// 用于保存每次读取的一行字符串
			String str = null;
			// 使用循环来重复读取每行字符
			while ((str = br.readLine()) != null) {
				// 将指定的字符写入此缓冲的输出流
				bw.write(str);
				// 换行
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 关闭输入流
		finally {
			try {
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}
