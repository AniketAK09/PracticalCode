package com.p1;

public class A
{
	//private
	private int x = 10;
	
	//public
	public int z = 20;
	
	//default
	int y = 23;
	
	//protected
	protected int a = 34;
	
	public void show()
	{
		//private access modifier can be accessed within a class
		System.out.println(x);
		
		//public access modifier can be accessed everywhere
		System.out.println(z);
		
		//default access modifier can be accessed within a package
		System.out.println(y);
		
		
		System.out.println(a);
	}
}
class C extends A
{
	public void display()
	{
		//cannnot access private member in child class
		//System.out.println(x);
		
		//public access modifier can be access everywhere
		System.out.println(z);
		
		//default access modifier can be accessed within a package
		System.out.println(y);
		
		
		System.out.println(a);
	}
}
