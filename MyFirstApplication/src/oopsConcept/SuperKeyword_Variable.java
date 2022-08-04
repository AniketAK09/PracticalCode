package oopsConcept;

class Parent
{
	String name = "Vasant";
	
	public void display()
	{
		System.out.println("Name of Parent is "+name);
	}
}
class Child extends Parent
{
	String name = "Rohan";
	
	public void show()
	{
		System.out.println("Name of Parent is "+super.name);
		System.out.println("Name of his child is "+name);
	}
}

public class SuperKeyword_Variable {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.show();

	}

}
