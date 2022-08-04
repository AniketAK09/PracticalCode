package com.functionalInterface;

public class AmazonApp {

	public static void main(String[] args) {
		
		Payment pnt = (a) ->{System.out.println("Paying rupees "+a+" "
				 				+ "through Debit card");
							System.out.println("Payment Successfully Done....");
		
							};
		pnt.pay(4000);
		
		System.out.println(".....................................................");
		
		pnt = (a) ->{System.out.println("Paying ruppes "+a+" "
						+"through Credit card");
					System.out.println("Paymeny Successfully Done....");
					};
		pnt.pay(2000);

	}

}
