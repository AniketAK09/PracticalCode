package com.contentment;

public class Address {
	
	private String city;
	private String state;
	private String country;
	
	public Address() {
		
	}
	
	public Address(String c,String st,String con)
	{
		city = c;
		state = st;
		country = con;
	}
	
	
	public String toString() {
		
		return "Person city is "+city+"\nState is "+state+
				"\nAnd country is "+country;
	}
}
