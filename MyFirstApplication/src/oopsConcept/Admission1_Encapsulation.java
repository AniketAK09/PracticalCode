package oopsConcept;

public class Admission1_Encapsulation {
	
	public double calPercentage(Candidate_Encapsulation ct)
	{
		int total = ct.getPhysicsMark() + ct.getChemistryMark() +ct.getMathsMark();
		System.out.println("Tatal marks is: "+total);
		
		double per = (total * 100 ) / 300;
		return per;
	}
	
	public void showCandidateDetails(Candidate_Encapsulation ct)
	{
		System.out.println("Candidate roll no is: "+ct.getRollNo());
		System.out.println("Name of candidate is: "+ct.getName());
		System.out.println("Marks of candidate in physics is: "+ct.getPhysicsMark());
		System.out.println("Marks of candidate in chemistry is: "+ct.getChemistryMark());
		System.out.println("Marks of candidate in maths is: "+ct.getMathsMark());
	}

	public static void main(String[] args) {
		
		Candidate_Encapsulation ce = new Candidate_Encapsulation();
		
		ce.setRollNo(101);
		ce.setName("Ajay Gurav");
		ce.setPhysicsMark(78);
		ce.setChemistryMark(81);
		ce.setMathsMark(91);
		
		//copy one object value in other object
		Candidate_Encapsulation ce1 = new Candidate_Encapsulation(12,"Avinash Mane",67,78,89);
		
		Candidate_Encapsulation ce2 = new Candidate_Encapsulation();
		ce2.setRollNo(ce1.getRollNo());
		ce2.setName(ce1.getName());
		ce2.setPhysicsMark(ce1.getPhysicsMark());
		ce2.setChemistryMark(ce1.getChemistryMark());
		ce2.setMathsMark(ce1.getMathsMark());
		
		
		
		
		Admission1_Encapsulation a = new Admission1_Encapsulation();
		a.showCandidateDetails(ce);
		
		double percentage = (double)a.calPercentage(ce);
		System.out.println("Percentage is: "+percentage);
		
		System.out.println("_____________________________");
		a.showCandidateDetails(ce2);

	}

}
