package oopsConcept;

import java.util.Scanner;

public class Account1 {
	
	String bankName,acc_HolderName,acc_Type;
	long acc_No;
	float acc_Balence;
	
	public void openAccount(String bN,String accHN,String accT,long accN,float accB)
	{
		bankName = bN;
		acc_HolderName  = accHN;
		acc_Type = accT;
		acc_No = accN;
		acc_Balence = accB;
	}
	
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
		
		Account1 a = new Account1();
		for(int i=1;i<=2;i++)
		{
			float amt1,amt2,accBalence;
			String bankName,accHolderName,accType;
			long accNo;
			Scanner sc = new Scanner(System.in);
			sc.nextLine();
			System.out.println("Enter the bank name:");
			bankName = sc.nextLine();
			System.out.println("Enter account holder name:");
			accHolderName =sc.nextLine();
			System.out.println("Enter account type:");
			accType = sc.nextLine();
			System.out.println("Enter the account no:");
			accNo = sc.nextLong();
			System.out.println("Enter account balence:");
			accBalence = sc.nextFloat();
			
			a.openAccount(bankName,accHolderName,accType,accNo,accBalence);
			a.showAccountDetails();
			
			System.out.println("Enter the deposite amount:");
			amt1 = sc.nextFloat();
			a.depositAmount(amt1);
			
			System.out.println("Enter the withdraw amount:");
			amt2 = sc.nextFloat();
			a.withdrawAmount(amt2);
			
			//sc.close();
			
		}

	}

}
