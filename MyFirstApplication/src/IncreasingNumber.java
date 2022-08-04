import java.util.Scanner;

public class IncreasingNumber {
	
	public boolean isIncreasing(int num)
	{
		boolean flag = true;
		int rem1 = num % 10;
		num = num / 10;
		
		while(num > 0)
		{
			int rem2 = num % 10;
			
			if(rem1 < rem2)
			{
				flag = false;
				break;
			}
			rem1 = rem2;
			num = num / 10;
		}
		
		return flag;
	}

	public static void main(String[] args) {
		
		IncreasingNumber obj = new IncreasingNumber();
		
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		no = sc.nextInt();
		
		boolean isIncreaseNo = obj.isIncreasing(no);
		
		if(isIncreaseNo == true)
		{
			System.out.println("Number is Increasing");
		}
		else
		{
			System.out.println("Number is not Increasing");
		}

	}

}
