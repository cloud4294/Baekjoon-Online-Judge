import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1315 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] STR = new int[N];
		int[] INT = new int[N];
		int[] PNT = new int[N];
		
		int[][] dp = new int[1000][1000];
		
		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			STR[i] = Integer.parseInt(input[0]);
			INT[i] = Integer.parseInt(input[1]);
			PNT[i] = Integer.parseInt(input[2]);
			dp[STR[i]][INT[i]] = PNT[i];
		}
		
		
	}

}
