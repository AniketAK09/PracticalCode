
public class Unary {

	public static void main(String[] args) {
		
		int x=5;
		int y=9;
		int z;
		
		z= x-- % y++ *(++y/--x) +3;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

	
}
