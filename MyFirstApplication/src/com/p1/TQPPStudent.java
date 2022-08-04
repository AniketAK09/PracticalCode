package com.p1;

public class TQPPStudent extends Student {
	
	void checkStudentVariableAccess()
	{
		rollNo = 102;
		admissionNo = 129012;
		age = 20;
		//courseId = 134;  //private variable is not inherited or reassigned
	}
	
	void checkStudentMethodAccess()
	{
		doPublic();
		doDefault();
		doProtected();
		//doPrivate();    //private method not access outside class
	}

}
