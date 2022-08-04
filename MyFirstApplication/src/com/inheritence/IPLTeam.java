package com.inheritence;

public class IPLTeam {
	
	public void play(String teamName)
	{
		System.out.print(teamName+" play the cricket");
	}

}
class CSK extends IPLTeam
{
	public void show()
	{
		System.out.println(" and won the match");
	}
}
class RCB extends IPLTeam
{
	public void show()
	{
		System.out.println(" and won the match");
	}
}
