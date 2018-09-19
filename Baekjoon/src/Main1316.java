import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1316 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int output = 0;
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			int[] count = new int[26];
			boolean t = true;
			for (int j = 0; j < input.length(); j++) {
				count[input.charAt(j)-97]++;
				if(count[input.charAt(j)-97] >= 2) {
					if(input.charAt(j) != input.charAt(j-1)) {
						t = false;
					}
				}
			}
			if(t == true) {
				output++;
			}
		}
		bw.write(Integer.toString(output));
		bw.flush();
		bw.close();
	}

}
