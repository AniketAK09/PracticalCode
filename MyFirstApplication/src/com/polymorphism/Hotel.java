package com.polymorphism;

public class Hotel {
	
	public void placeHolder()
	{
		System.out.println("I have one order is booked");
	}
	
	public void placeHolder(int quantity)
	{
		System.out.println("I have ordered a shirt and quantity is: "+quantity);
	}
	
	public void placeHolder(int quantity,String menu)
	{
		System.out.println("I have order "+menu+" and quantity is "+quantity);
	}
	
	public void placeHolder(int quantity,String menu,String serProvider)
	{
		System.out.println("I have order "+menu+" and quantity is "+quantity+" name of service provider is "+serProvider);
	}

}
