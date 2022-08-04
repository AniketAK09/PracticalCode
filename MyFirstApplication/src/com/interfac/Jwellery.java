package com.interfac;

public class Jwellery implements Shine {
	
	public void doWashing()
	{
		System.out.println("Jwellery is washed");
	}
	
	public void polish()
	{
		System.out.println("jwellery is polish");
	}

	public static void main(String[] args) {
		
		/*Jwellery j = new Jwellery();
		j.doWashing();
		j.polish();*/
		
		Shine s;
		s = new Jwellery();
		s.doWashing();
		s.polish();

	}

}
