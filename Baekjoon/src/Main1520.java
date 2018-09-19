import java.util.Scanner;

public class Main1520 {
	static int row;
	static int col;

	static int[] pY = { -1, 1, 0, 0 };
	static int[] pX = { 0, 0, -1, 1 };

	static int[][] map;
	static int[][] output;

	static int dp(int y, int x) {
		if (y == 1 && x == 1)
			return 1;

		if (output[y][x] != -1)
			return output[y][x];
		output[y][x] = 0;

		for (int i = 0; i < 4; ++i) {
			int prevY = y + pY[i];
			int prevX = x + pX[i];

			if (1 > prevY || prevY > row || 1 > prevX || prevX > col)
				continue;

			if (map[prevY][prevX] <= map[y][x])
				continue;

			output[y][x] += dp(prevY, prevX);
		}

		return output[y][x];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		col = sc.nextInt();

		map = new int[row+1][col+1];
		output = new int[row+1][col+1];
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				map[i][j] = sc.nextInt();
				output[i][j] = -1;
			}
		}
		int out = dp(row,col);
		System.out.println(out);

	}

}
