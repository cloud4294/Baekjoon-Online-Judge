import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main15552 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int sum = a + b;
			bw.write(sum+"\n");
					
		}
		
		bw.flush();
		
	}

}
