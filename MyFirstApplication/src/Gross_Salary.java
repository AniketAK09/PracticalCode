import java.util.Scanner;

public class Gross_Salary {

	public static void main(String[] args) {
		
		float basicSalary,grossSalary,da,hra;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary:");
		basicSalary = sc.nextFloat();
		
		da = basicSalary * 25 / 100;
		hra = basicSalary * 30 / 100;
		
		grossSalary = basicSalary + da + hra;
		System.out.println("Gross Salary is: "+grossSalary);
		
		if(grossSalary>=100000)
		{
			System.out.println("Person is vice president");
		}
		else if(grossSalary>=80000)
		{
			System.out.println("Person is assitant vice president");
		}
		else if(grossSalary>=60000)
		{
			System.out.println("Person is manager");
		}
		else if(grossSalary>=40000)
		{
			System.out.println("Person is assitant manager");
		}
		else
		{
			System.out.println("Person is officer");
		}

	}

}
