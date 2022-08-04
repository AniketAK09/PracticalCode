package patternPrograms;

import java.util.Scanner;

public class PrintStar_Pattern {
	
	public void displayPattern(int rows)
	{
		int i,j;
		
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		
		PrintStar_Pattern obj = new PrintStar_Pattern();
		
		int no_OfRows;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		no_OfRows = sc.nextInt();
		
		obj.displayPattern(no_OfRows);

	}

}
