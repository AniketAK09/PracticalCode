
public class CheckPrime_1to_100_ReturnBooleanType {
	
	public int checkPrime(int no)
	{
		int i,flag = 1;
		if(no==0 || no==1)
		{
			flag = 0;
		}
		else
		{
			for(i=2;i<=no/2;i++)
			{
				if(no % i == 0)
				{
					flag = 0;
					break;
				}
			}
			
			if(flag == 1)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		
		CheckPrime_1to_100_ReturnBooleanType obj = new CheckPrime_1to_100_ReturnBooleanType();
		
		for(int i=1;i<=100;i++)
		{
			if(obj.checkPrime(i) == 1)
			{
				System.out.println(i+" is prime");
			}
			else
			{
				System.out.println(i+" is not prime");
			}
		}

	}

}
