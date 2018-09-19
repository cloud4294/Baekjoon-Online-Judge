import java.util.Scanner;



public class Main1309 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long[] dp = new long[n + 1];
		dp[0] = 1;
		dp[1] = 3;
		for (int i = 2; i < dp.length; i++) {
			dp[i] = dp[i - 2] + dp[i - 1] * 2;
			dp[i] = dp[i] % 9901;

		}
		System.out.println(dp[n]);
	}

}
