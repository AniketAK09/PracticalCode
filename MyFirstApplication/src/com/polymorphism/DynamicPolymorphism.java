package com.polymorphism;

class ElectronicDevice
{
	public void doSale()
	{
		System.out.println("Sale electronic device");
	}
}
class Television extends ElectronicDevice
{
	public void doSale()
	{
		System.out.println("On sale of television with exchange offers");
	}
}
class LED extends ElectronicDevice
{
	public void doSale()
	{
		System.out.println("30% discount on LED sale");
	}
}

public class DynamicPolymorphism {

	public static void main(String[] args) {
		
		ElectronicDevice sp;
		
		sp = new ElectronicDevice();
		sp.doSale();
		
		sp = new Television();
		sp.doSale();
		
		sp = new LED();
		sp.doSale();

	}

}
