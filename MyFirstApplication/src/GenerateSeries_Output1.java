import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GenerateSeries_Output1 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input_from_quesrion = br.readLine();
		
		int num = Integer.parseInt(input_from_quesrion);
		
		input_from_quesrion ="";
		
		for(int i=1;i<=num;i=i*2+1)
		{
			input_from_quesrion = input_from_quesrion+i+" ";
		}
		
		System.out.print(input_from_quesrion);

	}

}
