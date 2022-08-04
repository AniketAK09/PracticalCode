import java.util.Scanner;

public class FibanonciiSeries {
	
	public void ganarateFibo(int term)
	{
		int no1 = 0, no2 = 1, no3;
		System.out.print(no1+" ");
		System.out.print(no2+" ");
		
		for(int i=3;i<=term;i++)
		{
			no3 = no1 + no2;
			System.out.print(no3+" ");
			no1 = no2;
			no2 = no3;
		}
	}

	public static void main(String[] args) {
		
		FibanonciiSeries obj = new FibanonciiSeries();
		
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		no = sc.nextInt();
		
		obj.ganarateFibo(no);
		
		sc.close();

	}

}
