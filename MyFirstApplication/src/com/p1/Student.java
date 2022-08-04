package com.p1;

public class Student {
	
	public int rollNo = 101;
	protected int admissionNo = 1256;
	int age = 21;
	private int courseId = 121;
	
	public void doPublic()
	{
		System.out.println("Roll no is: "+rollNo);
	}
	
	void doDefault()
	{
		System.out.println("Age is: "+age);
	}
	
	protected void doProtected()
	{
		System.out.println("Admission no is: "+admissionNo);
	}
	
	private void doPrivate()
	{
		System.out.println("Course id is: "+courseId);
	}

}
/*class TQPPStudent extends Student
{
	void checkStudentVariableAccess()
	{
		rollNo = 102;
		admissionNo = 129012;
		age = 20;
		//courseId = 134;
	}
	
	void checkStudentMethodAccess()
	{
		doPublic();
		doDefault();
		doProtected();
		//doPrivate();
	}
}*/
