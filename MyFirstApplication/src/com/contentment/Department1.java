package com.contentment;

public class Department1 {
	
	private int dId;
	private String dName;
	
	public Department1() {
		
	}
	
	public Department1(int id,String dn)
	{
		dId = id;
		dName = dn;
	}
	
	public void setdId(int id)
	{
		dId = id;
	}
	
	public int getdId()
	{
		return dId;
	}
	
	public void setdName(String dn)
	{
		dName = dn;
	}
	
	public String getdName()
	{
		return dName;
	}
	
	
	public String toString() {
		
		return "Department id "+dId+
				"\nName of department is "+dName;
	}

}
