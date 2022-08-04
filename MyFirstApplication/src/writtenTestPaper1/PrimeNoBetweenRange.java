package writtenTestPaper1;

import java.util.Scanner;

public class PrimeNoBetweenRange {
	
	public void primeNoBetRange(int num1,int num2)
	{
		int i,j,flag;
		for(i=num1;i<=num2;i++)
		{
			flag = 1;
			for(j=2;j<=i/2;j++)
			{
				if(i % j == 0)
				{
					flag = 0;
					break;
				}
			}
				
			if(flag == 1)
			{
				System.out.println(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		
		PrimeNoBetweenRange obj = new PrimeNoBetweenRange();
		
		int no1,no2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		no1 = sc.nextInt();
		System.out.println("Enter second number:");
		no2 = sc.nextInt();
		
		obj.primeNoBetRange(no1, no2);

	}

}
