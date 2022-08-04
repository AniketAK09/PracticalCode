package oopsConcept;

public class FinalKeyword {
	
	final static String company = "Infosys";
	final int a = 21;
	final int empId;
	int empsal = 20000;
	
	public FinalKeyword() {
		empId = 101;
	}
	
	public FinalKeyword(int id)
	{
		empId = id;
	}
	
	public void doTask()
	{
		final float pi = 3.14f;
		//pi = 3.15f;
		
	}

	public static void main(String[] args) {
		
		FinalKeyword f = new FinalKeyword();
		//f.empId = 102;
		// f.a = 10;
		f.empsal = 23000;
		
		FinalKeyword f1 = new FinalKeyword(212);
		//f1.empId = 213;
		

	}

}
