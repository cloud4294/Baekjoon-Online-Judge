import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main14732 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		boolean[][] data = new boolean[501][501];
		
		for (int i = 0; i <= 500; i++) {
			for (int j = 0; j <= 500; j++) {
				data[i][j] = false;
			}
		}
		
		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			int x1 = Integer.parseInt(input[0]);
			int y1 = Integer.parseInt(input[1]);
			int x2 = Integer.parseInt(input[2]);
			int y2 = Integer.parseInt(input[3]);
			for (int j = x1; j < x2; j++) {
				for (int j2 = y1; j2 < y2; j2++) {
					data[j][j2] = true;
				}
			}
		}
		int count = 0;
		for (int i = 0; i <= 500; i++) {
			for (int j = 0; j <= 500; j++) {
				if(data[i][j] == true)
					count++;
			}
		}
		
		System.out.println(count);
		
		

	}

}
