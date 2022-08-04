package com.polymorphism;

public class Cafe {

	public static void main(String[] args) {
		
		Softy s;
		
		s = new Softy();
		s.enjoySofty("BlueBerry", 4);
		
		s = new Venella();
		s.enjoySofty("Chocolate",10);
		
		s = new ButterScotch();
		s.enjoySofty("Black Currant", 8);

	}

}
