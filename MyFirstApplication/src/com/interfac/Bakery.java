package com.interfac;

public class Bakery {

	public static void main(String[] args) {
		
		Cake c;
		c = new Strawberry();
		c.bake();
		
		System.out.println(".........................");
		
		c = new BlackForest();
		c.bake();

	}

}
