import java.util.Scanner;

public class Largest_DigitUsingFun {
	
	public int largestDigit(int num)
	{
		int rem, max = num % 10;
		
		while(num > 0)
		{
			rem = num % 10;
			if(rem > max)
			{
				max = rem;
			}
			
			/*if((num % 10) > max)
			{
				max = num % 10;
			}*/
			num = num / 10;
		}
		
		return max;
	}

	public static void main(String[] args) {
		
		Largest_DigitUsingFun obj = new Largest_DigitUsingFun();
		
		int dig;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		dig = sc.nextInt();
		
		int largest_Digit = obj.largestDigit(dig);
		System.out.println("Largest Digit is: "+largest_Digit);
		
		sc.close();

	}

}
