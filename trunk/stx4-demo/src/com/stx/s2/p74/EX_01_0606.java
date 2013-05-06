package com.stx.s2.p74;

import java.io.File;

/**
 * 显示指定文件夹下的文件及文件夹
 * 
 * @author cl
 * 
 */
public class EX_01_0606 {

	public static void main(String[] args) {
		File path = new File("d:\\");
		// 判断该file对象是否为文件夹
		if (path.isDirectory()) {
			// 获得该文件夹下的所有File对象(文件或者子文件夹)
			File[] listFiles = path.listFiles();
			// 循环遍历所有File对象(文件或者子文件夹)
			for (int i = 0; i < listFiles.length; i++) {
				// 输出文件名(或子文件夹名)
				System.out.print(listFiles[i].getName());
				// 判断该File对象是否为文件夹
				if (listFiles[i].isDirectory()) {
					// 为文件夹的情况下，添加备注“<DIR>”
					System.out.println("\t<DIR>");
				} else {
					// 不为文件夹的情况下，添加备注“<FILE>”
					System.out.println("\t<FILE>");
				}
			}
		} else {
			System.out.println("这是一个文件!");
		}
	}
}
