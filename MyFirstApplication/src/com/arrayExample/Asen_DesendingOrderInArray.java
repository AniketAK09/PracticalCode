package com.arrayExample;

import java.util.Scanner;

public class Asen_DesendingOrderInArray {
	
public static void main(String[] args) {
		
		int[] arr=new int[5];
		int i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 array elements");
		for(i=0;i<=4;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements of array are:");
		for(i=0;i<=4;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		System.out.println("Elements of array sorted in ascending order:");
		for(i=0;i<=4;i++)
		{
			for(j=i+1;j<=4;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=0;i<=4;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		System.out.println("Elements of array sorted in descending order");
		for(i=0;i<=4;i++)
		{
			for(j=i+1;j<=4;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=0;i<=4;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
