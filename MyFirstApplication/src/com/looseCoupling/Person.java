package com.looseCoupling;

public class Person {
	
	int age;
	String name;
	Payment dbt;
	
	public Person() {
		
	}
	
	public Person(int a,String nm,DebitCard d)
	{
		age = a;
		name = nm;
		dbt = d;
	}
	
	public Person(int a,String nm,CreditCard d)
	{
		age = a;
		name = nm;
		dbt = d;
	}
	
	public void enjoyShopping()
	{
		System.out.println(name+" is enjoying shopping....");
		dbt.pay(230);
	}

}
