package com.contentment;

public class Department {
	
	private int dId;
	private String dName;
	
	public Department() {
		
	}
	
	public Department(int id,String dn)
	{
		dId = id;
		dName = dn;
	}
	
	
	public String toString() {
		
		return "Department id "+dId+
				"\nName of department is "+dName;
	}

}
