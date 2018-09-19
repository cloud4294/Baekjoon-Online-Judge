import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1929 {

	public static void solve(int m,int n) {
		boolean[] prime = new boolean[n+1];
		for (int j = m; j <= n; j++) {
			prime[j] = true;
		}
		
		for (int j = 2; j <= n; j++) {
			for (int j2 = j*2; j2 <= n; j2 = j2 + j) {
				prime[j2] = false;
			}
		}
		
		prime[1] = false;
		
		for (int j = m; j <= n; j++) {
			if(prime[j] == true) {
				System.out.println(j);
			}
				
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int M = Integer.parseInt(input[0]);
		int N = Integer.parseInt(input[1]);
		solve(M,N);
		
	}

}
