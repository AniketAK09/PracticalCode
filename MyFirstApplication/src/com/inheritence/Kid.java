package com.inheritence;

public class Kid 
{
	void readBook()
	{
		System.out.println("Kid read the book");
	}
	
	void readBook(String bName,String authorName)
	{
		System.out.println("The kid is reading the book and name is "+bName+" and author name is "+authorName);
	}
}

class BigKid extends Kid
{
	protected void readBook()
	{
		super.readBook();
		System.out.println("Big kid also read the book");
	}
	
	protected void readBook(String bName,String authorName)
	{
		super.readBook("Mrityunjaya", "Shivaji Sawant");
		System.out.println("The bid kid is reading the book name is "+bName+" and author name is "+authorName);
	}
}
class Teenager extends Kid
{
	protected void readBook()
	{
		super.readBook();
		System.out.println("Teenager kid also read the book");
	}
	
	protected void readBook(String bName,String authorName)
	{
		super.readBook("Duniyadari","Suhas Shirvalkar");
		System.out.println("The teenager kid is reading the book name is "+bName+" and author name is "+authorName);

	}
}