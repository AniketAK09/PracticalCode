package oopsConcept;

public class Payroll {
	
	public void showEmployeeDetails(Employee_Encapsulation et)
	{
		System.out.println("Employee id is: "+et.getEid());
		System.out.println("Employee name is: "+et.getName());
		System.out.println("Salary of employee is: "+et.getSalary());
	}

	public static void main(String[] args) {
		
		Employee_Encapsulation e = new Employee_Encapsulation(101,"Rohit Kumar",24000);
		
		Employee_Encapsulation e1 = new Employee_Encapsulation(102,"Sujit Kumbhar",30000);
		
		Payroll p = new Payroll();
		p.showEmployeeDetails(e);
		p.showEmployeeDetails(e1);
		
		
		if(e.getSalary() < e1.getSalary())
		{
			e.setSalary(e1.getSalary());
		}
		else
		{
			e1.setSalary(e.getSalary());
		}
		
		System.out.println("After changing salary.....");
		p.showEmployeeDetails(e);
		p.showEmployeeDetails(e1);
		
		if(e.getSalary() == e1.getSalary())
		{
			System.out.println("Two employee salary is same");
		}

	}

}
