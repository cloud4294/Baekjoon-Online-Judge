import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class cycle {
	int source;
	int dest;
	boolean checked;

	cycle(int source, int dest) {
		this.source = source;
		this.dest = dest;
		this.checked = false;
	}
}

public class Main10451 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] output = new int[T];
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			int count = 0;
			cycle[] input = new cycle[N+1];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 1; j <= N; j++) {
				input[j] = new cycle(j, Integer.parseInt(st.nextToken()));
			}
			Queue<cycle> queue = new LinkedList<cycle>();
			for (int j = 1; j <= N; j++) {
				if(input[j].checked == false) {
					queue.offer(input[j]);
					while (!queue.isEmpty()) {
						cycle current = queue.poll();
						if (current.checked == false) {
							current.checked = true;
							queue.offer(input[current.dest]);
						}else {
							count++;
						}
					}
				}
				
			}
			output[i] = count;

		}
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
