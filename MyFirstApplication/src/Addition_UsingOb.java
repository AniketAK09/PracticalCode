import java.util.Scanner;

public class Addition_UsingOb {
	
	public int makeAddition(int a,int b)
	{
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		
		Addition_UsingOb obj = new Addition_UsingOb();
		
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no:");
		x = sc.nextInt();
		System.out.println("Enter second no:");
		y = sc.nextInt();
		
		int sum_is = obj.makeAddition(x, y);
		System.out.println("Addition is: "+sum_is);
		
		sc.close();

	}

}
