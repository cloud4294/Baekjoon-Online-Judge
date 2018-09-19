import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main15781 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		long[] hel = new long[N];
		long[] jok = new long[M];
		long max1 = 0;
		long max2 = 0;
		
		String[] data1 = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			hel[i] = Long.parseLong(data1[i]);
			if(hel[i] > max1) {
				max1 = hel[i];
			}
		}
		
		String[] data2 = br.readLine().split(" ");
		for (int i = 0; i < M; i++) {
			jok[i] = Long.parseLong(data2[i]);
			if(jok[i] > max2) {
				max2 = jok[i];
			}
		}
		
		bw.write(Long.toString(max1+max2));
		bw.flush();
		bw.close();
		
	}

}
