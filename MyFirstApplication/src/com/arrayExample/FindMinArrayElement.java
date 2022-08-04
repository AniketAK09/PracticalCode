package com.arrayExample;

import java.util.Scanner;

public class FindMinArrayElement {
	
public static void main(String[] args) {
		
		int[] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		int i,min;
		System.out.println("Enter 10 array elements:");
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array element is:");
		for(i=0;i<10;i++)
		{
			System.out.print(arr[i]+" ");
		}
		min=arr[0];
		for(i=0;i<10;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println(" ");
		System.out.println(min+" is minimum number");

	}

}
