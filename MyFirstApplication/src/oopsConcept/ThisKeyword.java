package oopsConcept;

public class ThisKeyword {
	
	int eid;
	String name;
	
	public ThisKeyword()
	{
		
	}
	
	public ThisKeyword(int eid,String name)
	{
		this.eid = eid;
		this.name = name;
	}
	
	public void show()
	{
		System.out.println("Employee id is: "+this.eid);
		System.out.println("Employee name is: "+this.name);
	}

}
