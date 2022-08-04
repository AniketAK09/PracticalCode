package javaProgramsAssignment_First;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		int r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle :");
		r = sc.nextInt();
		
		double pi=3.14,area;
		
		area=(float)pi*r*r;
		
		System.out.println("Area Of Circle Is "+area);

	}

}
