package app.prog;

public class DesktopApplication extends Application {
	
	String name;
	double cost;
	public DesktopApplication() {
		
	}
	
	public DesktopApplication(String nm,double c)
	{
		super(2.1f,"Java Swing and AWT");
		name = nm;
		cost = c;
	}
	
	public void desktopApp()
	{
		super.install();
		super.uninstall();
		System.out.println("I'm desktop application");
	}
	
	public void setName(String nm)
	{
		name = nm;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setCost(double c)
	{
		cost = c;
	}
	
	public double getCost()
	{
		return cost;
	}

	
	public String toString() {
		
		return "Desktop application name "+name+"\nCost of application "+cost+
				"\nversion of desktop application "+version+"\nTechnology used for creating desktop application "+technologyUsed+
				"\n"+dev;
	}

}
