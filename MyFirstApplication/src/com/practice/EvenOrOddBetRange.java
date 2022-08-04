package com.practice;

import java.util.Scanner;

public class EvenOrOddBetRange {
	
	public void checkEvenOrOdd(int num)
	{
		for(int i = 1;i<=num;i++)
		{
			if(i % 2 == 0)
				System.out.println(i);
			else
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		EvenOrOddBetRange e = new EvenOrOddBetRange();
		
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number and check it is even or odd");
		no = sc.nextInt();
		
		e.checkEvenOrOdd(no);

	}

}
