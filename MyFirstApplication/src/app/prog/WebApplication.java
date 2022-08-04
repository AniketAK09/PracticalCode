package app.prog;

public class WebApplication extends Application {
	
	String name;
	
	public WebApplication() { }
	
	public WebApplication(String nm)
	{
		super(4.3f,"Spring Boot");
		name = nm;
	}
	
	public void webApp()
	{
		super.install();
		super.uninstall();
		System.out.println("I'm web Application");
	}
	
	public void setName(String nm)
	{
		name = nm;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	public String toString() {
		
		return "Web application name "+name+
				"\nversion of web application "+version+"\nTechnology used for creating web application "+technologyUsed+
				"\n"+dev;
	}
	
	public static void main(String[] args) {
		
		WebApplication w = new WebApplication("Amazon");
		System.out.println(w);
		w.webApp();
		
		System.out.println("______________________*********************__________________");
		
		DesktopApplication d = new DesktopApplication("Skypee", 4500000d);
		System.out.println(d);
		d.desktopApp();
	}

}
