package oopsConcept;

import java.util.Scanner;

public class Student {
	
	String student_Name;
	int student_RollNo;
	int physics,chemistry,maths,outOf;
	
	public void acceptStudentDetails(String stuName,int stuRollNo,int phy,int che,int math,int out_Of)
	{
		student_Name = stuName;
		student_RollNo = stuRollNo;
		physics = phy;
		chemistry = che;
		maths = math;
		outOf = out_Of;
	}
	
	public void showStudentDetails()
	{
		System.out.println("Student name is: "+student_Name);
		System.out.println("Student roll no is: "+student_RollNo);
		System.out.println("Marks of physics is: "+physics);
		System.out.println("Marks of chemistry is: "+chemistry);
		System.out.println("Marks of maths is: "+maths);
		System.out.println("Out of marks is: "+outOf);
	}
	
	public void calPercentage()
	{
		int total = outOf * 3;
		int sum = physics + chemistry + maths;
		float per = (float)sum / total * 100;
		System.out.println("Sum is: "+sum);
		System.out.println("Percentage is: "+per);
		
		char grade;
		if(per >=80 )
		{
			grade = 'A';
		}
		else if(per >=60 && per < 80)
		{
			grade = 'B';
		}
		else if(per >= 40 && per <= 60)
		{
			grade = 'C';
		}
		else
		{
			grade = 'F';
		}
		
		System.out.println("Grade of student is: "+grade);
	}

	public static void main(String[] args) {
		
		Student s = new Student();
		
		String name;
		int rollNo;
		int phy,che,math,outOf;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name:");
		name = sc.nextLine();
		System.out.println("Enter student roll no:");
		rollNo = sc.nextInt();
		System.out.println("Enter marks of physics:");
		phy = sc.nextInt();
		System.out.println("Enter marks of chemistry:");
		che = sc.nextInt();
		System.out.println("Enter marks of maths:");
		math = sc.nextInt();
		System.out.println("Enter out of marks:");
		outOf = sc.nextInt();
		
		
		s.acceptStudentDetails(name, rollNo, phy, che, math, outOf);
		s.showStudentDetails();
		s.calPercentage();
		
		System.out.println("____________________________________________");
		
		Student s1 = new Student();
		
		System.out.println("Enter student name:");
		sc.nextLine();
		name = sc.nextLine();
		System.out.println("Enter student roll no:");
		rollNo = sc.nextInt();
		System.out.println("Enter marks of physics:");
		phy = sc.nextInt();
		System.out.println("Enter marks of chemistry:");
		che = sc.nextInt();
		System.out.println("Enter marks of maths:");
		math = sc.nextInt();
		System.out.println("Enter out of marks:");
		outOf = sc.nextInt();
		
		s1.acceptStudentDetails(name, rollNo, phy, che, math, outOf);
		s1.showStudentDetails();
		s1.calPercentage();
		
		
		

	}

}
