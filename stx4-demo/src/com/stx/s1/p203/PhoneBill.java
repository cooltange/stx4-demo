package com.stx.s1.p203;

public class PhoneBill extends Bill {
	PhoneBill()
	{
		name = "PhoneBill";
		Amount = 200;
	}
	public String getCallRecords()
	{
		return "This is CallsRecords";
	}
}
