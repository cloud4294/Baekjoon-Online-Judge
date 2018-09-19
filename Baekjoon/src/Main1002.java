import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1002 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int[] output = new int[T];
		for (int i = 0; i < T; i++) {
			String[] input = br.readLine().split(" ");
			int x1 = Integer.parseInt(input[0]);
			int y1 = Integer.parseInt(input[1]);
			int r1 = Integer.parseInt(input[2]);
			int x2 = Integer.parseInt(input[3]);
			int y2 = Integer.parseInt(input[4]);
			int r2 = Integer.parseInt(input[5]);
			double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

			int maxR = Math.max(r1, r2);
			int minR = Math.min(r1, r2);
			if (length > maxR) {
				if (length > r1 + r2) {
					output[i] = 0;
				} else if (length < r1 + r2) {
					output[i] = 2;
				} else if (length == r1 + r2) {
					output[i] = 1;
				}
			} else {
				if (x1 == x2 && y1 == y2 && r1 == r2) {
					output[i] = -1;
				}
				else if (length + minR > maxR) {
					output[i] = 2;
				} else if (length + minR == maxR) {
					output[i] = 1;
				} else if (length + minR < maxR) {
					output[i] = 0;
				}
			}
		}
		for (int i = 0; i < output.length; i++) {
			bw.write(Integer.toString(output[i])+"\n");
		}
		bw.flush();
		bw.close();
	}
}
