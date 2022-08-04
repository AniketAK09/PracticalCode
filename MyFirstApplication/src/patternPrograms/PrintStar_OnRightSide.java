package patternPrograms;

import java.util.Scanner;

public class PrintStar_OnRightSide {
	
	public void displayStarPattern_OnRightSide(int rows)
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
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		
		PrintStar_OnRightSide obj = new PrintStar_OnRightSide();
		
		int no_OfRows;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		no_OfRows = sc.nextInt();
		
		obj.displayStarPattern_OnRightSide(no_OfRows);
		
		sc.close();

	}

}
