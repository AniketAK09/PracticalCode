package oopsConcept;

public class Order_Encapsulation {
	
	public void showCustomerDetails(Customer_Encapsulation ct)
	{
		System.out.println("Customer id is: "+ct.getCid());
		System.out.println("Name of customer is: "+ct.getCname());
		System.out.println("Customer address is: "+ct.getCadd());
		System.out.println("Customer mobile no is: "+ct.getCmob());
	}

	public static void main(String[] args) {
		
		Customer_Encapsulation c1 = new Customer_Encapsulation();
		c1.setCid(112);
		c1.setCname("Amit Jadhav");
		c1.setCadd("Kolhapur");
		c1.setCmob(9867452321L);
		
		Customer_Encapsulation c2 = new Customer_Encapsulation();
		c2.setCid(c1.getCid());
		c2.setCname(c1.getCname());
		c2.setCadd(c1.getCadd());
		c2.setCmob(c1.getCmob());
		
		Order_Encapsulation obj = new Order_Encapsulation();
		obj.showCustomerDetails(c1);
		System.out.println("________________________________");
		obj.showCustomerDetails(c2);
		

	}

}
