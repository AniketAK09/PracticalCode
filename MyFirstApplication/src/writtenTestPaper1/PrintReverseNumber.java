package writtenTestPaper1;

import java.util.Scanner;

public class PrintReverseNumber {
	
	public void printReverseNumber(int rows)
	{
		int i,j;
		for(i=rows;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+"");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		
		PrintReverseNumber obj = new PrintReverseNumber();
		
		int no_OfRows;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		no_OfRows = sc.nextInt();
		
		obj.printReverseNumber(no_OfRows);
		
		sc.close();

	}

}
