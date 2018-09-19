import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15924 {

	static int mod = 1000000009;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char[][] map = new char[N][M];
		long[][] dp = new long[N][M];

		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = input.charAt(j);
			}
		}
		long count = 0;
		for (int i = N - 1; i >= 0; i--) {
			for (int j = M - 1; j >= 0; j--) {
				if (map[i][j] == 'S') {
					if (i + 1 < N)
						dp[i][j] += dp[i + 1][j] % mod;
				} else if (map[i][j] == 'E') {
					if (j + 1 < M)
						dp[i][j] += dp[i][j + 1] % mod;
				} else if (map[i][j] == 'B') {
					if (i + 1 < N)
						dp[i][j] += dp[i + 1][j] % mod;
					if (j + 1 < M)
						dp[i][j] += dp[i][j + 1] % mod;
				} else if (map[i][j] == 'X')
					dp[i][j] = 1 % mod;
				
				count += dp[i][j] % mod;
				count %= mod;
			}
		}
		

		System.out.println(count % mod);
	}

}
