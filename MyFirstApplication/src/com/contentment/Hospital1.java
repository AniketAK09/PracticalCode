package com.contentment;

public class Hospital1 {

	private int noOfBeds;
	private String hName,location;
	private Doctor1 doc;
	
	public Hospital1() {
		
	}
	
	public Hospital1(int nOB,String hn,String l,Doctor1 d) {
		
		noOfBeds = nOB;
		hName = hn;
		location = l;
		doc = d;
	}

	public void setNoOfBeds(int nOB)
	{
		noOfBeds = nOB;
	}
	
	public int getNoOfBeds()
	{
		return noOfBeds;
	}

	public void sethName(String hn)
	{
		hName = hn;
	}
	
	public String gethName()
	{
		return hName;
	}

	public void setLocation(String l) 
	{
		location = l;
	}
	
	public String getLocation()
	{
		return location;
	}

	public void setDoc(Doctor1 d)
	{
		doc = d;
	}
	
	public Doctor1 getDoc()
	{
		return doc;
	}

	public String toString()
	{
		return "Hospital name "+hName+"\nno of beds inside hospital is "+noOfBeds+""
				+ "\nlocation is "+location+
				"\n"+doc;
	}

	public static void main(String[] args) {
		
		Doctor1 d = new Doctor1();
		d.setRegNo(124135);
		d.setSpec("Brain Surgeon");
		d.setName("Raviraj Jadhav");
		
		Hospital1 h = new Hospital1();
		h.setDoc(d);
		h.sethName("Krishna Hospital");
		h.setNoOfBeds(1000);
		h.setLocation("Karad");
		System.out.println(h);
		
	}

}
