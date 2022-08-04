package javaProgramsAssignment_First;

import java.util.Scanner;

public class Year_Month_Days {

	public static void main(String[] args) {
		
		int noOfDays, year, month, week, day = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of days:");
        noOfDays = s.nextInt();
        
        if(noOfDays>=365)
        {
        	year = noOfDays / 365;
            noOfDays = noOfDays % 365;
            System.out.println("No of Years is:"+year);
        }
        
        if(noOfDays>=30)
        {
        	month = noOfDays / 30;
            noOfDays = noOfDays % 30;
            System.out.println("No of Months is:"+month);
        }
        
        if(noOfDays>=7)
        {
        	week = noOfDays / 7;
            noOfDays  = noOfDays % 7;
            System.out.println("No of Weeks is:"+week);
            
        }
        
        if(noOfDays>=0)
        {
        	day = noOfDays;
        	System.out.println("No of Days is:"+day);
        }
       
        

	}

}
