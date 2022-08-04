package com.arrayExample;

import java.util.Scanner;

public class FindMaxArrayElement {
	
public static void main(String[] args) {
		
		int[] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		int i,max;
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
		max=arr[0];
		for(i=0;i<10;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(" ");
		System.out.println(max+" is maximum number");
	}

}
