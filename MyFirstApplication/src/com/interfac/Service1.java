package com.interfac;

public interface Service1 {
	
	float serviceTax = 18.5f;
	
	void provideService(String details);
	
	static void provideOnlineService()
	{
		System.out.println("You will");
	}
	
	default void discontinueService()
	{
		System.out.println("Your service is stoped");
	}

}
class Registration implements Service1
{
	public void provideService(String s)
	{
		System.out.println("Take your service with service tax "+Service1.serviceTax);
	}
	
	public void discontinueService()
	{
		//super.discontinueService();
		System.out.println("Your service is Stopes after 40 hrs");
	}
}
