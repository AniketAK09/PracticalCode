
public class ContinueStatement {

	public static void main(String[] args) {
		
		int count = 0;
		
		while(count <= 20)
		{
			count +=2;
			
			if(count == 10)
			{
				continue;
			}
	
			System.out.println(count);
		}

	}

}
