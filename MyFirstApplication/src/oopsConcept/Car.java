package oopsConcept;

public class Car {
	
	String model;
	static int totalCarSold;
	
	public  static void showProperty()
	{
		totalCarSold = 10;
		//Model = "Brezza";
	}
	
	public void showInfo()
	{
		totalCarSold = 21;
		model = "Ertiga";
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
