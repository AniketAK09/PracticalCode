package writtenTestPaper1;

public class PrintNo1To100_DivisibleBy3Or7 {
	
	public void printNumberDivisibleBy3Or7()
	{
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 || i%7==0)
			{
				continue;
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		PrintNo1To100_DivisibleBy3Or7 obj = new PrintNo1To100_DivisibleBy3Or7();
		
		obj.printNumberDivisibleBy3Or7();

	}

}
