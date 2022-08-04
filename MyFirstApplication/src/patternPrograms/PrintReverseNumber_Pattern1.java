package patternPrograms;

import java.util.Scanner;

public class PrintReverseNumber_Pattern1 {
	
	public void displayReversePattern(int rows)
	{
		int i,j;
		
		for(i=rows;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		
		PrintReverseNumber_Pattern1 obj = new PrintReverseNumber_Pattern1();
		
		int no_OfRows;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		no_OfRows = sc.nextInt();
		
		obj.displayReversePattern(no_OfRows);
		
		sc.close();

	}

}
