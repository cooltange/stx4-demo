package com.stx.s2.p10;

/**
 * 简单工厂模式 <BR>
 * 静态工厂方法（StaticFactoryMethod）模式
 * 
 * @author getan
 * 
 */
public class SimpleFactoryPattern {

	public static void main(String[] args) {
		// 声明运算类变量
		Operation oper = null;

		// 通过工厂类创建指定的运算类对象
		oper = OperationFactory.createOperate('加');

		// 分别给两个运算数赋值
		oper.numberA = 10;
		oper.numberB = 8;

		// 通过运算类得到运算结果(不同的运算类，计算方法不一样)
		double result = oper.getResult();

		// 将计算结果输出至控制台
		System.out.println(result);

	}

}

/**
 * 运算类
 * 
 * @author getan
 * 
 */
abstract class Operation {
	// 运算数A
	protected double numberA = 0;
	// 运算数B
	protected double numberB = 0;

	/**
	 * 得到运算结果(无法确定具体的运算方法，所以定义为抽象方法)
	 * 
	 * @return
	 */
	public abstract double getResult();

}

/**
 * 运算实现类(加法)
 * 
 * @author getan
 * 
 */
class OperationAdd extends Operation {
	public double getResult() {
		double result = numberA + numberB;
		return result;
	}
}

/**
 * 运算实现类(减法)
 * 
 * @author getan
 * 
 */
class OperationSub extends Operation {
	public double getResult() {
		double result = numberA - numberB;
		return result;
	}
}

/**
 * 创建运算类的工厂类
 * 
 * @author getan
 * 
 */
class OperationFactory {
	public static Operation createOperate(char operate) {
		// 声明运算类变量
		Operation oper = null;

		// 通过"代表运算方式的字符"创建出对应的运算类对象
		switch (operate) {
		case '加': {
			oper = new OperationAdd();
			break;
		}
		case '减': {
			oper = new OperationSub();
			break;
		}
		// TODO

		}

		return oper;
	}
}
