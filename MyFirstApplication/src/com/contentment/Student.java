package com.contentment;

public class Student {
	
	private int rollNo;
	private String name;
	private Department dept;
	
	public Student() {
		
	}
	
	public Student(int rl,String nm,Department dp)
	{
		rollNo = rl;
		name = nm;
		dept = dp;
	}
	
	
	public String toString() {
		
		return "Student roll no is "+rollNo+
				"\nName of student is "+name+
				"\n"+dept;
	}

	public static void main(String[] args) {
		
		Department d = new Department(12,"Computer Application");
		
		Student s = new Student(101,"Jagdish Desai", d);
		
		System.out.println(s);
		
	}

}
