import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main2667 {

	private static int IMAGE_COLOR = 1;
	private static int ALREADY_COUNTED = 2;
	static int N;
	static int[][] grid;

	public static int countCells(int x, int y) {
		if (x < 0 || x >= N || y < 0 || y >= N)
			return 0;
		else if (grid[x][y] != IMAGE_COLOR)
			return 0;
		else {
			grid[x][y] = ALREADY_COUNTED;
			return 1 + countCells(x, y + 1) + countCells(x - 1, y) + countCells(x + 1, y) + countCells(x, y - 1);
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		String[] input = new String[N];
		grid = new int[N][N];
		int count = 0;
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			input[i] = br.readLine();
			for (int j = 0; j < input[i].length(); j++) {
				grid[i][j] = Integer.parseInt(input[i].substring(j, j + 1));
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int out = countCells(i, j);
				if (out > 0) {
					count++;
					output.add(out);
				}
			}

		}
		output.sort(null);
		bw.write(Integer.toString(count) + "\n");
		for (int t : output) {
			bw.write(Integer.toString(t) + "\n");
		}

		bw.flush();
		bw.close();

	}

}
