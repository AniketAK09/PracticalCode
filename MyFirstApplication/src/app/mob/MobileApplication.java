package app.mob;

import app.prog.Application;

public class MobileApplication extends Application {
	
	String name,model;
	
	public MobileApplication() { }
	
	public MobileApplication(String nm,String ml)
	{
		super(8.9f,"Kotlin");
		name = nm;
		model = ml;
	}
	
	public void mobApp()
	{
		super.install();
		super.uninstall();
		System.out.println("I'm Mobile Application");
	}
	
	public void setName(String nm)
	{
		name = nm;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setModel(String ml)
	{
		model = ml;
	}
	
	public String getModel()
	{
		return model;
	}
	
	
	public String toString() {
		return "Mobile application name "+name+"\nModel number is "+model+
				"\nVersion of mobile application "+version+"\nTechnology used for creating mobile application "+technologyUsed+
				"\n"+dev;
	}

	public static void main(String[] args) {
		
		MobileApplication m = new MobileApplication("Omen","224352");
		System.out.println(m);
		m.mobApp();

	}

}
