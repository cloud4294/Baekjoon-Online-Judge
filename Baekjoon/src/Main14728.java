import java.util.Scanner;

public class Main14728 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int[] K = new int[N + 1];
		int[] S = new int[N + 1];
		int[][] dp = new int[N + 1][T + 1];
		for (int i = 1; i <= N; i++) {
			K[i] = sc.nextInt();
			S[i] = sc.nextInt();
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= T; j++) {
				if (K[i] > j) {
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - K[i]] + S[i]);
				}
			}
		}
		System.out.println(dp[N][T]);

	}

}
