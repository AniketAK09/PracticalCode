package com.interfac;

public class ProvideAllService {

	public static void main(String[] args) {
		
		Wash w;
		Clean c = new Kitchen();
		c.doWashing();
		c.doPolishing();
		c.doCleaning();
		System.out.println("...........................................");
		c = new CarService();
		c.doWashing();
		c.doPolishing();
		c.doCleaning();
		w = new CarService();
		w.doSprayWash();
		w.doWashing("Xress car services center");
		System.out.println(".....................................................................");
		c = new ClassRoom();
		c.doWashing();
		c.doPolishing();
		c.doCleaning();

	}

}
