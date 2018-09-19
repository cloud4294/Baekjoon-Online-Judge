import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main1005 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int[] output = new int[T];
		for (int i = 0; i < T; i++) {

			String[] input1 = br.readLine().split(" ");
			String[] input2 = br.readLine().split(" ");

			int N = Integer.parseInt(input1[0]);
			int K = Integer.parseInt(input1[1]);

			int[] cost = new int[N + 1];
			int[] sum = new int[N + 1];
			boolean[] checked = new boolean[N + 1];
			LinkedList<Integer>[] link = new LinkedList[K + 1];
			LinkedList<Integer>[] pred = new LinkedList[K + 1];

			for (int j = 0; j < N; j++) {
				cost[j + 1] = Integer.parseInt(input2[j]);
				link[j + 1] = new LinkedList<Integer>();
				pred[j + 1] = new LinkedList<Integer>();
				checked[j + 1] = false;
			}
			for (int j = 0; j < K; j++) {
				String[] input3 = br.readLine().split(" ");
				int start = Integer.parseInt(input3[0]);
				int end = Integer.parseInt(input3[1]);
				link[start].add(end);
				pred[end].add(start);
			
			}

			int W = Integer.parseInt(br.readLine());

			Queue<Integer> queue = new LinkedList<Integer>();

			for (int j = 1; j <= N; j++) {
				if (pred[j].isEmpty())
					queue.offer(j);
			}

			while (!queue.isEmpty()) {
				int current = queue.poll();
				checked[current] = true;
				int max = 0;

				if (!pred[current].isEmpty()) {
					for (int k : pred[current]) {
						max = Math.max(max, sum[k] + cost[current]);
					}

					sum[current] = max;
				} else {
					sum[current] = cost[current];
				}

				for (int k : link[current]) {
					if(checked[k] == false)
						queue.offer(k);
				}

			}

			output[i] = sum[W];

		}
		
		for (int j = 0; j < output.length; j++) {
			System.out.println(output[j]);
		}

	}

}
