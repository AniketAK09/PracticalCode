package patternPrograms;

import java.util.Scanner;

public class PrintNumber_Pattern2 {
	
	public void displayNumPattern(int rows)
	{
		int i,j;
		int count = 1;
		
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		
		PrintNumber_Pattern2 obj = new PrintNumber_Pattern2();
		
		int no_OfRows;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		no_OfRows = sc.nextInt();
		
		obj.displayNumPattern(no_OfRows);
		
	}


}
