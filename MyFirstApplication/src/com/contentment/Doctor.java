package com.contentment;

public class Doctor {
	
	private int regNo;
	private String spec,name;
	
	public Doctor() {
		
	}
	
	public Doctor(int rn,String s,String nm)
	{
		regNo = rn;
		spec = s;
		name = nm;
	}

	/*public void setRegNo(int rn)
	{
		regNo = rn;
	}
	
	public int getRegNo()
	{
		return regNo;
	}

	public void setSpec(String s)
	{
		spec = s;
	}
	
	public String getSpec()
	{
		return spec;
	}

	public void setName(String nm)
	{
		name = nm;
	}
	
	public String getName()
	{
		return name;
	}*/
	
	public String toString()
	{
		return "Registration no of doctor is "+regNo+"\nSpeciality of doctor is "+spec+
				"\nand name of doctor is "+name;
	}
	

}
