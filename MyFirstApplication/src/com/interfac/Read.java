package com.interfac;

public interface Read {
	
	void completeReading();
	default void increaseFont()
	{
		System.out.println("Increase the font using shortcut key"
				+ "Press cltr and + button");
	}
	
}
interface Write
{
	void writeContent(String s);
	static void makeCopy()
	{
		System.out.println("For copy the font"
				+ "press cltr and c button");
	}
}
interface Edit extends Read, Write
{
	void doEditing();
}
