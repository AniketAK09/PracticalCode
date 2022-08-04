import java.util.Scanner;

public class TernaryOperator1 {

	public static void main(String[] args) {
		
		int quantity,price,amount,actual_Bill,discount;
		String product;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product name:");
		product = sc.nextLine();
		System.out.println("Enter the Quantity of item:");
		quantity = sc.nextInt();
		System.out.println("Enter the price of item:");
		price  = sc.nextInt();
		
		amount = quantity * price;
		System.out.println("Product is: "+product);
		
		discount = amount * 5 / 100;
		actual_Bill = amount - discount;
		
		
		String result = amount>=500 ? "Bill is: "+amount: "amount is not greater than 500 you cant get discount so please your amount "+amount;
		System.out.println(result);
		
		System.out.println("Discount Is: "+discount);
		System.out.println("Actual bill is: "+actual_Bill);

	}

}
