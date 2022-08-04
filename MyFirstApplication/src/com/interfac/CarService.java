package com.interfac;

public class CarService implements Clean, Wash {
	
	public void doWashing()
	{
		System.out.println("Car is Washed");
	}
	
	public void doPolishing()
	{
		System.out.println("Car is Polished");
	}
	
	public void doCleaning()
	{
		System.out.println("Car is Cleaned");
	}
	
	public void doSprayWash()
	{
		System.out.println("Car is Whashed using Spray wash");
	}
	
	public void doWashing(String a)
	{
		System.out.println("Car is washed and name of this car service company is "+a);
	}

}
