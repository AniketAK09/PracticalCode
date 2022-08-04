package com.functionalInterface;

public class Main {

	public static void main(String[] args) {
		
		Operate op = (no,nm) ->{System.out.println("No of operation is "+no+" "
									+"and name of operation is "+nm);
								System.out.println("Operation is done....");
							};
		op.doOperation(4,"Add the number");
		
		op = (n,nm) ->{System.out.println("No of opeation is "+n+" "
						+"and no of operation is "+nm);
					   System.out.println("Another operation is done....");	
					};
		op.doOperation(8,"Write pattern programs");

	}

}
