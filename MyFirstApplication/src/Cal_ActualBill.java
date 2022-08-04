import java.util.Scanner;

public class Cal_ActualBill {

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
		System.out.println("Bill is: "+amount);
		
		if(amount>=500)
		{
			discount = amount * 5 / 100;
			actual_Bill = amount - discount;
			System.out.println("Actual bill is: "+actual_Bill);
			System.out.println("Discount is: "+discount);
		}
		else
		{
			System.out.println("amount is not greater than 500 you cant get discount");
			System.out.println("Bill is: "+amount);
		}

	}

}
