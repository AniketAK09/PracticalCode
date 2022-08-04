package javaProgramsAssignment_First;

import java.util.Scanner;

public class WithoutTVSwapping {

	public static void main(String[] args) {
		
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a:");
		a = sc.nextInt();
		System.out.println("Enter value of b:");
		b = sc.nextInt();
		
		System.out.println("Before Swapping Value Of a is "+a+" and b is "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping Value Of a is "+a+" and b is "+b);

	}

}
