package com.interfac;

public interface Cake {
	
	void bake();

}
class Strawberry implements Cake
{
	public void bake()
	{
		System.out.println("Strawberry cake is prepared");
	}
}
class BlackForest implements Cake
{
	public void bake()
	{
		System.out.println("Black forest cake is prepared");
	}
}
