package com.contentment;

public class MyDate {
	
	private int day;
	private int month;
	private int year;
	
	public MyDate() {
		
	}
	
	public MyDate(int d,int mn,int y)
	{
		day = d;
		month = mn;
		year = y;
	}
	
	
	public String toString() {
		
		return "Employee Date of birth is "+day+"/"+month+"/"+year;
	}

}
