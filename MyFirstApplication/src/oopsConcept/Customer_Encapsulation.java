package oopsConcept;

public class Customer_Encapsulation {
	
	private int cid;
	private String cName;
	private String cAdd;
	private long cMob;
	
	public void setCid(int id)
	{
		cid = id;
	}
	
	public int getCid()
	{
		return cid;
	}
	
	public void setCname(String nm)
	{
		cName = nm;
	}
	
	public String getCname()
	{
		return cName;
	}
	
	public void setCadd(String ad)
	{
		cAdd = ad;
	}
	
	public String getCadd()
	{
		return cAdd;
	}
	
	public void setCmob(long mn)
	{
		cMob = mn;
	}
	
	public long getCmob()
	{
		return cMob;
	}
	

}
