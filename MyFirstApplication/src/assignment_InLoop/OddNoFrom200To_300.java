package assignment_InLoop;

public class OddNoFrom200To_300 {

	public static void main(String[] args) {
		
		int i=200;
		System.out.println("Odd numbers between 200 to 300");
		while(i<=300)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
			i++;
		}

	}

}
