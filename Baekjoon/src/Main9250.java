import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main9250 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String[] output = new String[N];
		String[] S = new String[N];
		for (int i = 0; i < N; i++) {
			S[i] = br.readLine();
		}
		int Q = Integer.parseInt(br.readLine());
		String[] ans = new String[Q];
		for (int i = 0; i < Q; i++) {
			ans[i] = br.readLine();
			for (int j = 0; j < N; j++) {
				if (ans[i].contains(S[j])) {
					output[i] = "YES";
				}
			}
			if (output[i] != "YES")
				output[i] = "NO";
		}

		for (int i = 0; i < output.length; i++) {
			bw.write(output[i] + "\n");
		}
		bw.flush();
		bw.close();
	}

}
