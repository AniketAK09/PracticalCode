package com.inheritence;

public class Doctor {
	
	private int regNo;
	public String spec,dName;
	
	public Doctor() {
		
		System.out.println("I am default constructor of parent class");
	}
	
	public Doctor(int rn,String s,String nm)
	{
		System.out.println("I am parameterized constructor of parent class");
		regNo = rn;
		spec = s;
		dName = nm;
	}
	
	public void makeDignosys(String symptoms)
	{
		System.out.println("According to symptompus "+symptoms+" diagnosys is done ");
	}

	public void setRegNo(int rn)
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

	public void setdName(String nm)
	{
		dName = nm;
	}
	
	public String getdName()
	{
		return dName;
	}
	
	public String toString()
	{
		return "Registration no of doctor is "+regNo+"\nName of doctor is "+dName+
				"\nand speciality of doctor is "+spec;
	}

}

class Surgeon extends Doctor
{
	int experience;
	String surgeonSpeciality;
	
	public Surgeon() {
		
		System.out.println("I am default constructor of child class");
	}
	
	public Surgeon(int ex,String sp)
	{
		System.out.println("I am parameterized constructor of child class");
		experience = ex;
		surgeonSpeciality = sp;
	}
	
	public void doSurgery()
	{
		System.out.println("Operation done successfully");
	}
	
	public String toString()
	{
		return "Dr "+dName+" is speciality in "+spec+" and with experience "+ experience+
				"\nDr is expert in "+surgeonSpeciality; //+" "+super.toString();
	}
}
