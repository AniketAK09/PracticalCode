import java.util.Scanner;

public class Char_IsLower_Upper {

	public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		ch = sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z')
		{
			System.out.println(ch+" Is Upper Case Character");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println(ch+" Is Lower Case Character");
		}
		else
		{
			System.out.println(ch+" Its not alphabet");
		}

	}

}
