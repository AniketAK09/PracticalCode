package javaProgramsAssignment_First;

import java.util.Scanner;

public class AllArithmaticOperation {

	public static void main(String[] args) {
		
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		x = sc.nextInt();
		System.out.println("Enter second number : ");
		y = sc.nextInt();
		
		System.out.println("Addition of two number is: "+(x+y));
		System.out.println("Substraction of two number is: "+(x-y));
		System.out.println("Multiplication of two number is: "+(x*y));
		System.out.println("Division of two number is: "+(x/y));
		System.out.println("Modulus of two number is: "+(x%y));

	}

}
