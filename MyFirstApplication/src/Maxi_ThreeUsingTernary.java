import java.util.Scanner;

public class Maxi_ThreeUsingTernary {

	public static void main(String[] args) {
		
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		num1 = sc.nextInt();
		System.out.println("Enter second number:");
		num2 = sc.nextInt();
		System.out.println("Enter third number:");
		num3 = sc.nextInt();
		
		/*int max = (num1>num2 && num1>num3)?num1:((num2>num3)?num2:num3);
		
		System.out.println("maximum no among three no is:"+max);*/
		
		/*int max = (num1>num2 && num1>num3) ? num1 : (num2>num1 && num2>num3) ? num2 : num3;
		System.out.println("Maximum is: "+max);*/
		
		int max = (num1>num2) ? (num1>num3) ? num1 : num3 : (num2>num3) ? num2 : num3;
		System.out.println("Maximum is: "+max);

	}

}
