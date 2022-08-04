package com.interfac;

public class Main implements Wash1 {
	
	public void doServicing()
	{
		System.out.println("Provide a servicing");
	}
	
	public void doWashing()
	{
		System.out.println("Car is washed");
	}
	
	public void polish()
	{
		System.out.println("Car is polished");
	}

	public static void main(String[] args) {
		
		/*Main m = new Main();
		m.doServicing();
		m.doWashing();
		m.polish();*/
		
		Wash1 w;
		w = new Main();
		w.doServicing();
		w.doWashing();
		w.polish();

	}

}
