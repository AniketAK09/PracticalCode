package com.interfac;

public class Publication {

	public static void main(String[] args) {
		
		Edit e;
		e = new Magazine();
		e.completeReading();
		e.writeContent("Vogue");
		e.doEditing();
		System.out.println(".......................................................................");
		e = new Book();
		e.completeReading();
		e.writeContent("Wings Of Fire");
		e.doEditing();

	}

}
