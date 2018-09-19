import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1347 {

	static int[] mx = { 0, 1, 0, -1 };
	static int[] my = { -1, 0, 1, 0 };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[][] map = new char[100][100];
		String input = br.readLine();
		int dir = 0;
		int currentX = 50;
		int currentY = 50;
		int minX = 50;
		int minY = 50;
		int maxX = 50;
		int maxY = 50;
		map[50][50] = '.';
		for (int i = 0; i < N; i++) {
			char ac = input.charAt(i);
			if (ac == 'R') {
				dir--;
				if (dir == -1)
					dir = 3;
			} else if (ac == 'L') {
				dir++;
				if (dir == 4)
					dir = 0;
			} else if (ac == 'F') {
				currentX += mx[dir];
				if (currentX < minX) {
					minX = currentX;
				} else if (currentX > maxX) {
					maxX = currentX;
				}
				
				currentY += my[dir];
				if (currentY < minY) {
					minY = currentY;
				} else if (currentY > maxY) {
					maxY = currentY;
				}
				map[currentY][currentX] = '.';
			}
		}
		
		for (int i = maxY; i >= minY; i--) {
			for (int j = minX; j <= maxX; j++) {
				if (map[i][j] == '.')
					System.out.print('.');
				else
					System.out.print('#');
			}
			System.out.println();
		}
	}

}
