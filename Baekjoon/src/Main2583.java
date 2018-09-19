import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main2583 {

	
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static boolean[][] map;
	static int M;
	static int N;

	public static int search(int y, int x) {
		int count = 1;
		map[y][x] = true;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx < 0 || nx >= N || ny < 0 || ny >= M)
				continue;
			if(map[ny][nx] == false) {
				count += search(ny,nx);
			}
		}

		return count;
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		ArrayList<Integer> output = new ArrayList<Integer>();

		map = new boolean[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = false;
			}
		}

		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			for (int j = y1; j < y2; j++) {
				for (int j2 = x1; j2 < x2; j2++) {
					map[j][j2] = true;
				}
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if(map[i][j] == false) {
					int count = search(i, j);
					output.add(count);
				}
			}

		}

		Collections.sort(output);

		System.out.println(output.size());
		for (int j = 0; j < output.size(); j++) {
			System.out.print(output.get(j) + " ");
		}
		System.out.println();
		
	}

}
