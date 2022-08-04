package com.arrayExample;

import java.util.Scanner;

public class DuplicateArrayElements {
	
public static void main(String[] args) {
		
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		int i,j,count=0;
		System.out.println("Enter 5 array elements:");
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array element is:");
		for(i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		System.out.println("Duplicate array elements is:");
		for(i=0;i<5;i++)
		{
			count=0;
			for(j=i+1;j<5;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					break;
				}
			}
			if(count>0)
				System.out.print(arr[i]+" ");
		}
	}

}
