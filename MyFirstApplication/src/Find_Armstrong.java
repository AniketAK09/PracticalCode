import java.util.Scanner;

public class Find_Armstrong {
	
	public int countDigit(int no)
	{
		int rem, count = 0;
		
		while(no > 0)
		{
			rem = no % 10;
			count++;
			no = no / 10;
		}
		return count;
	}
	
	public int findPower(int base,int power)
	{
		int i,result = 1;
		for(i=1;i<=power;i++)
		{
			result = result * base;
		}
		return result;
	}
	
	public int is_armstrong(int num)
	{
		int originalNum,base,power,result = 0;
		power = countDigit(num);
		originalNum = num;
		
		while(num > 0)
		{
			base = num % 10;
			result = result + findPower(base, power);
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
		
		Find_Armstrong obj = new Find_Armstrong();
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		a = sc.nextInt();
		
		int result = obj.is_armstrong(a);
		
		if(result == 1)
		{
			System.out.println(a+" is armstrong number");
		}
		else
		{
			System.out.println(a+" is not armstrong number");
		}
		
		sc.close();

	}

}
