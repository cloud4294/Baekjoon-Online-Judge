import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main2448 {
	
	
	static void solve(char[][] c, int n, int x, int y) {
		
		
		if (n == 3) {
			c[x][y + 2] = '*';
			c[x + 1][y + 1] = '*';
			c[x + 1][y + 3] = '*';
			for (int i = 0; i < 5; i++) {
				c[x + 2][y + i] = '*';
			}
			return;
		}
		else {
			int div = n / 2;

			solve(c, div, x, y + div);
			solve(c, div, x + div, y);
			solve(c, div, x + div, y + n);
		}
		
		
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] c = new char[n][2 * n - 1];
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		solve(c, n, 0, 0);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * n - 1; j++) {
				if(c[i][j] == '*') {
					bw.write(c[i][j]);
				}else {
					bw.write(' ');
				}
				
			}
			bw.write("\n");
		}
		bw.flush();
	}
}
