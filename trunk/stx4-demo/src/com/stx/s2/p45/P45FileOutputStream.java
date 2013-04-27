package com.stx.s2.p45;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节文件输出流 示例(字节数组读取)
 * 
 * @author getan
 * 
 */
public class P45FileOutputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			// 创建字节输入流
			fis = new FileInputStream("d:\\1.txt");
			// 创建字节输入流
			fos = new FileOutputStream("d:\\3.txt"); // 覆盖模式(默认)
			//fos = new FileOutputStream("d:\\3.txt",true); // 追加模式
			
			// 创建缓冲字节数组
			byte[] bbuf = new byte[32];
			// 每次读取字节数
			int hasRead = 0;
			// 循环从输入流中取出数据
			while ((hasRead = fis.read(bbuf)) != -1) {
				// 每读取一次，即写入文件输出流，读了多少，就写多少。
				fos.write(bbuf, 0, hasRead);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			// 使用finally块来关闭文件输入流
			if (fis != null) {
				fis.close();
			}
			// 使用finally块来关闭文件输出流
			if (fos != null) {
				fos.close();
			}
		}
	}
}
