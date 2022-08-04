package javaProgramsAssignment_Third;

public class Item {
	
	private int itemId;
	private String itemName;
	private int price;
	private Supplier sp;
	
	public Item() {
		
	}
	
	public Item(int id,String in,int p,Supplier s)
	{
		itemId = id;
		itemName = in;
		price = p;
		sp = s;
	}

	public void setItemId(int id)
	{
		itemId = id;
	}
	
	public int getItemId()
	{
		return itemId;
	}

	public void setItemName(String in) 
	{
		itemName = in;
	}
	
	public String getItemName()
	{
		return itemName;
	}

	public void setPrice(int p)
	{
		price = p;
	}
	
	public int getPrice()
	{
		return price;
	}

	public void setSp(Supplier s)
	{
		sp = s;
	}
	
	public Supplier getSp()
	{
		return sp;
	}
	
	
	public String toString() {
		
		return "Item id "+itemId+"\nItem name "+itemName+"\nPrice "+price+
				"\n"+sp;
	}
	
	public static void main(String[] args) {
		
		Supplier s = new Supplier(2342,"Kiran Mane",9978543021l);
		
		Item i = new Item(123,"Bottle",20,s);
		System.out.println(i);
		
		System.out.println("______________*************___________________");
		
		Supplier s1 = new Supplier();
		s1.setSuppID(5643);
		s1.setSuppName("Abhinav Bhairat");
		s1.setSuppMobile(7865342110l);
		
		Item i1 = new Item();
		i1.setItemId(7837);
		i1.setItemName("shirt");
		i1.setPrice(350);
		i1.setSp(s1);
		System.out.println(i1);
	}
}
