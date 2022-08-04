package com.interfac;

public class Magazine implements Edit {
	
	public void completeReading()
	{
		System.out.println("read the magazine completely");
	}
	
	public void writeContent(String a)
	{
		System.out.println("Inside magazine write some content and name of magazine is "
				+a);
	}
	
	public void doEditing()
	{
		System.out.println("Edit the content inside magazine");
	}

}
