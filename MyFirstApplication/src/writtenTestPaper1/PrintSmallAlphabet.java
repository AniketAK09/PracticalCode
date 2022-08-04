package writtenTestPaper1;

public class PrintSmallAlphabet {
	
	public void printSmallAlphabet()
	{
		for(int i=122;i>=97;i--)
		{
			System.out.print((char)i+" ");
		}
	}

	public static void main(String[] args) {
		
		PrintSmallAlphabet obj = new PrintSmallAlphabet();
		
		obj.printSmallAlphabet();

	}

}
