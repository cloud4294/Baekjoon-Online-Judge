import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main14727 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] hist = new long[N];
		for (int i = 0; i < N; i++) {
			hist[i] = Integer.parseInt(br.readLine());
		}
		long[] left = new long[N];
		long[] right = new long[N];

		long max = 0;
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < N; i++) {
			while (!stack.isEmpty() && hist[stack.peek()] >= hist[i])
				stack.pop();
			if (stack.isEmpty())
				left[i] = 0;
			else
				left[i] = stack.peek() + 1;
			stack.push(i);
			
		}

		while (!stack.isEmpty())
			stack.pop();

		for (int i = N - 1; i >= 0; i--) {
			while (!stack.isEmpty() && hist[stack.peek()] >= hist[i])
				stack.pop();
			if (stack.isEmpty())
				right[i] = N - 1;
			else
				right[i] = stack.peek() - 1;
			stack.push(i);
			
		}

		for (int i = 0; i < N; i++) {
			if ((right[i] - left[i] + 1) * hist[i] > max)
				max = (right[i] - left[i] + 1) * hist[i];
		}
		
		System.out.println(max);

	}

}
