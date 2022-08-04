package com.contentment;

public class Address1 {
	
	private String city;
	private String state;
	private String country;
	
	public Address1() {
		
	}
	
	public Address1(String c,String st,String con)
	{
		city = c;
		state = st;
		country = con;
	}
	
	public void setCity(String c)
	{
		city = c;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setState(String st)
	{
		state = st;
	}
	
	public String getState()
	{
		return state;
	}
	
	public void setCountry(String con)
	{
		country = con;
	}
	
	public String getCountry()
	{
		return country;
	}
	
	
	public String toString() {
		
		return "Person city is "+city+"\nState is "+state+
				"\nAnd country is "+country;
	}

}
