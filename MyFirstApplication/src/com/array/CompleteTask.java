package com.array;

import java.util.Scanner;

public class CompleteTask {
	
	public void sumOfArrEle(int[] a)
	{
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
		}
		System.out.println("Sum of array element is: "+sum);
	}
	
	public void EvenNumberInArr(int[] a)
	{
		System.out.println("Even number from array is");
		for(int i=0;i<a.length;i++)
		{
			if(a[i] % 2 == 0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
	
	public void OddNumberInArr(int[] a)
	{
		System.out.println("\nOdd number from array is");
		for(int i=0;i<a.length;i++)
		{
			if(a[i] % 2 != 0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
	
	public void displayAlternate(int[] a)
	{
		System.out.print("\nAlternate array element is: ");
		for(int i=0;i<a.length;i=i+2)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public void findMinEle(int[] a)
	{
		int min = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("");
		System.out.println("minimum array element is: "+min);
	}
	
	public void findMaxEle(int[] a)
	{
		int max = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("maximun array element is: "+max);
	}
	
	public void secondSmallestEle(int[] a)
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			if(i == 1)
				break;
		}
		System.out.println("ascending order array is");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nSecond smallest element in the array is: "+a[1]);
	}
	
	public void secondLargestEle(int[] a)
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			if(i == 1)
				break;
		}
		System.out.println("descending order array is");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nSecond largest element in the array is: "+a[1]);
	}
	
	public void replaceElement(int[] a)
	{
		System.out.println("After replacing the element: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				a[i] = 0;
			}
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		CompleteTask s = new CompleteTask();
		
		int[] arr;
		arr = new int[8];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		s.sumOfArrEle(arr);
		s.EvenNumberInArr(arr);
		s.OddNumberInArr(arr);
		s.displayAlternate(arr);
		s.findMinEle(arr);
		s.findMaxEle(arr);
		s.secondSmallestEle(arr);
		s.secondLargestEle(arr);
		s.replaceElement(arr);

	}

}
