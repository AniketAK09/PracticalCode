package oopsConcept;

public class PlacementBureau {
	
	int dayLimit;
	float fees;
	String bureauName, location;
	
	public void openPlacementBureau()
	{
		bureauName = "xyz services";
		fees = 6000.00f;
		dayLimit = 30;
		location = "Kothrud";
	}
	
	public void showPlacementBureauDetails()
	{
		System.out.println("Bureau name is: "+bureauName);
		System.out.println("Fees is: "+fees);
		System.out.println("How many days to placement: "+dayLimit);
		System.out.println("Location is: "+location);
	}

}
