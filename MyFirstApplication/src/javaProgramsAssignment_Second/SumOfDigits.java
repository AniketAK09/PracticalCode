package javaProgramsAssignment_Second;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int no,rem,result=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit:");
		no = sc.nextInt();
		
		while(no>0)
		{
			rem=no%10;
			result=result+rem;
			no=no/10;
		}
		
		System.out.println("Sum Of Digit is : "+result);

	}

}
