package assignment_InLoop;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		
		int no, i=2, flag=1;
		System.out.println("Enter the number:");
		no = new Scanner(System.in).nextInt();
		
		if(no==0 || no==1)
		{
			System.out.println("Number is Not Prime");
		}
		else
		{
			while(i<=no/2)
			{
				if(no%i==0)
				{
					flag=0;
					break;
				}
				i++;
			}
			
			if(flag==1)
			{
				System.out.println("Number is Prime");
			}
			else
			{
				System.out.println("Number is not Prime");
			}
		}
		
		
		

	}

}
