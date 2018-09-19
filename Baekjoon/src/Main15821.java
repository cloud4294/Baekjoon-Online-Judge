import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main15821 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] S = br.readLine().split(" ");
		int N = Integer.parseInt(S[0]);
		int K = Integer.parseInt(S[1]);
		long[] length = new long[N];
		for (int i = 0; i < N; i++) {
			int abs = Integer.parseInt(br.readLine());
			String[] input = br.readLine().split(" ");
			long[] data = new long[input.length];
			for (int j = 0; j < input.length; j++) {
				data[j] = Integer.parseInt(input[j]);
			}
			for (int j = 0; j < 2 * abs; j = j + 2) {
				if ((data[j] * data[j]) + (data[j + 1] * data[j + 1]) > length[i]) {
					length[i] = (data[j] * data[j]) + (data[j + 1] * data[j + 1]);
				}
			}
		}
		ArrayList<Long> sdata = new ArrayList<Long>();
		for (int i = 0; i < length.length; i++) {
			sdata.add(length[i]);
		}
		sdata.sort(null);

		for (int i = 0; i < N - K; i++) {
			sdata.remove(sdata.size()-1);
		}
		bw.write(Long.toString(sdata.get(sdata.size()-1))+".00");
		bw.flush();
		bw.close();
	}

}
