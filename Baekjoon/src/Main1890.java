import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main1890 {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			int[][] map = new int[N][N];
			long[][] dp = new long[N][N];
			
			for (int i = 0; i < N; i++) {
				String[] input = br.readLine().split(" ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(input[j]); 					
				}
			}
			dp[0][0] = 1;
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int add = map[i][j];
					if(add != 0) {
						if(add + i < N)
							dp[i+add][j] += dp[i][j];
						if(add + j < N)
							dp[i][j+add] += dp[i][j];
					}
					
				}
			}
			System.out.println(dp[N-1][N-1]);
			
	}

}
