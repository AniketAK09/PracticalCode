import java.util.Scanner;

public class SumOf_Digits {

	public static void main(String[] args) {
		
		int dig,sum = 0,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		dig = sc.nextInt();
		
		while(dig>0)
		{
			rem = dig % 10;
			sum = sum + rem;
			dig = dig / 10;

		}
		
		System.out.println("Sum of digit is: "+sum);

	}

}
