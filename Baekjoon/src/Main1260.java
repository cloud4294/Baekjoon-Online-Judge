import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1260 {

	public static int[][] graph = new int[1001][1001];
	public static boolean[] visited = new boolean[10001];

	public static int n;	
	
	public static void DFS(int v) {
		System.out.print(v + " ");
		visited[v] = true;

		for (int i = 1; i <= n; i++) {
			if(graph[v][i] == 1 && visited[i] == false) {
				DFS(i);
			}
		}
	}
	
	public static void BFS(int v) {
		Queue<Integer> queue = new LinkedList<Integer>();
		int out;
		
		queue.offer(v);
		visited[v] = true;
		System.out.print(v + " ");
		while(!queue.isEmpty()) {
			out = queue.poll();
			
			for (int i = 1; i <= n; i++) {
				if(graph[out][i] == 1 && visited[i] == false) {
					queue.offer(i);
					visited[i] = true;
					System.out.print(i + " ");
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();

		for (int i = 1; i <= m; i++) {
			int y = sc.nextInt();
			int x = sc.nextInt();
			graph[x][y] = graph[y][x] = 1;
		}
		
		DFS(v);
		
		for (int i = 1; i <= n; i++) {
			visited[i] = false;
		}
		System.out.println();
		BFS(v);
		
	}

}
