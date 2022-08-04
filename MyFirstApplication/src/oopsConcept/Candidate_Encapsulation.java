package oopsConcept;

public class Candidate_Encapsulation {
	
	private int rollNo;
	private String name;
	private int physicsMark;
	private int chemistryMark;
	private int mathsMark;
	
	public Candidate_Encapsulation()
	{
		
	}
	
	public Candidate_Encapsulation(int rn,String nm,int phy,int che,int mat)
	{
		rollNo = rn;
		name = nm;
		physicsMark = phy;
		chemistryMark = che;
		mathsMark = mat;
	}
	
	public Candidate_Encapsulation(int rn,String nm)
	{
		rollNo = rn;
		name = nm;
	}
	
	public void setRollNo(int rollN)
	{
		rollNo = rollN;
	}
	
	public int getRollNo()
	{
		return rollNo;
	}
	
	public void setName(String nm)
	{
		name = nm;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setPhysicsMark(int phyMark)
	{
		physicsMark = phyMark;
	}
	
	public int getPhysicsMark()
	{
		return physicsMark;
	}
	
	public void setChemistryMark(int cheMark)
	{
		chemistryMark = cheMark;
	}
	
	public int getChemistryMark()
	{
		return chemistryMark;
	}
	
	public void setMathsMark(int mathMark)
	{
		mathsMark = mathMark;
	}
	
	public int getMathsMark()
	{
		return mathsMark;
	}
	
}
