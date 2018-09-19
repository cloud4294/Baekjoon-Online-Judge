import java.util.Scanner;
/*
 * 2018년 5월 18일
 * 	갯수를 나열하여 패턴발견 발견한 패턴으로 dynamic programming
 * 
 */
public class Main9095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int test_case = 0; test_case < T; test_case++) {
			int n = sc.nextInt();
			int[] dp = new int[n+1];
			if(n==1) {
				System.out.println(1);
				continue;
			}else if(n==2) {
				System.out.println(2);
				continue;
			}else if(n==3) {
				System.out.println(4);
				continue;
			}
			dp[1] = 1;
			dp[2] = 2;
			dp[3] = 4;
			for (int i = 4; i <= n; i++) {
				dp[i] = dp[i-1] + dp[i-2] + dp[i-3]; 
			}
			System.out.println(dp[n]);
		}
		
	}

}
