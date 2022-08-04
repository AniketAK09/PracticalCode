package app.prog;

public class Developer {
	
	/*private String devName;
	private float devExperience;
	private String skills;*/
	
	String devName;
	float devExperience;
	String skills;
	
	public Developer() { }
	
	public Developer(String dN,float dE,String sk)
	{
		devName = dN;
		devExperience = dE;
		skills = sk;
	}
	
	public void debugApp()
	{
		System.out.println("Please debug the errors in the program");
	}
	
	public void integrateCode()
	{
		System.out.println("Please integrated given java code");
	}

	public void setDevName(String devName)
	{
		this.devName = devName;
	}
	
	public String getDevName()
	{
		return devName;
	}

	public void setDevExperience(float devExperience)
	{
		this.devExperience = devExperience;
	}
	
	public float getDevExperience()
	{
		return devExperience;
	}

	public void setSkills(String skills)
	{
		this.skills = skills;
	}
	
	public String getSkills()
	{
		return skills;
	}

	public String toString() {
		
		return "Developer name "+devName+"\nDeveloper Experience "+devExperience+
				"\nAnd developer skills are "+skills;
	}

}
