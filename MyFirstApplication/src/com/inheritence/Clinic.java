package com.inheritence;

public class Clinic {

	public static void main(String[] args) {
		
		Surgeon s = new Surgeon(21,"ByPass Surgery");
		s.makeDignosys("chest pain");
		System.out.println(s);
		s.doSurgery();

	}

}
