
public class FindNeon_1to20 {
	
	public int checkNeon(int no)
	{
		int square = no * no;
		int sum = 0;
		
		while(square > 0)
		{
			int rem = square % 10;
			sum = sum + rem;
			square  = square / 10;
		}
		
		if(sum == no)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void main(String[] args) {
		
		FindNeon_1to20 obj = new FindNeon_1to20();
		
		for(int i=1;i<=20;i++)
		{
			if(obj.checkNeon(i) == 1)
			{
				System.out.println(i+" is neon number");
			}
			else
			{
				System.out.println(i+" is not neon number");
			}
		}

	}

}
