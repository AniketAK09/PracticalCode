package com.interfac;

public class Catering implements Service {
	
	public void provideService(String s)
	{
		System.out.println("Provide a catering service very well...!!!");
	}
	
	public static void main(String[] args) {
		
		Service s;
		s = new Courier();
		s.provideService("Satish Courier Service");
		s = new Catering();
		s.provideService("Ashok Catering Service");
	}

}
