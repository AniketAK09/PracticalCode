import java.util.Scanner;

public class Find_SecondLargest {
	
	public void secondLargest(int num)
	{
		int rem,max = num % 10;
		int secMax = max;
		num = num / 10;
		while(num > 0)
		{
			rem = num % 10;
			if(max < rem)
			{
				secMax = max;
				max = rem;
			}
			else
			{
				secMax = rem;
			}
			num = num / 10;
		}
		
		System.out.println("Second Largest number is "+secMax);
	}

	public static void main(String[] args) {
		
		Find_SecondLargest f = new Find_SecondLargest();
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		no = sc.nextInt();
		
		f.secondLargest(no);
	}

}
