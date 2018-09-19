import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main2675 {

	public static void main(String[] args) throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		String[] output = new String[T];
		for (int i = 0; i < T; i++) {
			output[i] = "";
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			String input = st.nextToken();
			for (int j = 0; j < input.length(); j++) {
				for (int j2 = 0; j2 < R; j2++) {
					
					output[i] = output[i].concat(Character.toString(input.charAt(j)));
				}
			}
		}
		for (int i = 0; i < T; i++) {
			bw.write(output[i] +"\n");
			bw.flush();
		}

		bw.close();
	}

}
