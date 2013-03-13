package com.stx.s1.p206;

/**
 * 鸭类
 * 
 * @author stx4
 *
 */
public class Duck {
	// 身份证号码
	private int id;
	
	public Duck(){
	}
	
	public Duck(int id) {
		this.id = id;
	}

	protected void cry(){
		System.out.println("嘎嘎、嘎嘎");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Duck duck= (Duck)obj;
		
		// 身份证号码相同即是同一个鸭子
		if(this.id == duck.getId()){
			return true;
		}else{
			return false;
		}
		
	}

}
