package com.stx.s3.p285;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 输出文本信息(使用 I18N 国际化)
 * 
 * @author getan
 * 
 */
public class P286I18N {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String language;
		String country;

		if (args.length != 2) {
			language = new String("en");
			country = new String("US");
		} else {
			language = new String(args[0]);
			country = new String(args[1]);
		}

		Locale currentLocale;

		ResourceBundle messages;

		currentLocale = new Locale(language, country);

		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);

		System.out.println(messages.getString("greetings"));
	}

}
