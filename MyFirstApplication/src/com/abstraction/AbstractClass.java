package com.abstraction;

abstract class Food
{
	abstract void prepareFood();
	abstract void shareRecipe();
}
abstract class Maharashtrian extends Food
{
	
	
}
class PuranPoli extends Maharashtrian
{
	public void shareRecipe()
	{
		System.out.println("Recipe is shared in puran poli class");
	}
	
	void prepareFood()
	{
		System.out.println("puran poli is making done....");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		
		PuranPoli p = new PuranPoli();
		p.shareRecipe();
		p.prepareFood();

	}

}
