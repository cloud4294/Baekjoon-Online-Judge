import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class hacking {
	int num;
	boolean checked;
	LinkedList<hacking> adj;

	hacking(int num) {
		this.num = num;
		this.checked = false;
		this.adj = new LinkedList<hacking>();
	}

}

public class Main1325 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		hacking[] data = new hacking[N + 1];
		for (int i = 1; i <= N; i++) {
			data[i] = new hacking(i);
		}
		int M = Integer.parseInt(st.nextToken());
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int dest = Integer.parseInt(st.nextToken());
			int source = Integer.parseInt(st.nextToken());
			data[source].adj.add(data[dest]);
		}

		Queue<Integer> output = new LinkedList<Integer>();
		Queue<hacking> queue = new LinkedList<hacking>();
		

		for (int i = 1; i <= N; i++) {
			if(data[i].checked == false) {
				queue.offer(data[i]);
				while (!queue.isEmpty()) {
					hacking current = queue.poll();					
					for (hacking hc : current.adj) {
						hc.checked = true;
						queue.offer(hc);

					}
				}
			}
		}
		for (int i = 1; i <= N; i++) {
			if(data[i].checked == false) {
				output.offer(i);
			}
		}

		while (!output.isEmpty()) {
			bw.write(output.poll() + " ");
		}
		bw.flush();
		bw.close();
	}

}
