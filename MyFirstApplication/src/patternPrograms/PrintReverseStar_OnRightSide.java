package patternPrograms;

import java.util.Scanner;

public class PrintReverseStar_OnRightSide {
	
	public void displayRevStarPattern_OnRightSide(int rows)
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
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		
		PrintReverseStar_OnRightSide obj = new PrintReverseStar_OnRightSide();
		
		int no_OfRows;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		no_OfRows = sc.nextInt();
		
		obj.displayRevStarPattern_OnRightSide(no_OfRows);
		
		sc.close();

	}

}
