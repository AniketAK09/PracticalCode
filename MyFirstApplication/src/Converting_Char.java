import java.util.Scanner;

public class Converting_Char {

	public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		ch = sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z')
		{
			System.out.println((char)(ch+32));
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println((char)(ch-32));
		}
		else
		{
			System.out.println(ch+" Its not alphabet");
		}

	}

}
