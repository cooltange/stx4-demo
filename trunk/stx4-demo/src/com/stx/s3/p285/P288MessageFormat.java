package com.stx.s3.p285;

import java.text.MessageFormat;

/**
 * 消息格式化
 * 
 * @author getan
 * 
 */
public class P288MessageFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MessageFormat mf = new MessageFormat("hi {0}, nice to meet you !");
		Object[] msgArgs = { "tom" };
		String msg = mf.format(msgArgs);
		System.out.println(msg);
	}
}
