package com.contentment;

public class MyDate1 {
	
	private int day;
	private int month;
	private int year;
	
	public MyDate1() {
		
	}
	
	public MyDate1(int d,int mn,int y)
	{
		day = d;
		month = mn;
		year = y;
	}
	
	public void setDay(int d)
	{
		day = d;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public void setMonth(int mn)
	{
		month = mn;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public void setYear(int y)
	{
		year = y;
	}
	
	public int getYear()
	{
		return year;
	}
	
	
	public String toString() {
		
		return "Employee Date of birth is "+day+"/"+month+"/"+year;
	}

}
