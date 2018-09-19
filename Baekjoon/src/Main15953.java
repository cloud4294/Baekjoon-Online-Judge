import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15953 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		

		int[] priceA = { 5000000, 3000000, 2000000, 500000, 300000, 100000 };
		int[] priceB = { 5120000, 2560000, 1280000, 640000, 320000 };

		int[] output = new int[T];
		
		for (int i = 0; i < T; i++) {
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);

			
			int rankA = 1;
			int rankB = 1;
			int sum = 0;
			
			int temp = 1;
			if(a != 0) {
				for (int j = 1; j <= 6; j++) {
					if (a <= rankA) {
						sum += priceA[j - 1];
						break;
					}
					temp++;
					
					rankA += temp;
				}
			}
			
			temp = 1;
			if(b != 0) {
				for (int j = 1; j <= 5; j++) {
					if (b <= rankB) {
						sum += priceB[j - 1];
						break;
					}
					temp *= 2;
					rankB += temp;
				}
			}
			
			output[i] = sum;
		}
		
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
