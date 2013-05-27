package com.stx.s3.p278;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 日期格式化
 * 
 * @author getan
 *
 */
public class P281DateFormat {
	public static void main(String[] args) {
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.CHINA);
		System.out.println(df.format(new Date()));
	}
}
