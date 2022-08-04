import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks : ");
		marks = sc.nextInt();
		if(marks>=40)
		{
			System.out.println("Student is pass");
		}
		else
		{
			System.out.println("Student is fail");
		}

	}

}
