package com.polymorphism;

public class Shapes {
	
	public void area(int a,int b)
	{
		System.out.println("area of rectangle");
	}
	
	public void area(int a,float b)
	{
		System.out.println("area of triangle");
	}
	
	public void area(float a,float b)
	{
		System.out.println("area of suqare");
	}
	
	public static void main(String[] args) {
		
		Shapes s = new Shapes();
		byte a = 10;
		byte b = 20;
		s.area(a, b);
		
		//s.area(3,4);
		//s.area(3,4.3f);
		//s.area(3.1f,4.2f);
		
	}

}
