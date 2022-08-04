import java.util.Scanner;

public class PrintNumber_UCon_WithObj {
	
	public void doThink(int no)
	{
		int i;
		
		for(i=0;i<no;i++)
		{	
			if(i % 3 == 0 && i % 5 == 0)
			{
				continue;
			}

			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		
		PrintNumber_UCon_WithObj obj = new PrintNumber_UCon_WithObj();
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = sc.nextInt();
		
		obj.doThink(num);

	}

}
