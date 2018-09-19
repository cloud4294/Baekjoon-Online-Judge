import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main15780 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		String[] input = br.readLine().split(" ");
		
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		
		String[] A = br.readLine().split(" ");
		int sum = 0;
		
		for (int i = 0; i < M; i++) {
			int temp = Integer.parseInt(A[i]);
			if(temp % 2 == 0) {
				sum += temp / 2;
			}else {
				sum += temp / 2 + 1;
			}
		}
		if(sum >= N) {
			bw.write("YES");
		}else {
			bw.write("NO");
		}
		
		bw.flush();
		bw.close();
	}

}
