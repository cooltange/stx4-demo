package com.stx.s1.p199;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

/**
 * 类型变换
 * 
 * @author stx4
 * 
 */
public class P202 {

	public static void main(String[] args) {
		// 向上变换
		Duck duck = new DonaDuck();

		if (duck instanceof DonaDuck) {
			// 向下变换
			DonaDuck dona = (DonaDuck) duck;

			dona.greet();
		}

	}

}
