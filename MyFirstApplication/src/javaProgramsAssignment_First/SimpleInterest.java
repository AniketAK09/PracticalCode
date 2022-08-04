package javaProgramsAssignment_First;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		int p,r,t;
		float si;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle amount:");
		p = sc.nextInt();
		System.out.println("Enter the simple rate:");
		r = sc.nextInt();
		System.out.println("Enter the time:");
		t = sc.nextInt();
		
		si = (float)(p*r*t)/100;
		System.out.println("simple interest is : "+si);

	}

}
