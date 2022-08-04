import java.util.Scanner;

public class UsingOb_SumOfDigit {
	
	public int sumOfDigit(int num)
	{
		int rem,sum = 0;
		
		while(num > 0)
		{
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		UsingOb_SumOfDigit obj = new UsingOb_SumOfDigit();
		
		int dig;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit:");
		dig = sc.nextInt();
		
		int sumOf_Digit = obj.sumOfDigit(dig);
		System.out.println("Sum of digit is: "+sumOf_Digit);
		
		sc.close();
		

	}

}
