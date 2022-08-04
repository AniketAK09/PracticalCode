import java.util.Scanner;

public class CharPrinting {

	public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		ch = sc.next().charAt(0);
		System.out.println("Character is: "+ch);
		System.out.println("ASCII value of this character is: "+(int)ch);
		System.out.println("Converted char is: "+(char)(ch-32));
		System.out.println((char) ch-32);
		System.out.println('B');
		System.out.println((int)'B');

	}

}
