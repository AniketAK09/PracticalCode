package com.abstraction;

abstract class Food1
{
	public void parcleService()
	{
		System.out.println("You have to 1% extra for parcle services");
	}
	
	abstract void prepareFood();
	
}
abstract class DietFood extends Food1
{
	/*void prepareFood()
	{
		System.out.println("Don't use any spices and oil");
	}*/
	
	abstract public void tasteIt();
	
}
class Oats extends DietFood
{
	public void tasteIt()
	{
		System.out.println("It is taste less!!!!");
	}
	
	void prepareFood()
	{
		System.out.println("Don't use any spices and oil");
	}
}

public class AbstractionExample {

	public static void main(String[] args) {
		
		//DietFood d = new Oats();
		Oats d = new Oats();
		d.tasteIt();
		d.prepareFood();
		d.parcleService();

	}

}
