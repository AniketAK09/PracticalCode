package com.functionalInterface;

public class AmazonApp1 {

	public static void main(String[] args) {
		
		Payment1 pnt = (a) ->{System.out.println("Paying rupees "+a+" "
 								+ "through Debit card");
							System.out.println("Payment Successfully Done....");
							return 0;
							};
		int pay_rs = pnt.pay(4000);

		pnt = (a) ->{ return a; };
		System.out.println(pnt.pay(2000));

	}

}
