package patternPrograms;

import java.util.Scanner;

public class PrintNumber_Pattern {
	
	public void displayNumPattern(int rows)
	{
		int i,j;
		
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		
		PrintNumber_Pattern obj = new PrintNumber_Pattern();
		
		int no_OfRows;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		no_OfRows = sc.nextInt();
		
		obj.displayNumPattern(no_OfRows);


	}

}
