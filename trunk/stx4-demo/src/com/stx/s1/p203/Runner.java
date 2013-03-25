package com.stx.s1.p203;

public class Runner {
	public static void main(String[] args) {
		Bill phoneBill = new PhoneBill();
		Bill gasBill = new GasBill();
		print(phoneBill);
		print(gasBill);
	}
	public static void print(Bill bill)
	{
		System.out.println(bill.getName());
		System.out.println(bill.getAmount());
		if(bill instanceof PhoneBill)
		{
			PhoneBill pb = (PhoneBill)bill;
			System.out.println(pb.getCallRecords());
		}
		
	}
}
