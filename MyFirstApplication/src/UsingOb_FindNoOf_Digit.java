import java.util.Scanner;

public class UsingOb_FindNoOf_Digit {
	
	public int noOfDigit(int num)
	{
		int rem,count = 0;
		
		while(num > 0)
		{
			rem = num % 10;
			num = num / 10;
			count++;
		}
		
		if(count > 0)
		{
			return count++;
		}
		else
		{
			return 0;
		}
	}

	public static void main(String[] args) {
		
		UsingOb_FindNoOf_Digit obj = new UsingOb_FindNoOf_Digit();
		
		int dig;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		dig = sc.nextInt();
		
		int numbers = obj.noOfDigit(dig);
		System.out.println("No Of Digits are: "+numbers);
		sc.close();

	}

}
