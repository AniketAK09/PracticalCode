package com.inheritence;

public class Main {

	public static void main(String[] args) {
		
		Kid k1,k2;
		k1 = new BigKid();
		k1.readBook();
		k1.readBook("Client Server Computing","Lalit Kumar");
		
		System.out.println("...................................................................................................");
	
		k2 = new Teenager();
		k2.readBook();
		k2.readBook("Robinson Crusoe","Daniel Defoe");
	}

}
