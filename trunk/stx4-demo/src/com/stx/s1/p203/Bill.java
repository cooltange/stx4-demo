package com.stx.s1.p203;

public class Bill {
	
	Bill()
	{
		name = "Bill";
		Amount = 0;
	}
	protected String name;
	protected int Amount = 0;
	public String getName()
	{
		return "This is "+name;
	}
	
	public int getAmount()
	{
		return Amount;
	}
	
	
}
