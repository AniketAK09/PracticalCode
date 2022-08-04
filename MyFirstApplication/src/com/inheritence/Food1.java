package com.inheritence;

public class Food1 {
	
	private int fPrice;
	String fName;
	int fQuantity;
	
	public Food1() {
		
		System.out.println("I am default constructor of parent class");
	}
	
	public Food1(String fn,int fp,int fq)
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
		return "Food price is "+fPrice+" Food name is "+fName+" and quantity is "+fQuantity;
	}
	
}
class JunkFood1 extends Food
{
	private int junkFPrice;
	String junkFName;
	int junkFQuanity;
	
	public JunkFood1() {
		
		super("Pav Bhaji",70,4);
		System.out.println("I am default constructor of child class");
	}
	
	public JunkFood1(int jfp,String jfn,int jfq)
	{
		super("Masala Dosa",40,10);
		System.out.println("I am parameterized constructor of child class");
		junkFPrice = jfp;
		junkFName = jfn;
		junkFQuanity = jfq;
	}
	
	public void makeJunkFood()
	{
		System.out.println("Junk food is ready for delivery");
	}
	
	public String toString()
	{
		return "Food is "+fName+"\nand also junk food is "+junkFName+"\nprice of junk food "+junkFPrice+"\nquanity of "+fName+" is "+fQuantity+
				"\nand also quantity of junk food "+junkFQuanity;
	}

}
