package oopsConcept;

public class Item_ThisKeyword {
	
	private int itemId;
	private String itemName;
	private float itemCost;
	private String suppName;
	
	public Item_ThisKeyword(int i_Id,String inm)
	{
		this(123,"Bottle",20,"Rohan");
		//this(i_Id,"Bottle",20,inm);
	}
	
	public Item_ThisKeyword(int i_Id,String inm,float itemC,String snm) 
	{
		itemId = i_Id;
		itemName = inm;
		itemCost = itemC;
		suppName = snm;
	}
	
	public Item_ThisKeyword()
	{
		this(102,"shirt",400);
	}
	
	public Item_ThisKeyword(int i_Id,String inm,float itemC)
	{
		itemId = i_Id;
		itemName = inm;
		itemCost = itemC;
	}
	
	public String toString()
	{
		String s = "Item Id is: "+itemId+"\nname is: "+itemName+"\nitem cost is: "+itemCost+"\n"+
				"and supplier name is: "+suppName;
		return s;
	}
	

}
