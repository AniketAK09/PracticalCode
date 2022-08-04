package com.contentment;

public class Employee {
	
	private int eId;
	private String name;
	private float salary;
	private Dept dp;
	private MyDate md;
	
	public Employee() {
		
	}
	
	public Employee(int id,String nm,float sal,Dept d,MyDate m)
	{
		eId = id;
		name = nm;
		salary = sal;
		dp = d;
		md = m;
	}
	
	public String toString()
	{
		return "Employee id "+eId+"\nName "+name+"\nSalary "+salary+
				"\n"+dp+"\n"+md;
	}

	public static void main(String[] args) {
		
		Dept d = new Dept(231,"HR Department");
		
		MyDate m = new MyDate(30, 11, 2000);
		
		Employee e = new Employee(6743, "Jayesh Kashid", 24000, d, m);
		System.out.println(e);

	}

}
