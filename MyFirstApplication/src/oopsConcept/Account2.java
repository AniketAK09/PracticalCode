package oopsConcept;

public class Account2 {
	
	public long accountNo;
	public String accHolName;
	
	public Account2() {
		accountNo = 67983421821L;
		accHolName = "Vinay Kumar";
	}
	
	public Account2(long accNo,String accHN)
	{
		accountNo = accNo;
		accHolName = accHN;
	}
	

	public static void main(String[] args) {
		
		Account2 a = new Account2();
		System.out.println("Account no is:"+a.accountNo);
		System.out.println("Account Holder name is: "+a.accHolName);
		
		Account2 a1 = new Account2(65343289673L,"Rohan Thorat");
		System.out.println("Account no is:"+a1.accountNo);
		System.out.println("Account Holder name is: "+a1.accHolName);
		

	}

}
