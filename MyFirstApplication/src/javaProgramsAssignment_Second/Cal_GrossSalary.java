package javaProgramsAssignment_Second;

import java.util.Scanner;

public class Cal_GrossSalary {

	public static void main(String[] args) {
		
		double basicSalary,grossSalary,da,hra;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Basic Salary :- ");
		basicSalary = in.nextDouble();
		if(basicSalary <=10000)
		{
			da = basicSalary * 80 / 100;
			hra = basicSalary * 20 / 100;
		} 	
	    else if(basicSalary <=20000)
		{
			da = basicSalary * 90 / 100;
			hra = basicSalary * 25 / 100;
		}
		else 
		{
			da = basicSalary * 95 / 100;
			hra = basicSalary * 30 / 100;
		}
		grossSalary = basicSalary + da + hra;
		System.out.println("The Gross Salary is :-"+grossSalary);

	}

}
