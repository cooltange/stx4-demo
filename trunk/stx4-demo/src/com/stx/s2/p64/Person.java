package com.stx.s2.p64;

/**
 * 可序列化类(实现Serializable接口)
 * 
 * @author getan
 * 
 */
public class Person implements java.io.Serializable {
	/** serialVersionUID */
	private static final long serialVersionUID = -6771572682177059626L;

	private String name;
	private int age;
	private transient String firstName;// transient修饰的实例变量不会被序列化

	public Person(String name, int age, String firstName) {
		this.name = name;
		this.age = age;
		this.firstName = firstName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}