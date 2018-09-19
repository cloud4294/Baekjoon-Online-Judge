import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15996 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int A = Integer.parseInt(st.nextToken());
		int K = 0;

		for (int i = A; i <= N; i += A) {

			int current = i;
			while (current != 0) {
				K++;
				current /= A;
				if (current % A == 0)
					continue;
				else
					break;
			}

		}
		System.out.println(Integer.MAX_VALUE);
		System.out.println(K);

	}
}
