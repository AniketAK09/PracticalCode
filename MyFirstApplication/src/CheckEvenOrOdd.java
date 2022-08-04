import java.util.Scanner;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
		
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		no = sc.nextInt();
		if(no%2 != 0)
		{
			System.out.println(no+" is Odd");
		}
		else
		{
			System.out.println(no+" is Even");
		}

	}

}
