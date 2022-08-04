package com.inheritence;

public class Service {

	public static void main(String[] args) {
		
		JunkFood jf = new JunkFood(210,"Pizza",10);
		jf.makeFood();
		jf.makeJunkFood();
		System.out.println(jf);

	}

}
