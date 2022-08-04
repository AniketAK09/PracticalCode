package oopsConcept;

public class ThisKeyword_ConstructorChaining {
	
	int eid;
	String eName;
	float salary;
	
	ThisKeyword_ConstructorChaining()
	{
		this(101,"Ashish",12000);
	}
	
	ThisKeyword_ConstructorChaining(int i,String nm,float sal)
	{
		/*eid = i;
		eName = nm;
		salary = sal;*/
		
		this(nm,sal);
		eid = i;
	}
	
	ThisKeyword_ConstructorChaining(String nm,float sal)
	{
		eName = nm;
		salary = sal;
	}
	
	public void showDetails()
	{
		System.out.println("Employee ID is: "+eid);
		System.out.println("Employee name is: "+eName);
		System.out.println("Empployee salary is: "+salary);
	}
	
	

	public static void main(String[] args) {
		
		ThisKeyword_ConstructorChaining t = new ThisKeyword_ConstructorChaining();
		t.showDetails();
		
		//ThisKeyword_ConstructorChaining t1 = new ThisKeyword_ConstructorChaining(102,"Ashok",15000);

	}

}
