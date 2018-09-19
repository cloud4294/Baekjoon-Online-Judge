import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2441 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(j >= i) {
					bw.write("*");
				}else {
					bw.write(" ");
				}

			}
			bw.write("\n");
		}
		
		
		bw.flush();
		bw.close();
	}

}
