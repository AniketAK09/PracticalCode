import java.util.Scanner;

public class FindNoOf_Digits {

	public static void main(String[] args) {
		
		int dig,count = 0,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		dig = sc.nextInt();
		
		while(dig>0)
		{
			rem = dig % 10;
			dig = dig / 10;
			count++;
		}
		
		if(count>0)
		{
			System.out.println("No Of Digits are: "+count);
		}

	}

}
