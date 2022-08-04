package oopsConcept;

public class Shopping {
	
	public void doTransaction(CreditCard crd)
	{
		crd.paidAmount(12000);
		System.out.println("Amount is paid in credit card");
	}
	
	public void doTranscation(DebitCard dbt)
	{
		dbt.paidAmount(23000);
		System.out.println("Amount is paid in debit card");
	}
	
	public static void main(String[] args) {
		
		CreditCard c = new CreditCard(332143,40000,"Ashok");
		DebitCard d = new DebitCard(2145111,100000,"Sahil");
		
		Shopping s = new Shopping();
		s.doTransaction(c);
		s.doTranscation(d);
	}

}
