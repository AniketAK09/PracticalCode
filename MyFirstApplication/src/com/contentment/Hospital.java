package com.contentment;

public class Hospital {
	
	private int noOfBeds;
	private String hName,location;
	private Doctor doc;
	
	public Hospital() {
		
	}
	
	public Hospital(int nOB,String hn,String l,Doctor d) {
		
		noOfBeds = nOB;
		hName = hn;
		location = l;
		doc = d;
	}
	
	public String toString()
	{
		return "Hospital name "+hName+"\nno of beds inside hospital is "+noOfBeds+"\nlocation is "+location+
				"\n"+doc;
	}

	public static void main(String[] args) {
		
		Doctor d = new Doctor(123,"Neurosurgeon","Abhay Rathod");
		
		Hospital h = new Hospital(30,"Ruby","Kothrud",d);
		System.out.println(h);
		
	}

}
