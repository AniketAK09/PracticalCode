package com.contentment;

public class Person1 {
	
	private String name;
	private String gender;
	private int age;
	private Address1 add;
	
	public Person1() {
		
	}
	
	public Person1(String nm,String g,int a,Address1 ad)
	{
		name = nm;
		gender = g;
		age = a;
		add = ad;
	}
	
	public void setName(String nm)
	{
		name = nm;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setGender(String g)
	{
		gender = g;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAdd(Address1 ad)
	{
		add = ad;
	}
	
	public Address1 getAdd()
	{
		return add;
	}
	
	public String toString() {
		
		return "Name of person is "+name+"\nGender "+gender+
				"\nAge is "+age+"\n"+add;
	}
	
	public static void main(String[] args) {
		
		Address1 a = new  Address1();
		a.setCity("Pune");
		a.setState("Maharashtra");
		a.setCountry("India");
		
		Person1 p = new Person1();
		p.setName("Robin");
		p.setGender("Male");
		p.setAge(22);
		p.setAdd(a);
		System.out.println(p);
	}

}
