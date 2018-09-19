import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15916 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] point = new long[n + 1];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i < n + 1; i++) {
			point[i] = Long.parseLong(st.nextToken());
		}
		long k = Long.parseLong(br.readLine());

		long[] height = new long[n + 1];
		for (int i = 1; i <= n; i++) {
			height[i] = point[i] - (k * i);
		}

		boolean flag = false;
		if (point[1] >= k) {
			for (int i = 1; i <= n; i++) {
				if(height[i] <= 0) {
					flag = true;
					break;
				}
			}
		} else if (point[1] == k) {
			System.out.println("T");
			return;
		} else {
			for (int i = 1; i <= n; i++) {
				if(height[i] >= 0) {
					flag = true;
					break;
				}
			}
		}

		if (flag == false) {
			System.out.println("F");
		} else {
			System.out.println("T");
		}

	}

}
