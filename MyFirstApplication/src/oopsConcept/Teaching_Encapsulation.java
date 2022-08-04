package oopsConcept;

public class Teaching_Encapsulation {
	
	public void showTeacherDetails(Teacher_Encapsulation te)
	{
		System.out.println("Teacher id is: "+te.getTid());
		System.out.println("Name of teacher is: "+te.getName());
		System.out.println("Addrees is: "+te.getAddress());
		System.out.println("Teacher mobile number is: "+te.getMobNo());
	}

	public static void main(String[] args) {
		
		Teacher_Encapsulation t1 = new Teacher_Encapsulation();
		t1.setTid(212);
		t1.setName("Anand Tambe");
		t1.setAddress("Satara");
		t1.setMobNo(7645302130L);
		
		Teacher_Encapsulation t2 = new Teacher_Encapsulation(112,"Mohit Priyadarshan","Pune",996732876);
		
		Teaching_Encapsulation t = new Teaching_Encapsulation();
		t.showTeacherDetails(t1);
		System.out.println("____________________________________");
		t.showTeacherDetails(t2);

	}

}
