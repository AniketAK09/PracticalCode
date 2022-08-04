package com.contentment;

public class Dept {
	
	private int dept_id;
	private String dept_name;
	
	public Dept() {
		
	}
	
	public Dept(int id,String dn)
	{
		dept_id = id;
		dept_name = dn;
	}
	
	
	public String toString() {
		
		return "Department id "+dept_id+
				"\nDepartment name "+dept_name;
	}

}
