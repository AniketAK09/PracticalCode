package com.interfac;

public class Book implements Edit {
	
	public void completeReading()
	{
		System.out.println("read the book completely");
	}
	
	public void writeContent(String a)
	{
		System.out.println("Inside book have some content and name of book is "
				+a);
	}
	
	public void doEditing()
	{
		System.out.println("Edit the content inside book");
	}

}
