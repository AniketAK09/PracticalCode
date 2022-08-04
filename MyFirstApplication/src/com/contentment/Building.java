package com.contentment;

public class Building {
	
	private int bRegNo;
	private String bName;
	private int noOfRooms;
	
	public Building() {
		
	}
	
	public Building(int brn,String bn,int nor)
	{
		bRegNo = brn;
		bName = bn;
		noOfRooms = nor;
	}

	public void setbRegNo(int brn) 
	{
		bRegNo = brn;
	}
	
	public int getbRegNo()
	{
		return bRegNo;
	}

	public void setbName(String bn) 
	{
		bName = bn;
	}
	
	public String getbName()
	{
		return bName;
	}

	public void setNoOfRooms(int nor)
	{
		noOfRooms = nor;
	}
	
	public int getNoOfRooms()
	{
		return noOfRooms;
	}

	public String toString()
	{
		return "Building registration no is "+bRegNo+"\nname of building is "+bName+
				"\nRooms inside building is "+noOfRooms;
	}

}
