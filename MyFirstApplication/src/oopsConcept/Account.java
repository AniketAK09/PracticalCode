package oopsConcept;

import java.util.Scanner;

public class Account {
	
	String bankName,acc_HolderName,acc_Type;
	long acc_No;
	float acc_Balence;
	
	Account()
	{
		bankName = "Bank Of Maharashtra";
		acc_HolderName = "Jayesh Kashid";
		acc_Type = "Saving";
		acc_No = 12345469675l;
		acc_Balence = 12000.456f;
		System.out.println("Dafault Constructor");
	}
	
	Account(String bankN,String accHN,String accT,long accN,float accB)
	{
		bankName = bankN;
		acc_HolderName = accHN;
		acc_Type = accT;
		acc_No = accN;
		acc_Balence = accB;
		System.out.println("Parameterized Constructor 1");
	}
	
	Account(String bankN,String accHN,String accT,long accN)
	{
		bankName = bankN;
		acc_HolderName = accHN;
		acc_Type = accT;
		acc_No = accN;
		System.out.println("Parameterized Constructor 2");
	}
	
	/*public void openAccount()
	{
		bankName = "Bank Of Maharashtra";
		acc_HolderName = "Jayesh Kashid";
		acc_Type = "Saving";
		acc_No = 12345469675l;
		acc_Balence = 12000.456f;
	}*/
	
	public void showAccountDetails()
	{
		System.out.println("Bank name is: "+bankName);
		System.out.println("Account holder name is: "+acc_HolderName);
		System.out.println("Account type is: "+acc_Type);
		System.out.println("Account no is: "+acc_No);
		System.out.println("Balence is: "+acc_Balence);
	}
	
	public void depositAmount(float amount)
	{
		acc_Balence = acc_Balence + amount;
		System.out.println("Amount after deposit is: "+acc_Balence);
	}
	
	public void withdrawAmount(float amount)
	{
		if(acc_Balence - amount >= 1000)
		{
			acc_Balence = acc_Balence - amount;
			System.out.println("Amount after wihtdraw is: "+acc_Balence);
		}
		else
		{
			System.out.println("no sufficient amount");
		}
	}

	public static void main(String[] args) {
		
		Account a = new Account();
		a.showAccountDetails();
		
		Account a1 = new Account("ICICI Bank","Shubham Chavan","Saving",124243536,40000);
		a1.showAccountDetails();
		
		Account a2 = new Account("HDFC Bank","Jayesh Kashid","Saving",2145353264);
		a2.showAccountDetails();
		
		/*float amt1,amt2;
		Scanner sc = new Scanner(System.in);*/
		
		//a.openAccount();
		//a.showAccountDetails();
		
		/*System.out.println("Enter the deposite amount:");
		amt1 = sc.nextFloat();
		a.depositAmount(amt1);
		
		System.out.println("Enter the withdraw amount:");
		amt2 = sc.nextFloat();
		a.withdrawAmount(amt2);*/
		
		//sc.close();

	}

}
