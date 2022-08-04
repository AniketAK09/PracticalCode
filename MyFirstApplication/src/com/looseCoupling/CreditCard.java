package com.looseCoupling;

public class CreditCard implements Payment {
	
	public void pay(int rs)
	{
		System.out.println(rs+" is pay through credit card");
		useCreditCard(213241,2212);
	}
	
	public void useCreditCard(int creCardNo,int pinNo)
	{
		System.out.println("Credit card no is "+creCardNo+" and pin is "+pinNo);
	}

}
