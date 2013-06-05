package com.stx.demo.util;

/**
 * 查询参数类，用于表示条件参数对象
 * 
 * @author getan
 * 
 */
public class SQLParam {
	private String field;
	private Object value;
	private String operator;

	/**
	 * 
	 * @param field
	 *            数据库字段名
	 * @param operator
	 *            数据库操作符 =、>=、<、like etc...
	 * @param value
	 *            参数值 Object
	 */
	public SQLParam(String field, String operator, Object value) {
		super();
		this.field = field;
		this.value = value;
		this.operator = operator;
	}

	public String getField() {
		return field;
	}

	public Object getValue() {
		return value;
	}

	public String getOperator() {
		return operator;
	}
}