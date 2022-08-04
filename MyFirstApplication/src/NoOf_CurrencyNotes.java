import java.util.Scanner;

public class NoOf_CurrencyNotes {

	public static void main(String[] args) {

		int amount, note2000, note500, note200, note100, note50;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount:");
		amount = sc.nextInt();
		
		if(amount % 50 == 0)
		{
			if(amount<50)
			{
				System.out.println("Invalid Amount");
			}
		
			if(amount>=2000)
			{
				note2000 = amount / 2000;
				amount = amount % 2000;
				System.out.println("2000 hundred notes are: "+note2000);
				
			}
			
			if(amount>=500)
			{
				note500 = amount / 500;
				amount = amount % 500;
				System.out.println("500 hundred notes are: "+note500);
			}
			
			if(amount>=200)
			{
				note200 = amount / 200;
				amount = amount % 200;
				System.out.println("200 hundred notes are: "+note200);
			}
			
			if(amount>=100)
			{
				note100 = amount / 100;
				amount = amount % 100;
				System.out.println("100 hundred notes are: "+note100);
			}
			
			if(amount>=50)
			{
				note50 = amount / 50;
				amount = amount % 50;
				System.out.println("50 hundred notes are: "+note50);
			}
		}
		else
		{
			System.out.println("Invalid Amount");
		}


	}

}
