import java.util.Scanner;

public class KrishnamurthyNumber {
	
	public boolean findKrishnamurthyNo(int num)
	{
		int rem,sum = 0;
		int temp = num;
		
		while(num > 0)
		{
			rem = num % 10;
			int i,fact = 1;
			for(i=1;i<=rem;i++)
			{
				fact = fact * i;
			}
			
			sum = sum + fact;
			num = num / 10;
		}
		
		if(sum == temp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		
		KrishnamurthyNumber obj = new KrishnamurthyNumber();
		
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		no = sc.nextInt();
		
		boolean result = obj.findKrishnamurthyNo(no);
		
		if(result)
		{
			System.out.println(no+" is krishnamurthy number");
		}
		else
		{
			System.out.println(no+" is not krishnamurthy number");
		}

	}

}
