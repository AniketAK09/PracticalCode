package com.array;

import java.util.Scanner;

public class ArrayExample {
	
	public void displayArray(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		ArrayExample a = new ArrayExample();
		Scanner sc = new Scanner(System.in);
		int arr[];
		System.out.println("Enter how many element inside array:");
		int len = sc.nextInt();
		arr = new int[len];
		System.out.println(arr.length);
		System.out.println("Enter the array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		a.displayArray(arr);

	}

}
