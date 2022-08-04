package javaProgramsAssignment_Third;

public class Supplier {
	
	private int suppID;
	private String suppName;
	private long suppMobile;
	
	public Supplier() {
		
	}
	
	public Supplier(int supId,String supN,long supM)
	{
		suppID = supId;
		suppName = supN;
		suppMobile = supM;
	}

	public void setSuppID(int supId)
	{
		suppID = supId;
	}
	
	public int getSuppID()
	{
		return suppID;
	}

	public void setSuppName(String supN)
	{
		suppName = supN;
	}
	
	public String getSuppName()
	{
		return suppName;
	}

	public void setSuppMobile(long supM)
	{
		suppMobile = supM;
	}
	
	public long getSuppMobile()
	{
		return suppMobile;
	}
	
	
	public String toString() {
		
		return "Supplier id "+suppID+"\nSupplier name "+suppName+
				"\nSupplier mobile "+suppMobile;
	}

}
