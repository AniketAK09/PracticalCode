import java.util.Scanner;

public class Cal_Percentage {

	public static void main(String[] args) {
		
		int physics,chemistry,maths,total;
		float per;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of physics");
		physics = sc.nextInt();
		System.out.println("Enter the marks of chemistry");
		chemistry = sc.nextInt();
		System.out.println("Enter the marks of maths");
		maths = sc.nextInt();
		
		total = physics + chemistry + maths;
		per = (float) total / 3;
		
		System.out.println("Total marks is: "+total);
		System.out.println("Percentage is: "+per);
		
		if(per>=80)
		{
			System.out.println("Student grade is: A+");
		}
		else if(per>=60)
		{
			System.out.println("Student grade is: A");
		}
		else if(per>=50)
		{
			System.out.println("Student grade is: B");
		}
		else if(per>=40)
		{
			System.out.println("Student grade is: C");
		}
		else
		{
			System.out.println("Student is fail ");
		}
		
		

	}

}
