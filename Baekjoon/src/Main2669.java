import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2669 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[][] map = new boolean[101][101];
		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				map[i][j] = false;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			String[] input = br.readLine().split(" ");
			int x1 = Integer.parseInt(input[0]);
			int y1 = Integer.parseInt(input[1]);
			int x2 = Integer.parseInt(input[2]);
			int y2 = Integer.parseInt(input[3]);
			for (int j = x1; j < x2; j++) {
				for (int j2 = y1; j2 < y2; j2++) {
					map[j][j2] = true;
				}
			}
		}
		
		int count = 0;
		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				if(map[i][j] == true)
					count++;
			}
		}
		
		System.out.println(count);
	}

}
