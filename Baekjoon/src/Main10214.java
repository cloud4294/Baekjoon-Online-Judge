import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10214 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] output = new String[T];
		for (int i = 0; i < T; i++) {
			int Y = 0;
			int K = 0;
			for (int j = 0; j < 9; j++) {
				String[] input = br.readLine().split(" ");
				Y += Integer.parseInt(input[0]);
				K += Integer.parseInt(input[1]);
			}
			
			if(Y > K)
				output[i] = "Yonsei";
			else if(Y < K)
				output[i] = "Korea";
			else
				output[i] = "Draw";
		}
		
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
