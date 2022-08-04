package oopsConcept;

public class CreditCard {

	private int cNo,limit;
	String oName;
	
	CreditCard() {
		
		
	}
	
	CreditCard(int cn,int lim,String on)
	{
		cNo = cn;
		limit = lim;
		oName = on;
	}
	
	public void paidAmount(int amount)
	{
		System.out.println("Amount is paid "+amount+" for Owner name is "+oName);
	}

}
