import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main9375 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int[] result = new int[T];
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			List<String> wearcount = new ArrayList<String>();
			for (int j = 0; j < N; j++) {
				String[] wear = br.readLine().split(" ");
				wearcount.add(wear[1]);
			}
			Collections.sort(wearcount);

			int count = 1;
			int output = 1;
			for (int j = 0; j < wearcount.size(); j++) {
				if (j != wearcount.size() - 1) {
					if (wearcount.get(j).equals(wearcount.get(j + 1))) {
						count++;
					} else {
						output *= count + 1;
						count = 1;
					}
				} else {

					output *= count + 1;

				}
			}

			result[i] = output - 1;
		}

		for (int i = 0; i < result.length; i++) {
			bw.write(Integer.toString(result[i]) + "\n");
			bw.flush();
		}
		bw.close();
	}

}
