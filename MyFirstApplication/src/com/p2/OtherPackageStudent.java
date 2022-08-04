package com.p2;

import com.p1.Student;

public class OtherPackageStudent extends Student {
	
	void checkStudentVariableAccess()
	{
		rollNo = 102;
		admissionNo = 129012;
		//age = 20;       //default variable not access outside package
		//courseId = 134;    //private variable not access outside class
	}
	
	void checkStudentMethodAccess()
	{
		doPublic();
		//doDefault();   //default method not access outside package
		doProtected();
		//doPrivate();     //private method not access outside class
	}

}
