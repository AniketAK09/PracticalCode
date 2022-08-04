package oopsConcept;

public class Invertory_Encapsulation {

	public static void main(String[] args) {
		
		Supply_Encapsulation se = new Supply_Encapsulation();
		
		se.setId(121);
		System.out.println("Supplier id is: "+se.getId());
		
		se.setName("Rahul");
		System.out.println("Supplier name is: "+se.getName());
		
		se.setMobNo(789054456);
		System.out.println("Supplier mobile no is: "+se.getMobNo());

	}

}
