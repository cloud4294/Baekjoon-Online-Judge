import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1004 {

	public static long cal(int a, int b, int c, int d) {
		long result = ((a - c) * (a - c) + (b - d) * (b - d));

		return result;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int[] output = new int[T];
		for (int i = 0; i < T; i++) {
			String[] target = br.readLine().split(" ");
			int x1 = Integer.parseInt(target[0]);
			int y1 = Integer.parseInt(target[1]);
			int x2 = Integer.parseInt(target[2]);
			int y2 = Integer.parseInt(target[3]);
			int N = Integer.parseInt(br.readLine());
			int count = 0;
			for (int j = 0; j < N; j++) {
				String[] area = br.readLine().split(" ");
				int cx = Integer.parseInt(area[0]);
				int cy = Integer.parseInt(area[1]);
				int cr = Integer.parseInt(area[2]);
				long length1 = cal(x1, y1, cx, cy);
				long length2 = cal(x2, y2, cx, cy);
				long length3 = cr * cr;
				if (length1 <= length3 && length2 > length3) {
					count++;
				} else if (length1 > length3 && length2 <= length3) {
					count++;
				}
			}
			output[i] = count;
		}
		for (int i = 0; i < T; i++) {
			bw.write(Integer.toString(output[i]) + "\n");
		}
		bw.flush();
		bw.close();
	}

}
