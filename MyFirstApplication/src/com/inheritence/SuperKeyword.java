package com.inheritence;

class Employee
{
	static int dId;
	int eId;
	String eName;
	
	public Employee() {
		
	}
	
	public Employee(int id,String nm)
	{
		eId = id;
		eName = nm;
	}
	
	public void showEmployeeDetails()
	{
		System.out.println("Employee id is: "+eId);
		System.out.println("Employee name "+eName);
	}
}
class Dev extends Employee
{
	String skills;
	
	public Dev() {
		
	}
	
	public Dev(String sk)
	{
		super(4567,"Sudhir Desai");
		skills = sk;
	}
	
	public void showDeveloperDetails()
	{
		System.out.println("Employee id is: "+eId);
		System.out.println("Employee name "+eName);
		System.out.println("Technical skills of employee is "+skills);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		
		Employee e = new Employee(2341,"Anshul Gajbhiye");
		e.showEmployeeDetails();
		
		System.out.println("______________************_____________");
		
		Dev d = new Dev("Java, Servlet and JSP, Kotlin, Spring Boot");
		d.showDeveloperDetails();

	}

}
