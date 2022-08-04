package patternPrograms;

import java.util.Scanner;

public class PrintReverseAlphabet_Pattern2 {
	
	public void displayAlphabetPattern(int rows)
	{
		int i,j;
		int count = 97;
		
		for(i=rows;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print((char)count+" ");
				count++;
			}
			
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		
		PrintReverseAlphabet_Pattern2 obj = new PrintReverseAlphabet_Pattern2();
		
		int no_OfRows;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		no_OfRows = sc.nextInt();
		
		obj.displayAlphabetPattern(no_OfRows);
		
		sc.close();
		
	}

}
