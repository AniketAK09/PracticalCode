package app.prog;

public class Application {
	
	/*private float version;
	private String technologyUsed;
	private Developer dev;*/
	
	public float version;
	public String technologyUsed;
	public Developer dev;
	
	public Application() { }
	
	public Application(float ver,String techUsed)
	{
		version = ver;
		technologyUsed = techUsed;
		dev = new Developer("Aniket Kashid",2.4f,"Java, Spring Boot, Servlet, Kotlin");
	}
	
	public void install()
	{
		System.out.println("Just install the application you want to use");
	}
	
	public void uninstall()
	{
		System.out.println("Uninstall application you don't want to use");
	}

	public void setVersion(float ver)
	{
		version = ver;
	}
	
	public float getVersion()
	{
		return version;
	}

	public void setTechnologyUsed(String techUsed)
	{
		technologyUsed = techUsed;
	}
	
	public String getTechnologyUsed()
	{
		return technologyUsed;
	}

	public void setDev(Developer d)
	{
		dev = d;
	}
	
	public Developer getDev()
	{
		return dev;
	}
	
	
	public String toString() {
		
		return "Version of application is "+version+"\nThis technology used in application building "+technologyUsed+
				"\n"+dev;
	}
	
	public static void main(String[] args) {
		
		Developer d = new Developer();
		
		Application a = new Application(4.2f,"Spring Boot");
		d.debugApp();
		d.integrateCode();
		a.install();
		a.uninstall();
		System.out.println(a);
	}

}
