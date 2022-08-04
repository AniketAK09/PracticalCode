package oopsConcept;

public class Account_StaticVar1 {

	static float inRate;
	int acc_id;
	String name;
	float balence;
	static int objCount = 0;
	static int acId;
	
	/*public Account_StaticVar1() {
		
		objCount++;
		
	}
	
	public Account_StaticVar1(int id,String nm,float bln) {
		
		acc_id = id;
		name = nm;
		balence = bln;
		objCount++;
	}*/
	
	static
	{
		inRate = 4.2f;
	}
	
	static
	{
		acId = 4567;
	}

	public Account_StaticVar1() {
		
		objCount++;
		
	}
	
	public Account_StaticVar1(String nm,float bln) {
		
		acc_id = acId++;
		name = nm;
		balence = bln;
		objCount++;
	}
	
	public String toString()
	{
		return "Account id is: "+acc_id+" account holder name is "+name+" balence is "+balence+
				" and interest rate is:"+inRate;
	}
	
	public static void changeInRate(float newInRate)
	{
		inRate = newInRate;
		System.out.println("Interest rate changed to "+inRate);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Currently interest rate is "+Account_StaticVar1.inRate);
		//Account_StaticVar1 a = new Account_StaticVar1(234352,"Ajay Gurav",12000.324f);
		//Account_StaticVar1 a1 = new Account_StaticVar1(54786,"Aslam Mulani",30000);
		
		Account_StaticVar1 a = new Account_StaticVar1("Vaibhav Jadhav",22000.324f);
		Account_StaticVar1 a1 = new Account_StaticVar1("Shubham Chavan",18000);
		System.out.println(Account_StaticVar1.inRate);
		Account_StaticVar1.changeInRate(4.5f);
		System.out.println(a);
		System.out.println(a1);
		System.out.println("Total object of current class is "+Account_StaticVar1.objCount);
	}

}
