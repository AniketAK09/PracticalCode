import java.util.Scanner;

public class Menu_DrivenPro {

	public static void main(String[] args) {
		
		System.out.println("--------Menu---------");
		System.out.println("1)Addition");
		System.out.println("2)Substraction");
		System.out.println("3)Multiplication");
		System.out.println("4)Division");
		System.out.println("5)Exit");
		
		int num1,num2,choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		num1 = sc.nextInt();
		System.out.println("Enter second number");
		num2 = sc.nextInt();
		System.out.println("Enter the choice");
		choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.println("Addition is : "+(num1+num2));
				break;
			case 2:
				System.out.println("Substraction is : "+(num1-num2));
				break;
			case 3:
				System.out.println("Multiplication is : "+(num1*num2));
				break;
			case 4:
				System.out.println("Division is : "+(num1/num2));
				break;
			case 5:
				System.exit(0);
				break;
			default :
				System.out.println("Invalid choice");
		}

	}

}
