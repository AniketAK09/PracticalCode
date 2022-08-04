import java.util.Scanner;

public class ArmstrongNo_UsingFun {
	
	
	
	public int findArmstrongNo(int num)
	{
		int originalNum,rem,result = 0;
		originalNum = num;
		
		while(num > 0)
		{
			rem = num % 10;
			result = result + (rem * rem * rem);
			num = num / 10;
		}
		
		if(result == originalNum)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void main(String[] args) {
		
		ArmstrongNo_UsingFun obj = new ArmstrongNo_UsingFun();
		
		int dig;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Digit:");
		dig = sc.nextInt();
		
		int armstrong_is = obj.findArmstrongNo(dig);
		
		if(armstrong_is == 1)
		{
			System.out.println(dig+" is armstrong number");
		}
		else
		{
			System.out.println(dig+" is not armstrong number");
		}
		
		sc.close();

	}

}
