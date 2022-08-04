import java.util.Scanner;

public class Factors {
	
	/*public int findFactors(int num)
	{
		int factor = 0;
		for(int i=1;i<=num;i++)
		{
			if(num % i == 0)
			{
				factor = i;
			}
		}
		
		return factor;
	}*/
	
	public void findFactors(int num)
	{
		System.out.println("Factors are:");
		for(int i=1;i<=num;i++)
		{
			if(num % i == 0)
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		
		Factors obj = new Factors();
		
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		no = sc.nextInt();
		
		/*int fact = obj.findFactors(no);
		System.out.println("Factors are: "+fact);*/
		
		obj.findFactors(no);

	}

}
