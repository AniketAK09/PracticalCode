package com.polymorphism;

public class Softy
{
	public void enjoySofty(String softyType,int quantity)
	{
		System.out.println("Enjoy your sofy with quantity "+quantity+" and flavour "+softyType);
	}
}
class Venella extends Softy
{
	public void enjoySofty(String softyType,int quantity)
	{
		System.out.println("Enjoy your sofy with quantity "+quantity+" and flavour "+softyType);
	}
}
class ButterScotch extends Softy
{
	public void enjoySofty(String softyType,int quantity)
	{
		System.out.println("Enjoy your sofy with quantity "+quantity+" and flavour "+softyType);
	}
}
