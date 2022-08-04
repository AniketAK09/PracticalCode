
public class Print_No_WhileLoop {

	public static void main(String[] args) {
		
		int count = 7,i = 6, ans = 1;
		
		while(ans <= 9)
		{
			ans = count - i;
			System.out.println(ans);
			i = i - 2;
			ans = ans + 2;
			
		}

	}

}
