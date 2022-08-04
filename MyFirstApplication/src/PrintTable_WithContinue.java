import java.util.Scanner;

public class PrintTable_WithContinue {

	public static void main(String[] args) {
		
		int num,i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = sc.nextInt();
		
		while(i<10)
		{
			i++;
			if(i == 5)
			{
				continue;
			}
			
			System.out.println(num*i);
		}

	}

}
