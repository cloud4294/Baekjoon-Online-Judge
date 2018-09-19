import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2611 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[][] data = new int[N+1][N+1];
		int[] dp = new int[N+1];
		
		for (int i = 0; i < M; i++) {
			String[] input = br.readLine().split(" ");
			int start = Integer.parseInt(input[0]);
			int dest = Integer.parseInt(input[1]);
			int value = Integer.parseInt(input[2]);
			data[start][dest] = value;
		}
		
		for (int i = 2; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				dp[i] = Math.max(dp[i], dp[j]+ data[j][i]);
			}
		}
		
		for (int i = 1; i <= N; i++) {
			System.out.println(dp[i]);
		}
	}

}
