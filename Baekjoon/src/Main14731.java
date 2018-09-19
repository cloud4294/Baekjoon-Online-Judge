import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main14731 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long result = 0;
		
		long[] two = new long[N];
		two[0] = 1;
		for (int i = 1; i < N; i++) {
			two[i] = 2 * two[i-1];
		}
		
		
		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			long b = Long.parseLong(input[1]);
			
			
			result += ( a * b * two[N-1-i]) % 1000000007;
			
		}
		
		System.out.println(result % 1000000007);
	}

}
