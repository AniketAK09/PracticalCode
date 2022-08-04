package com.contentment;

public class Dept1 {
	
	private int dept_id;
	private String dept_name;
	
	public Dept1() {
		
	}
	
	public Dept1(int id,String dn)
	{
		dept_id = id;
		dept_name = dn;
	}
	
	public void setDept_Id(int id)
	{
		dept_id = id;
	}
	
	public int getDept_Id()
	{
		return dept_id;
	}
	
	public void setDept_Name(String dn)
	{
		dept_name = dn;
	}
	
	public String getDept_Name()
	{
		return dept_name;
	}
	
	
	public String toString() {
		
		return "Department id "+dept_id+
				"\nDepartment name "+dept_name;
	}

}
