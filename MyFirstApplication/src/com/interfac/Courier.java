package com.interfac;

public class Courier implements Service {
	
	public void provideService(String s)
	{
		System.out.println("We are there to service for you "+s);
		System.out.println("Only pay service tax amount "+Service.serviceTax);
	}

}
