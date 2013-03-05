package com.stx.s1.p107;

/**
 * Ex-01-0215
 * 
 * 通过年月获得该月最大天数
 * 
 * @author stx4
 * 
 */
public class Ex_01_0215 {
	public static void main(String[] args) {

		System.out.println(getDays(22, 2013));

	}

	/**
	 * 通过年月获得该月最大天数
	 * 
	 * @param month
	 *            月
	 * @param year
	 *            年
	 * @return 该月最大天数
	 */
	static int getDays(int month, int year) {
		int day = 0;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				day = 29;
			} else {
				day = 28;
			}
			break;
		default:
			System.out.print("这个月不存在");
		}

		return day;
	}

}
