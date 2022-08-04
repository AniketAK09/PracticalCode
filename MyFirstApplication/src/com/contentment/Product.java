package com.contentment;

public class Product {
	
	private int pId;
	private String pName;
	
	public Product() {
		
	}
	
	public Product(int id,String pn)
	{
		pId = id;
		pName = pn;
	}
	
	public String toString()
	{
		return "Product id is "+pId+
				"\nName of product is "+pName;
	}

}
