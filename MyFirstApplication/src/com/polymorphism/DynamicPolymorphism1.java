package com.polymorphism;

class GrandFather
{
	public void business()
	{
		System.out.println("Grandfather ran his business in the old fashioned way");
	}
}
class Father extends GrandFather
{
	public void business()
	{
		System.out.println("His son did his business a little bit in advance");
	}
}
class Child extends GrandFather
{
	public void business()
	{
		System.out.println("But his grandson took his business completely online and it started to be very profitable in the business");
	}
}

public class DynamicPolymorphism1 {
	
	public static void main(String[] args) {
		
		GrandFather gf;
		
		gf = new GrandFather();
		gf.business();
		
		gf = new Father();
		gf.business();
		
		gf = new Child();
		gf.business();
	}

}
