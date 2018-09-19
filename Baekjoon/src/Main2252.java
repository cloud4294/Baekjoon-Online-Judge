import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2252 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] order = new int[N];
		
		for (int i = 0; i < M; i++) {
		
			st = new StringTokenizer(br.readLine(), " ");
			int front = Integer.parseInt(st.nextToken());
			int back = Integer.parseInt(st.nextToken());
			
			
		}
	}

}
