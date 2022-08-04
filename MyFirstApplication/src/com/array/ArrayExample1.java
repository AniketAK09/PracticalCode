package com.array;

public class ArrayExample1 {
	
	public void displayArray(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("");
	}
	
	public void displayArray(char[] c)
	{
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println("");
	}
	
	public void displayArray(String[] s)
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		ArrayExample1 a = new ArrayExample1();
		
		int arr[] = {4,3,6,7,8,1};
		
		char ch[] = {'a','e','i','o','u'};
		
		String str[] = {"Aniket","Vishal","Jayesh","Suraj","Omkar","Abhijeet"};
		
		a.displayArray(arr);
		a.displayArray(ch);
		a.displayArray(str);

	}

}
