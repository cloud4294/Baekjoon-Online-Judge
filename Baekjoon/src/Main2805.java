import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2805 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		long M = Long.parseLong(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");

		long[] tree = new long[N];
		long max = 0;
		long count = 0;
		
		for (int i = 0; i < N; i++) {
			tree[i] = Long.parseLong(st.nextToken());
			if(tree[i] > max) {
				max = tree[i];
			}
		}
		
		while(count < M) {
			for (int i = 0; i < N; i++) {
				if(tree[i] == max) {
					tree[i]--;
					count++;
				}
			}
			max--;
			
		}
		
		System.out.println(max);

		
		

	}

}
