import java.util.Scanner;

public class GenerateSeries {
	
	public void generateSeries(int num)
	{
		int i;
		for(i=1;i<=num;i=i*2)
		{
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {

		GenerateSeries g = new GenerateSeries();
		
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of number(Limit):");
		no = sc.nextInt();
		
		g.generateSeries(no);

	}

}
