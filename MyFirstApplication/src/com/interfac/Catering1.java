package com.interfac;

public class Catering1 extends Food implements Wash {
	
	
	void prepareFood()
	{
		System.out.println("Don't use any spices and oil");
	}
	
	public void doSprayWash()
	{
		System.out.println("Car is Whashed using Spray wash");
	}
	
	public void doWashing(String a)
	{
		System.out.println("Car is washed and name of this car service company is "+a);
	}
	
	public static void main(String[] args) {
		
		Food f;
		f = new Catering1();
		f.prepareFood();
		f.parcleService();
		Wash w;
		w = new Catering1();
		w.doSprayWash();
		w.doWashing("Ashok servicing center");
		
		
		/*Catering1 c = new Catering1();
		c.doSprayWash();
		c.doWashing("Ananda Servicing Certer");
		c.prepareFood();*/
	}

}
