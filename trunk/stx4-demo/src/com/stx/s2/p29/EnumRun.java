package com.stx.s2.p29;

/**
 * 枚举类 示例类
 * 
 * 
 * @author getan
 * 
 */
public class EnumRun {

	public void test(SeasonEnum season) {
		// switch语句里的表达式可以是int，byte，char，short， jdk5之后,switch语句里的表达式可以是枚举值。
		switch (season) {
		case SPRING:
			System.out.println("春暖花开，正好踏青");
			break;
		case SUMMER:
			System.out.println("夏日炎炎，游泳锻炼");
			break;
		case FALL:
			System.out.println("秋高气爽，进补及时");
			break;
		case WINTER:
			System.out.println("冬日雪飘，抱炉lol");
			break;
		}
	}

	public static void main(String[] args) {
		
		// 所有枚举类都有一个values方法，返回该枚举类的所有实例
		for (SeasonEnum s : SeasonEnum.values()) {
			System.out.println(s);
		}

		new EnumRun().test(SeasonEnum.SPRING);
	}
}