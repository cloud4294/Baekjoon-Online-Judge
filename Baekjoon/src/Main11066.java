import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11066 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] output = new int[T];
		for (int i = 0; i < T; i++) {
			int K = Integer.parseInt(br.readLine());
			int[] value = new int[K + 1];
			int[] sum = new int[K + 1];
			int[][] dp = new int[K + 1][K + 1];
			String[] input = br.readLine().split(" ");
			for (int j = 1; j <= K; j++) {
				value[j] = Integer.parseInt(input[j - 1]);
				sum[j] = sum[j - 1] + value[j];
			}
			for (int j = 1; j < K; j++) {
				for (int start = 1; start + j <= K; start++) {
					int end = start + j;
					dp[start][end] = Integer.MAX_VALUE;
					for (int mid = start; mid < end; mid++) {
						dp[start][end] = Math.min(dp[start][end],dp[start][mid] + dp[mid + 1][end] + sum[end] - sum[start - 1]);
					}
				}
			}

			output[i] = dp[1][K];
		}
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
