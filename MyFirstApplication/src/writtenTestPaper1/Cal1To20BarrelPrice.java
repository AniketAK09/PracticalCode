package writtenTestPaper1;

import java.util.Scanner;

public class Cal1To20BarrelPrice {
	
	public void calPrice()
	{
		int i,amount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the quantity:");
		i = sc.nextInt();
		
		for(i=1;i<=20;i++)
		{
			if(i <= 10)
			{
				amount = i * 89;
			}
			else
			{
				amount = i * (89 - i);
			}
		}
		
		System.out.println("Amount is:"+amount);
	}

	public static void main(String[] args) {
		
		Cal1To20BarrelPrice obj = new Cal1To20BarrelPrice();
		
		obj.calPrice();

	}

}
