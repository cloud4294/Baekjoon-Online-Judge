import java.util.Scanner;

public class Main11048 {
	
	static int max(int a,int b,int c) {
		int temp = Math.max(a, b);
		return Math.max(temp, c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] map = new int[N+1][M+1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		int[][] dp = new int[N+1][M+1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				dp[i][j] = map[i][j] + max(dp[i-1][j-1], dp[i][j-1],dp[i-1][j]);
			}
		}
		System.out.println(dp[N][M]);
		
	}

}
