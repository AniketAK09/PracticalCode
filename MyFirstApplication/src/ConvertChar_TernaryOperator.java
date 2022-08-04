import java.util.Scanner;

public class ConvertChar_TernaryOperator {

	public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		ch = sc.next().charAt(0);
		
		String result = (ch>='A' && ch<='Z') ? "Converting char is "+(char)(ch+32) : (ch>='a' && ch<='z') ? "Converting char is "+(char)(ch-32) : ch+" Its not alphabet";
		System.out.println(result);

	}

}
