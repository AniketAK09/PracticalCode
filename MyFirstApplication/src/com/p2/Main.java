package com.p2;

import com.p1.TQPPStudent;

public class Main {

	public static void main(String[] args) {
		
		TQPPStudent ts = new TQPPStudent();
		
		System.out.println(ts.rollNo);
		//System.out.println(ts.admissionNo);
		//System.out.println(ts.age);
		//System.out.println(ts.courseId);
		
		ts.doPublic();
		//ts.doProtected();
		//ts.doDefault();
		//ts.doPrivate();

	}

}
