import java.util.Scanner;

public class Calculate_Per {

	public static void main(String[] args) {
		
		int physics,chemistry,maths,avgphysics,avgchemistry,avgmaths;
		int phy_OutOf,che_OutOf,math_OutOf;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of physics");
		physics = sc.nextInt();
		System.out.println("Enter out of marks of physics");
		phy_OutOf = sc.nextInt();
		
		System.out.println("Enter the marks of chemistry");
		chemistry = sc.nextInt();
		System.out.println("Enter out of marks of chemistry");
		che_OutOf = sc.nextInt();
		
		System.out.println("Enter the marks of maths");
		maths = sc.nextInt();
		System.out.println("Enter out of marks of maths");
		math_OutOf = sc.nextInt();
		
		avgphysics = (physics*100)/phy_OutOf;
		avgchemistry = (chemistry*100)/che_OutOf;
		avgmaths = (maths*100)/math_OutOf;
		
		System.out.println("Marks of physics is:"+avgphysics);
		System.out.println("Marks of chemistry is:"+avgchemistry);
		System.out.println("Marks of maths is:"+avgmaths);
		
		
		

	}

}
