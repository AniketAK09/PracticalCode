package patternPrograms;

import java.util.Scanner;

public class PrintNumber_OnRightSide {
	
	public void printNumberOnRight(int rows)
	{
		int i,j,k;
		
		for(i=1;i<=rows;i++)
		{
			for(k=1;k<=(rows-i);k++)
			{
				System.out.print(" ");
			}
			
			for(j=1;j<=i;j++)
			{
				System.out.print(j+"");
			}
			
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		
		PrintNumber_OnRightSide obj = new PrintNumber_OnRightSide();
		
		int no_OfRows;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		no_OfRows = sc.nextInt();
		
		obj.printNumberOnRight(no_OfRows);
		
		sc.close();
		
	}

}
