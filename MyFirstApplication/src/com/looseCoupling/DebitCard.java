package com.looseCoupling;

public class DebitCard implements Payment {
	
	public void pay(int rs)
	{
		System.out.println(rs+" is pay through debit card");
		useDebitCard(123145,3454);
	}
	
	public void useDebitCard(int creCardNo,int pinNo)
	{
		System.out.println("Dedit card no is "+creCardNo+" and pin is "+pinNo);
	}

}
