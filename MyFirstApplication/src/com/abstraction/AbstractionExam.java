package com.abstraction;

abstract class Food2
{
	static int a = 10;
	
	public Food2() {
		
		System.out.println("Default contructor of abstract class");
	}
	
	public Food2(int b)
	{
		System.out.println("Parameterised constructor of abstract class");
	}
	
	public static void shareRecipe()
	{
		System.out.println("Recipe is shared...");
	}
	
	public void parcleService()
	{
		System.out.println("You have to 1% extra for parcle services");
	}
	
	abstract void prepareFood();
}
class PunjabiFood extends Food2
{
	public PunjabiFood() {
		
		super();
	}
	
	public PunjabiFood(int a)
	{
		super(10);
	}
	
	void prepareFood()
	{
		System.out.println("Food is making done....");
	}
}

public class AbstractionExam {

	public static void main(String[] args) {
		
		PunjabiFood p = new PunjabiFood();
		
		PunjabiFood p1 = new PunjabiFood(4);
		System.out.println(Food2.a);
		Food2.shareRecipe();
		p1.prepareFood();
		p1.parcleService();

	}

}
