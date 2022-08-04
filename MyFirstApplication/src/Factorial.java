import java.util.Scanner;

public class Factorial {
	
	public int findFactorial(int num)
	{
		int fact = 1;
		for(int i=1;i<=num;i++)
		{
			fact = fact * i;
		}
		
		return fact;
	}

	public static void main(String[] args) {
		
		Factorial obj = new Factorial();
		
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		no = sc.nextInt();
		
		int factorial = obj.findFactorial(no);
		System.out.println("Factorial of "+no+" is: "+factorial);

	}

}
