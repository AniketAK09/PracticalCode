import java.util.Scanner;

public class Smallest_Digit_UsingFun {
	
	public int smallestDigit(int num)
	{
		int rem, min = num % 10;
		
		while(num > 0)
		{
			rem = num % 10;
			if(rem < min)
			{
				min = rem;
			}
			
			/*if((num % 10) < min)
			{
				min = num % 10;
			}*/
			num = num / 10;
		}
		
		return min;
	}

	public static void main(String[] args) {
		
		Smallest_Digit_UsingFun obj = new Smallest_Digit_UsingFun();
		
		int dig;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		dig = sc.nextInt();
		
		int smallest_Digit = obj.smallestDigit(dig);
		System.out.println("Smallest Digit is: "+smallest_Digit);
		
		sc.close();

	}

}
