package javaProgramsAssignment_First;

import java.util.Scanner;

public class WIthTVSwapping {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a:");
		a = sc.nextInt();
		System.out.println("Enter value of b:");
		b = sc.nextInt();
		
		System.out.println("Before Swapping Value Of a is "+a+" and b is "+b);
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("After Swapping Value Of a is "+a+" and b is "+b);

	}

}
