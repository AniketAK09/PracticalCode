package oopsConcept;

public class Bank_Encapsulation {
	
	public void showAccountDetails(Account_Encapsulation at)
	{
		System.out.println("Bank name is: "+at.getBankName());
		System.out.println("Account holder name is: "+at.getAcc_HolderName());
		System.out.println("Account type is: "+at.getAcc_Type());
		System.out.println("Account no is: "+at.getAcc_No());
		System.out.println("Account balence is: "+at.getAcc_Balence());
	}

	public static void main(String[] args) {
		
		Account_Encapsulation ae = new Account_Encapsulation();
		
		Account_Encapsulation ae1 = new Account_Encapsulation("IDBI Bank","Ashok Mohite","Saving",13245674,40000);
		
		ae.setBankName(ae1.getBankName());
		ae.setAcc_HolderName(ae1.getAcc_HolderName());
		ae.setAcc_Type(ae1.getAcc_Type());
		ae.setAcc_No(ae1.getAcc_No());
		ae.setAcc_Balence(ae1.getAcc_Balence());
		
		Bank_Encapsulation b = new Bank_Encapsulation();
		b.showAccountDetails(ae1);
		System.out.println("_______________________________");
		b.showAccountDetails(ae);
		
	}

}
