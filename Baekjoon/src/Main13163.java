import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main13163 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String[] output = new String[N];
		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			output[i] = "";
			output[i] += "god";
			for (int j = 1; j < input.length; j++) {
				output[i] += input[j];
			}
		}
		
		for (int i = 0; i < output.length; i++) {
			bw.write(output[i]+"\n");
		}
		bw.flush();
		bw.close();
	}

}
