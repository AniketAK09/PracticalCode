package com.functionalInterface;

public class Main1 {

	public static void main(String[] args) {
		
		Operate1 op = (n1,n2) ->{
									System.out.println("Addition is "+(n1+n2));
									System.out.println("Substration is "+(n1-n2));
									System.out.println("Multiplication is "+(n1*n2));
									System.out.println("Division is "+(n1/n2));
									return 0;
								};
		int result = op.doOperation(30,6);
		
		/*Operate1 op = (n1,n2) ->{ return n1+n2; };
		int result = op.doOperation(30,6);
		System.out.println(result);*/

	}

}
