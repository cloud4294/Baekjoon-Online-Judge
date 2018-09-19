import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1022 {

	static int findMax(int r1, int c1, int r2, int c2) {
		r1 = Math.abs(r1);
		c1 = Math.abs(c1);
		r2 = Math.abs(r2);
		c2 = Math.abs(c2);

		int max = Math.max(Math.max(r1, r2), Math.max(c1, c2));

		return max;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r1 = Integer.parseInt(st.nextToken());
		int c1 = Integer.parseInt(st.nextToken());
		int r2 = Integer.parseInt(st.nextToken());
		int c2 = Integer.parseInt(st.nextToken());

		int max = findMax(r1, c1, r2, c2);

		int[][] matrix = new int[2 * max + 1][2 * max + 1];

		int sw = 0;
		int count = 1;
		int size = 1;
		int i = 1;
		int j = 1;

		while (true) {
			matrix[max + i][max + j] = count;
			count++;
			if(sw < size) {
				i++;
				sw++;
			}else {
				j++;
				sw++;
			}
		}

	}

}
