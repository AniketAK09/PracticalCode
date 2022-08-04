package javaProgramsAssignment_First;

import java.util.Scanner;

public class CalculatePercentage {

	public static void main(String[] args) {
		
		int english,marathi,physics,chemistry,biology,sum=0;
		float percentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of english:");
		english = sc.nextInt();
		System.out.println("Enter marks of marathi:");
		marathi = sc.nextInt();
		System.out.println("Enter marks physics:");
		physics = sc.nextInt();
		System.out.println("Enter marks of chemistry:");
		chemistry = sc.nextInt();
		System.out.println("Enter marks of biology:");
		biology = sc.nextInt();
		
		sum = english + marathi + physics + chemistry + biology;
		
		percentage = (float)sum/5;
		
		System.out.println("Sum is "+sum);
		System.out.println("percentage is "+percentage);
		

	}

}
