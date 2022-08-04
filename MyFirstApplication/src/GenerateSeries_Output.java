import java.util.Scanner;

public class GenerateSeries_Output {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(int i=1;i<=num;i=i*2+1)
		{
			System.out.print(i+" ");
		}
		
		sc.close();
	}

}
