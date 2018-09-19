import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main12865 {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		int N = Integer.parseInt(input1[0]);
		int K = Integer.parseInt(input1[1]);
		int[][] value = new int[N+1][K+1];
		int[] W = new int[N+1];
		int[] V = new int[N+1];
		
		for (int i = 1; i <= N; i++) {
			String[] input2 = br.readLine().split(" ");
			W[i] = Integer.parseInt(input2[0]);
			V[i] = Integer.parseInt(input2[1]);
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= K; j++) {
				if(W[i] > j) {
					value[i][j] = value[i-1][j];
				}else {
					value[i][j] = Math.max(value[i-1][j], value[i-1][j-W[i]]+V[i]);
				}
			}
		}
		bw.write(Integer.toString(value[N][K]));
		bw.flush();
		bw.close();
	}

}
