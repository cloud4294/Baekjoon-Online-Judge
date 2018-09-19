import java.util.Scanner;

public class Main2193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long[][] dp = new long[2][N+1];
		for (int i = 0; i < 2; i++) {
			for (int j = 1; j <= N; j++) {
				dp[i][j] = 0;
			}
		}
		
		if(N == 1) {
			System.out.println(1);
			return;
		}
		
		dp[1][1] = 1;
		dp[0][2] = 1;
		for (int i = 2; i <= N; i++) {
			dp[1][i] = dp[0][i-1];
			dp[0][i] = dp[1][i-1] + dp[0][i-1];
		}
		System.out.println(dp[0][N]+dp[1][N]);
	}

}
