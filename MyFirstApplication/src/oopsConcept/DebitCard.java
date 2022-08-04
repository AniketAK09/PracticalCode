package oopsConcept;

public class DebitCard {
	
	private int dNo,limit;
	String oName;
	
	DebitCard() {
		
		
	}
	
	DebitCard(int dn,int lim,String on)
	{
		dNo = dn;
		limit = lim;
		oName = on;
	}
	
	public void paidAmount(int amount)
	{
		System.out.println("Amount is paid "+amount+" for Owner name is "+oName);
	}

}
