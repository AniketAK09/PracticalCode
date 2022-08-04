package com.p2;

import com.p1.A;

public class R extends A {
	
	public void m3()
	{
		//protected access modifier can be accessed outside the package through child class
		System.out.println(a);
	}

}
