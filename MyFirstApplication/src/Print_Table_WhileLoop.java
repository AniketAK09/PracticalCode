import java.util.Scanner;

public class Print_Table_WhileLoop {

	public static void main(String[] args) {
		
		int num,i=1;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while(i<=10)
		{
			System.out.println(num*i);
			i++;
		}

	}

}
