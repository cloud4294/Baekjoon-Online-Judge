import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15921 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] data = new int[101];
		if (N == 0) {
			System.out.println("divide by zero");
			return;
		}
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int sum = 0;
		for (int i = 0; i < N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			data[temp]++;
			sum += temp;
		}

		double avg = (double)sum / N;

		double exp = 0;

		for (int i = 0; i < 101; i++) {
			if (data[i] > 0) {
				exp += (double)(data[i] * i) / N;
			}
		}

		System.out.printf("%.2f\n", (double)avg / exp);

	}

}
