package patternPrograms;

import java.util.Scanner;

public class PrintReverseNumber_OnRightSide1 {
	
	public void printReverseNumberOnRight(int rows)
	{
		int i,j,k;
		
		for(i=rows;i>=1;i--)
		{
			for(k=1;k<=(rows-i);k++)
			{
				System.out.print(" ");
			}
			
			for(j=1;j<=i;j++)
			{
				System.out.print(i+"");
			}
			
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		
		PrintReverseNumber_OnRightSide1 obj = new PrintReverseNumber_OnRightSide1();
		
		int no_OfRows;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		no_OfRows = sc.nextInt();
		
		obj.printReverseNumberOnRight(no_OfRows);
		
		sc.close();

	}

}
