import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15925 {

	static int N;
	static int flag;
	static int[][] map;

	public static int findX() {
		int line = 0;
		for (int i = 0; i < N; i++) {
			int count = 0;
			for (int j = 0; j < N; j++) {
				if(map[i][j] == flag) {
					count++;
				}
			}
			if(count > N / 2) {
				for (int j = 0; j < N; j++) {
					map[i][j] = flag;
				}
				line++;
			}
		}
		return line;
	}

	public static int findY() {
		int line = 0;
		for (int i = 0; i < N; i++) {
			int count = 0;
			for (int j = 0; j < N; j++) {
				if(map[j][i] == flag) {
					count++;
				}
			}
			if(count > N / 2) {
				for (int j = 0; j < N; j++) {
					map[j][i] = flag;
				}
				line++;
			}
		}
		return line;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		flag = Integer.parseInt(st.nextToken());
		map = new int[N][N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int j = 0; j < N; j++) {
			if(findX() > N/2) {
				System.out.println(1);
				return;
			}
			if(findY() > N/2) {
				System.out.println(1);
				return;
			}
			
		}
		
		System.out.println(0);

	}

}
