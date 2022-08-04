package oopsConcept;

public class Item {
	
	int item_Id,item_Quantity;
	String item_Name;
	float item_Price;
	
	public void acceptItem()
	{
		item_Id = 121;
		item_Name = "Bottle";
		item_Quantity = 50;
		item_Price = 20.0f;
	}
	
	public void showItemDetails()
	{
		System.out.println("Item id is: "+item_Id);
		System.out.println("Item name is: "+item_Name);
		
	}

}
