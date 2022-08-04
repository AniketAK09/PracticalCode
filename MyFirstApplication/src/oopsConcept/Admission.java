package oopsConcept;

import java.util.Scanner;

public class Admission {

	public static void main(String[] args) {
		
		Candidate_Encapsulation ce = new Candidate_Encapsulation();
		
		ce.setRollNo(101);
		System.out.println("Candidate roll no is: "+ce.getRollNo());
		
		ce.setName("Ashok Hivare");
		System.out.println("Name of candidate is: "+ce.getName());
		
		ce.setPhysicsMark(65);
		System.out.println("Marks of candidate in physics is: "+ce.getPhysicsMark());
		
		ce.setChemistryMark(70);
		System.out.println("Marks of candidate in chemistry is: "+ce.getChemistryMark());
		
		ce.setMathsMark(55);
		System.out.println("Marks of candidate in maths is: "+ce.getMathsMark());
		
		float per;
		int sum,total,outOf;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the out of marks:");
		outOf = sc.nextInt();
		
		total = 3 * outOf;
		
		sum = ce.getPhysicsMark() + ce.getChemistryMark() + ce.getMathsMark();
		
		per = (float)(sum * 100) / total;
		
		System.out.println("Sum is: "+sum);
		System.out.println("Percentage is: "+per);
	}

}
