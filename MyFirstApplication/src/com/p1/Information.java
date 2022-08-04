package com.p1;

public class Information {

	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println(s.rollNo);
		System.out.println(s.admissionNo);
		System.out.println(s.age);
		//System.out.println(s.courseId);  //private variable
		
		s.doPublic();
		s.doDefault();
		s.doProtected();
		//s.doPrivate();   //private method

	}

}
