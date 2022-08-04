package com.p2;

import com.p1.A;

public class D {
	
	public void m1()
	{
		A a = new A();
		//cannnot access private member in another package of non subclass
		//System.out.println(a.x);
		
		//public access modifier can be access everywhere
		System.out.println(a.z);
		
		//default access modifier cannot be accessed outside a package
		//System.out.println(a.y);
	}

}
class E extends A
{
	public void m2()
	{
		//cannnot access private member in another package of subclass
		//System.out.println(x);
		
		//public access modifier can be access everywhere
		System.out.println(z);
		
		//default access modifier cannot be accessed outside a package
		//System.out.println(y);
	}
}
