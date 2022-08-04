package com.looseCoupling;

public class AmazonApp {

	public static void main(String[] args) {
		
		DebitCard d = new DebitCard();
		Person p = new Person(21,"Dhananjay Sathe", d);
		p.enjoyShopping();
		System.out.println("......................................................");
		CreditCard c = new CreditCard();
		Person p1 = new Person(21,"Ankush Kashid", c);
		p1.enjoyShopping();
		
		/*Person p1 = new Person(21,"Karan Thorat", new CreditCard());
		p1.enjoyShopping();*/

	}

}
