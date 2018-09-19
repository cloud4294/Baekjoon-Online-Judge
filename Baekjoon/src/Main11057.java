import java.util.Scanner;

public class Main11057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long[][] dp = new long[N][10];
		for (int i = 0; i < 10; i++) {
			dp[0][i] = 1; 
		}
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < 10; j++) {
				if(j == 0) {
					dp[i][j] = 1;
				}else {
					dp[i][j] = dp[i-1][j] + dp[i][j-1];
					dp[i][j] %= 10007;
				}
			}
		}
		long output = 0;
		for (int i = 0; i < 10; i++) {
			output += dp[N-1][i];
	
		}
		System.out.println(output%10007);
		
	}

}
