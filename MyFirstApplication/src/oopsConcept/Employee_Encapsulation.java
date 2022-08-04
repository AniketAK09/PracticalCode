package oopsConcept;

public class Employee_Encapsulation {
	
	private int eid;
	private String name;
	private float salary;
	
	public Employee_Encapsulation(int id,String nm,float sal)
	{
		eid = id;
		name = nm;
		salary = sal;
	}
	
	public void setEid(int id)
	{
		eid = id;
	}
	
	public int getEid()
	{
		return eid;
	}
	
	public void setName(String nm)
	{
		name = nm;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setSalary(float sal)
	{
		salary = sal;
	}
	
	public float getSalary()
	{
		return salary;
	}
	

}
