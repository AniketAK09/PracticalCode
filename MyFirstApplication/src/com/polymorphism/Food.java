package com.polymorphism;

public class Food {
	
	private int fPrice;
	String fName;
	int fQuantity;
	
	public Food() {
		
		System.out.println("I am default constructor of parent class");
	}
	
	public Food(String fn,int fp,int fq)
	{
		System.out.println("I am parameterized constructor of parent class");
		fName = fn;
		fPrice = fp;
		fQuantity = fq;
	}
	
	public void makeFood()
	{
		System.out.println("Food is ready for serve");
	}

	public void setfPrice(int fp)
	{
		fPrice = fp;
	}
	
	public int getfPrice()
	{
		return fPrice;
	}

	public void setfName(String fn)
	{
		fName = fn;
	}
	
	public String getfName()
	{
		return fName;
	}

	public void setfQuantity(int fq)
	{
		fQuantity = fq;
	}
	
	public int getfQuantity()
	{
		return fQuantity;
	}
	
	public String toString()
	{
		return " Food name is "+fName+" Food price is "+fPrice+" and quantity is "+fQuantity;
	}
	
}
class JunkFood extends Food
{
	private int junkFPrice;
	String junkFName;
	int junkFQuanity;
	
	public JunkFood() {
		
		this(120,"Burger",7);
		System.out.println("I am default constructor of child class");
	}
	
	public JunkFood(int jfp,String jfn,int jfq)
	{
		super(jfn, jfp, jfq);
		System.out.println("I am parameterized constructor of child class");
		junkFPrice = jfp;
		junkFName = jfn;
		junkFQuanity = jfq;
	}
	
	public void makeJunkFood()
	{
		System.out.println("Junk food is ready for the delivery");
	}
	
	public void makeFood()
	{
		super.makeFood();
		System.out.println("And also have ready for the delivery");
	}
	
	public String toString()
	{
		return "The food is "+fName+"\nand also junk food is "+junkFName+"\nprice of junk food "+junkFPrice+"\nquanity of simple food "+fQuantity+
				"\nand also quantity of junk food "+junkFQuanity;
	}

}
