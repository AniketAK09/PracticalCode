import java.util.Scanner;

public class CheckNeon_No {
	
	public int checkNeon(int no)
	{
		int square = no * no;
		int sum = 0;
		
		while(square > 0)
		{
			int rem = square % 10;
			sum = sum + rem;
			square  = square / 10;
		}
		System.out.println("Sum is: "+sum);
		
		if(sum == no)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void main(String[] args) {
		
		CheckNeon_No obj = new CheckNeon_No();
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = sc.nextInt();
		
		int result = obj.checkNeon(num);
		
		if(result == 1)
		{
			System.out.println(num+" is neon number");
		}
		else
		{
			System.out.println(num+" is not neon number");
		}

	}

}
