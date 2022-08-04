package com.contentment;

public class Person {
	
	private String name;
	private String gender;
	private int age;
	private Address add;
	
	public Person() {
		
	}
	
	public Person(String nm,String g,int a,Address ad)
	{
		name = nm;
		gender = g;
		age = a;
		add = ad;
	}
	
	
	public String toString() {
		
		return "Name of person is "+name+"\nGender "+gender+
				"\nAge is "+age+"\n"+add;
	}
	
	public static void main(String[] args) {
		
		Address a = new  Address("Karad","Maharashtra","India");
		
		Person p = new Person("Ashish Thorat","Male",22,a);
		System.out.println(p);
	}

}
