import java.util.Scanner;

public class KrishnamurthyNumber1 {
	
	public int findFactorial(int num)
	{
		int i,fact = 1;
		for(i=1;i<=num;i++)
		{
			fact = fact * i;
		}
		
		return fact;
	}
	
	public boolean findKrishnamurthyNo(int num)
	{
		int sum = 0;
		int temp = num;
		
		while(temp > 0)
		{
			int rem = temp % 10;
			sum = sum + findFactorial(rem);
			temp = temp / 10;
		}
		
		if(sum == num)
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	public static void main(String[] args) {
		
		KrishnamurthyNumber1 obj = new KrishnamurthyNumber1();
		
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
