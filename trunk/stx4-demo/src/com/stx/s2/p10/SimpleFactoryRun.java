package com.stx.s2.p10;

public class SimpleFactoryRun {
	
	public static void main(String[] args) {
		
		Operation oper = null;
		
		oper = OperationFactory.createOperate('-');
		
		oper.numberA = 1;
		oper.numberB = 1;
		
		double result = oper.getResult();
		
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

	protected double numberA = 0;
	protected double numberB = 0;

	/**
	 * 得到运算结果
	 * 
	 * @return
	 */
	public abstract double getResult();

}

/**
 * 加法类
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
 * 减法类
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
		Operation oper = null;
		switch (operate) {
		case '+': {
			oper = new OperationAdd();
			break;
		}
		case '-': {
			oper = new OperationSub();
			break;
		}
		}

		return oper;
	}
}
