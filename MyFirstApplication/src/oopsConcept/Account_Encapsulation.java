package oopsConcept;

public class Account_Encapsulation {
	
	private String bankName,acc_HolderName,acc_Type;
	private long acc_No;
	private float acc_Balence;
	
	public Account_Encapsulation()
	{
		
	}
	
	public Account_Encapsulation(String bankN,String accHN,String accT,long accN,float accB)
	{
		bankName = bankN;
		acc_HolderName = accHN;
		acc_Type = accT;
		acc_No = accN;
		acc_Balence = accB;
	}
	
	public void setBankName(String bn)
	{
		bankName = bn;
	}
	
	public String getBankName()
	{
		return bankName;
	}
	
	public void setAcc_HolderName(String accHN)
	{
		acc_HolderName = accHN;
	}
	
	public String getAcc_HolderName()
	{
		return acc_HolderName;
	}
	
	public void setAcc_Type(String accT)
	{
		acc_Type = accT;
	}
	
	public String getAcc_Type()
	{
		return acc_Type;
	}
	
	public void setAcc_No(long accN)
	{
		acc_No = accN;
	}
	
	public long getAcc_No()
	{
		return acc_No;
	}
	
	public void setAcc_Balence(float accB)
	{
		acc_Balence = accB;
	}
	
	public float getAcc_Balence()
	{
		return acc_Balence;
	}

}
