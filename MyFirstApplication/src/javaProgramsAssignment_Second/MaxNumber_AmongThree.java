package javaProgramsAssignment_Second;

import java.util.Scanner;

public class MaxNumber_AmongThree {

	public static void main(String[] args) {
		
		/*int num1=10,num2=45,num3=32;
		
		int max = (num1>num2 && num1>num3)?num1:((num2>num3)?num2:num3);
		
		System.out.println("maximum no among three no is:"+max);*/
		
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		num1 = sc.nextInt();
		System.out.println("Enter second number:");
		num2 = sc.nextInt();
		System.out.println("Enter third number:");
		num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1+" is maximum number");
		}
		else if(num2>num3)
		{
			System.out.println(num2+" is maximum number");
		}
		else
		{
			System.out.println(num3+" is maximum number");
		}

	}

}
