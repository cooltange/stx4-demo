package com.stx.s3.p278;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * 数字格式化
 * 
 * @author getan
 * 
 */
public class P283NumberFormat {

	public static void main(String[] args) {
		NumberFormat nf1 = NumberFormat.getIntegerInstance(Locale.CHINA);
		System.out.println(nf1.format(1234567));
	}

}
