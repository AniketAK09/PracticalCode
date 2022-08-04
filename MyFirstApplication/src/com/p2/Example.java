package com.p2;

import com.p1.A;

public class Example {
	
	public static void main(String[] args) {
		
		//create class A object in anothe package by importing fully qualified class name or package name
		A a = new A();
		
		//class C object is not created by another package because is not public
		//C c = new C();
		
	}

}
