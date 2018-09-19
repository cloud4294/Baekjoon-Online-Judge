import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main2610 {

	public static int[][] map;
	public static int N;

	public static int bfs(int i) {

		Stack<Integer> stack = new Stack<Integer>();

		int count = 0;

		int[] check = new int[N + 1];
		stack.push(i);

		

		while (!stack.isEmpty()) {
			int flag = 0;
			int current = stack.pop();
			check[current] = 1;
			for (int j = 1; j <= N; j++) {
				if (map[current][j] == 1 && check[j] == 0) {
					stack.push(j);
					flag++;
				}
					
			}
			if(flag > 0) {
				count++;
			}
			

		}

		return count;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		map = new int[N + 1][N + 1];
		for (int i = 0; i < M; i++) {
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			map[a][b] = 1;
			map[b][a] = 1;

		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
		for (int i = 1; i <= N; i++) {
			System.out.println(bfs(i));
		}
		
	}

}
