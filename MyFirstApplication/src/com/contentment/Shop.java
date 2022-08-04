package com.contentment;

public class Shop {
	
	private String sName;
	private String sLocation;
	private Product prd;
	
	public Shop() {
		
	}
	
	public Shop(String nm,String sl)
	{
		sName = nm;
		sLocation = sl;
		prd = new Product(1241,"Bottle");
	}
	
	public String toString()
	{
		return "Shop name is "+sName+
				"\nlocation of shop is "+sLocation+
				"\n"+prd;
	}
	
	public static void main(String[] args) {
		
		Shop s = new Shop("Raj Kirana","Karad");
		System.out.println(s);

	}

}
