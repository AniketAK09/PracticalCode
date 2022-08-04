package writtenTestPaper1;

import java.util.Scanner;

public class Twin_Prime {
	
	public boolean checkPrimeNo(int num)
	{
		int i,j,flag = 1;
		if(num==0 && num==1)
			flag = 0;
		else
		{
			for(i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					flag = 0;
					break;
				}
			}
			
			if(flag == 1)
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean checkTwinPrimeNo(int number1,int number2)
	{
		if(checkPrimeNo(number1) && checkPrimeNo(number2) && Math.abs(number1 - number2) == 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		
		Twin_Prime t = new Twin_Prime();
		
		int no1,no2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		no1 = sc.nextInt();
		System.out.println("Enter the second number:");
		no2 = sc.nextInt();
		
		if(t.checkTwinPrimeNo(no1, no2))
		{
			System.out.println(no1+" "+no2+" is a pair of twin primes");
		}
		else
		{
			System.out.println(no1+" "+no2+" is not a pair of twin primes");
		}

	}

}
