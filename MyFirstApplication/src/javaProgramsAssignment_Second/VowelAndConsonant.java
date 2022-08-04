package javaProgramsAssignment_Second;

import java.util.Scanner;

public class VowelAndConsonant {

	public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		ch = sc.next().charAt(0);
		
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
		{
			System.out.println(ch+" is Vowel");
		}
		else
		{
			System.out.println(ch+" is Consonant");
		}

	}

}
