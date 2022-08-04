import java.util.Scanner;

public class CheckNoPos_Neg_OrNeutral {

	public static void main(String[] args) {
		
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		x = sc.nextInt();
		if(x>0)
		{
			System.out.println(x+" is positive");
		}
		else if(x<0)
		{
			System.out.println(x+" is negative");
		}
		else
		{
			System.out.println(x+" is neutral");
		}

	}

	
}
