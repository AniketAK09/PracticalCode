package com.p2;

import com.p1.Student;

public class Details {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		System.out.println(s.rollNo);
		//System.out.println(s.admissionNo);
		//System.out.println(s.age);
		//System.out.println(s.courseId);
		
		s.doPublic();
		//s.doProtected();
		//s.doDefault();
		//s.doPrivate();

	}

}
