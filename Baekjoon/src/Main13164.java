import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main13164 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		int N = Integer.parseInt(input1[0]);
		int K = Integer.parseInt(input1[1]);
		String[] input2 = br.readLine().split(" ");
		int[] cost = new int[N];
		for (int i = 0; i < N; i++) {
			cost[i] = Integer.parseInt(input2[i]);
		}
		ArrayList<Integer> diff = new ArrayList<Integer>();
		for (int i = 0; i < N-1; i++) {
			diff.add(cost[i+1] - cost[i]);
		}
		diff.sort(null);
		int answer = 0;
		for (int i = 0; i < N-K; i++) {
			answer += diff.get(i);
		}
		
		bw.write(Integer.toString(answer));
		bw.flush();
		bw.close();
	
	}

}
