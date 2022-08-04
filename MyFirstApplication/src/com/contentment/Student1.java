package com.contentment;

public class Student1 {
	
	private int rollNo;
	private String name;
	private Department1 dept;
	
	public Student1() {
		
	}
	
	public Student1(int rl,String nm,Department1 dp)
	{
		rollNo = rl;
		name = nm;
		dept = dp;
	}
	
	public void setRollNo(int rl)
	{
		rollNo = rl;
	}
	
	public int getRollNo()
	{
		return rollNo;
	}
	
	public void setName(String nm)
	{
		name = nm;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setDept(Department1 dp)
	{
		dept = dp;
	}
	
	public Department1 getDept()
	{
		return dept;
	}
	
	
	public String toString() {
		
		return "Student roll no is "+rollNo+
				"\nName of student is "+name+
				"\n"+dept;
	}

	public static void main(String[] args) {
		
		Department1 d = new Department1();
		d.setdId(1234);
		d.setdName("Management Department");
		
		Student1 s = new Student1();
		s.setRollNo(102);
		s.setName("Dhiraj Gavali");
		s.setDept(d);
		System.out.println(s);

	}

}
