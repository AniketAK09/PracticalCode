package com.contentment;

public class Employee1 {
	
	private int eId;
	private String name;
	private float salary;
	private Dept1 dp;
	private MyDate1 md;
	
	public Employee1() {
		
	}
	
	public Employee1(int id,String nm,float sal,Dept1 d,MyDate1 m)
	{
		eId = id;
		name = nm;
		salary = sal;
		dp = d;
		md = m;
	}
	
	public void setEid(int id)
	{
		eId = id;
	}
	
	public int getEid()
	{
		return eId;
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
	
	public void setDp(Dept1 d)
	{
		dp = d;
	}
	
	public Dept1 getDp()
	{
		return dp;
	}
	
	public void setMd(MyDate1 m)
	{
		md = m;
	}
	
	public MyDate1 getMd()
	{
		return md;
	}
	
	public String toString()
	{
		return "Employee id "+eId+"\nName "+name+"\nSalary "+salary+
				"\n"+dp+"\n"+md;
	}

	public static void main(String[] args) {
		
		Dept1 d = new Dept1();
		d.setDept_Id(232);
		d.setDept_Name("Addmission Dapartment");
		
		MyDate1 m = new MyDate1();
		m.setDay(23);
		m.setMonth(8);
		m.setYear(1999);
		
		Employee1 e = new Employee1();
		e.setEid(7854);
		e.setName("Kiran Gaikwad");
		e.setSalary(32000.252f);
		e.setDp(d);
		e.setMd(m);
		System.out.println(e);

	}

}
