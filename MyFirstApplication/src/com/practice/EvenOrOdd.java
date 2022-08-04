package com.practice;

import java.util.Scanner;

public class EvenOrOdd {
	
	public void checkEvenOrOdd(int num)
	{
		if(num % 2 == 0)
			System.out.println(num+" is Even number");
		else
			System.out.println(num+" is Odd number");
	}

	public static void main(String[] args) {
		
		EvenOrOdd e = new EvenOrOdd();
		
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number and check it is even or odd");
		no = sc.nextInt();
		
		e.checkEvenOrOdd(no);

	}

}
