package javaProgramsAssignment_Second;

import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		
		
		char ch;
		int no1,no2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter operation:");
		ch=sc.next().charAt(0);
		System.out.println("Enter the two number:");
		no1=sc.nextInt();
		no2=sc.nextInt();
		switch(ch)
		{
		case '+':
			System.out.println("Addition of two no is:"+(no1+no2));
			break;
		case '-':
			System.out.println("Substraction of two no is:"+(no1-no2));
			break;
		case '*':
			System.out.println("Multiplication of two no is:"+(no1*no2));
			break;
		case '/':
			System.out.println("Division of two no is:"+(no1/no2));
			break;
		case '%':
			System.out.println("Modulus of two no is:"+(no1%no2));
			break;
		default :
			System.out.println("enter valid arithmatic operation");
		}

	}

}
