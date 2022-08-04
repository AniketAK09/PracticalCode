package oopsConcept;

public class Account_StaticVar {
	
	static float inRate = 5.5f;
	int acc_id;
	String name;
	float balence;
	static int objCount = 0;
	static int acId = 13245;
	
	/*public Account_StaticVar() {
		
		objCount++;
		
	}
	
	public Account_StaticVar(int id,String nm,float bln) {
		
		acc_id = id;
		name = nm;
		balence = bln;
		objCount++;
	}*/
	

	public Account_StaticVar() {
		
		objCount++;
		
	}
	
	public Account_StaticVar(String nm,float bln) {
		
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
		
		System.out.println("Currently interest rate is "+Account_StaticVar.inRate);
		//Account_StaticVar a = new Account_StaticVar(234352,"Ajay Gurav",12000.324f);
		//Account_StaticVar a1 = new Account_StaticVar(54786,"Aslam Mulani",30000);
		
		Account_StaticVar a = new Account_StaticVar("Vaibhav Jadhav",22000.324f);
		Account_StaticVar a1 = new Account_StaticVar("Shubham Chavan",18000);
		System.out.println(Account_StaticVar.inRate);
		Account_StaticVar.changeInRate(6.5f);
		System.out.println(a);
		System.out.println(a1);
		System.out.println("Total object of current class is "+Account_StaticVar.objCount);
	}

}
