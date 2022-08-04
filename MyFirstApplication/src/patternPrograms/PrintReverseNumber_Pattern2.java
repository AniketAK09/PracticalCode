package patternPrograms;

import java.util.Scanner;

public class PrintReverseNumber_Pattern2 {
	
	public void displayReversePattern(int rows)
	{
		int i,j,count = 1;
		
		for(i=rows;i>=1;i--)
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
		
		PrintReverseNumber_Pattern2 obj = new PrintReverseNumber_Pattern2();
		
		int no_OfRows;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		no_OfRows = sc.nextInt();
		
		obj.displayReversePattern(no_OfRows);
		
		sc.close();

	}

}
