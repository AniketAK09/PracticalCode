import java.util.Scanner;

public class FindPower_UsingFun {
	
	public int findPower(int a,int b)
	{
		int result = 1;
		
		for(int i=1;i<=b;i++)
		{
			result = result * a;
		}
		
		return result;
		
		/*int sum = 1;
		for(;b > 0;b--)
		{
			sum = sum * a;
		}
		return sum;*/
	}

	public static void main(String[] args) {
		
		FindPower_UsingFun obj = new FindPower_UsingFun();
		
		int base,power;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base:");
		base = sc.nextInt();
		System.out.println("Enter the power");
		power = sc.nextInt();
		
		int power_is = obj.findPower(base, power);
		System.out.println(base+" is the power "+power+" is: "+power_is);
		
		sc.close();
		

	}

}
