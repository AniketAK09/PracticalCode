package com.interfac;

public class Main1 {

	public static void main(String[] args) {
		
		Service1 s;
		s = new Registration();
		s.provideService("Shiddhesh car service");
		s.discontinueService();
		Service1.provideOnlineService();

	}

}
