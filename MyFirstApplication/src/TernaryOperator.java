import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks:");
		marks = sc.nextInt();
		
		String result =  marks>=40  ? "Student is pass and marks are: "+marks : "Student is fail and marks are: "+marks;
		System.out.println(result);
	}

}
