package writtenTestPaper1;

import java.util.Scanner;

public class Largest_Digit {
	
	public int largestDigit(int num)
	{
		int rem,max = num % 10;
		
		while(num > 0)
		{
			rem = num % 10;
			if(rem > max)
			{
				max = rem;
			}
			num = num / 10;
		}
		return max;
	}

	public static void main(String[] args) {
		
		Largest_Digit obj = new Largest_Digit();
		
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		no = sc.nextInt();
		
		int large_dig = obj.largestDigit(no);
		System.out.println("Largest Digit is: "+large_dig);

	}

}
