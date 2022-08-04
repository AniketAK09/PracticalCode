package com.functionalInterface;

public interface Operate2 {
	
	void doOperation(int a,int b);
	
	static void performOperation()
	{
		System.out.println("operation is performed");
	}
	
	default void completeOperation()
	{
		System.out.println("Operation is completed");
	}

}
