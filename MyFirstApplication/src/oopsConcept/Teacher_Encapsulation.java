package oopsConcept;

public class Teacher_Encapsulation {
	
	private int tid;
	private String name;
	private String address;
	private long mobNo;
	
	public Teacher_Encapsulation()
	{
	
	}
	
	public Teacher_Encapsulation(int id,String nm,String add,long mn)
	{
		tid = id;
		name = nm;
		address = add;
		mobNo = mn;
	}
	
	public void setTid(int id)
	{
		tid = id;
	}
	
	public int getTid()
	{
		return tid;
	}
	
	public void setName(String nm)
	{
		name = nm;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAddress(String add)
	{
		address = add;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setMobNo(long mn)
	{
		mobNo = mn;
	}
	
	public long getMobNo()
	{
		return mobNo;
	}

}
