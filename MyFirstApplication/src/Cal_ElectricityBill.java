import java.util.Scanner;

public class Cal_ElectricityBill {

	public static void main(String[] args) {
		
		int units;  
        double billToPay = 0;     
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter number of units for calculating electricity bill.");  
        units = sc.nextInt();  
  
        if(units <=50)
        {
			billToPay = units * 2 + 100;
		}
		else if(units <= 80)
		{
			billToPay = (50 * 2) + (units - 50) * 3 + 100 ;
		}
		else if(units <= 100)
		{
			billToPay = (50 * 2) + (30 * 3) + (units - 80) * 4 + 100 ;
		}
		else if(units > 100)
		{
			billToPay = (50 * 2) + (30 * 3) + (20 * 4 ) + (units - 100) * 7  + 100;
		}
        
        System.out.println("Electricity Bill is "+ billToPay);

	}

}
