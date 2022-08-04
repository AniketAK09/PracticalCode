package com.p1;

public class B {
		
	public void Eg()
	{
		A a = new A();
		//cannnot access private member in same package of non subclass
		//System.out.println(a.x);
		
		//public access modifier can be access everywhere
		System.out.println(a.z);
		
		//default access modifier can be accessed within a package
		System.out.println(a.y);
		
		//protected 
		System.out.println(a.a);
	}

}
