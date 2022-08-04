package patternPrograms;

import java.util.Scanner;

public class PrintReverseStar_Pattern {
	
	public void displayReversePattern(int rows)
	{
		int i,j;
		
		for(i=rows;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		
		PrintReverseStar_Pattern obj = new PrintReverseStar_Pattern();
		
		int no_OfRows;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		no_OfRows = sc.nextInt();
		
		obj.displayReversePattern(no_OfRows);
		
		sc.close();

	}

}
