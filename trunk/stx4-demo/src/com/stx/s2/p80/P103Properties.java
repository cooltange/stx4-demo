package com.stx.s2.p80;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties类 示例
 * 
 * @author getan
 * 
 */
public class P103Properties {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		// 创建Properties对象
		Properties props = new Properties();

		// 加载文件字节输入流(文件中是key=value的结构)
		props.load(new FileInputStream("D:\\test.properties"));

		// 通过key获得value的值
		String name = props.getProperty("name");

		// 输出配置文件中的值
		System.out.println("Hello " + name);

	}

}
