package com.contentment;

public class Society {
	
	private int sRegNo;
	private String sName;
	private String sLocation;
	private Building bul;
	
	public Society() {
		
	}
	
	public Society(int srn,String sn,String sl,Building b)
	{
		sRegNo = srn;
		sName = sn;
		sLocation = sl;
		bul = b;
	}
	
	public void setsRegNo(int srn)
	{
		sRegNo = srn;
	}
	
	public int getsRegNo()
	{
		return sRegNo;
	}
	
	public void setsName(String sn)
	{
		sName = sn;
	}
	
	public String getsName()
	{
		return sName;
	}
	
	public void setsLocation(String sl)
	{
		sLocation = sl;
	}
	
	public String getsLocation()
	{
		return sLocation;
	}

	public void setBul(Building b)
	{
		bul = b;
	}
	
	public Building getBul()
	{
		return bul;
	}

	public String toString()
	{
		return "Society registration no is "+sRegNo+"\nname of society is "+sName+
				"\nand location is "+sLocation+
				"\n"+bul;
	}
	
	public static void main(String[] args) {
		
		Building b = new Building();
		b.setbRegNo(6785);
		b.setbName("Ashthavinayak Apartment");
		b.setNoOfRooms(12);
		
		Society s = new Society();
		s.setsRegNo(4532);
		s.setsName("Nandanvan Society");
		s.setsLocation("Kothrud");
		s.setBul(b);
		System.out.println(s);

	}

}
