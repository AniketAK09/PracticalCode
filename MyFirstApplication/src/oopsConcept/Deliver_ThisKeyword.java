package oopsConcept;

public class Deliver_ThisKeyword {

	public static void main(String[] args) {
		
		Item_ThisKeyword it = new Item_ThisKeyword(145,"Suraj");
		System.out.println(it.hashCode());
		System.out.println(it);
		
		System.out.println(".....................................................");
		
		Item_ThisKeyword it1 = new Item_ThisKeyword();
		System.out.println(it1.hashCode());
		System.out.println(it1);
		
		System.out.println(".....................................................");
		Item_ThisKeyword it2 = new Item_ThisKeyword();
		it2 = it1;
		System.out.println(it2.hashCode());
				

	}

}
