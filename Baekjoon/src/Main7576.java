import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pair_Cost {
	int x, y, cost;
	
	Pair_Cost(int x, int y, int cost) {
		this.x = x;
		this.y = y;
		this.cost = cost;
	}
}

public class Main7576 {
	static int qSize;
	
	static final int[] dx = {0, 0, -1, 1}; 
	static final int[] dy = {-1, 1, 0, 0};
			
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int[][] tomato = new int[n][m];
		boolean[][] visit = new boolean[n][m];
		Queue<Pair_Cost> queue = new LinkedList<Pair_Cost>();
		
		int vacant = 0;
		
		for(int i = 0 ; i < n ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0 ; j < m ; j++) {
				tomato[i][j] = Integer.parseInt(st.nextToken());
				
				if(tomato[i][j] == 1) 
					queue.offer(new Pair_Cost(i, j, 1));
				else if(tomato[i][j] == -1) 
					vacant++;
			}
		}
		
		qSize = queue.size();
		int result = 0;
		
		if(qSize == 0) {
			if(vacant == n * m)
				result = 0;
			else
				result = -1;
		}
		else if(qSize == n * m - vacant)
			result = 0;
		else {
			Main7576 q = new Main7576();
			result = q.bfs(queue, tomato, visit);
		
			if(n * m - vacant - qSize > 0)
				result = -1;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(tomato[i][j] == 0) {
					System.out.println(-1);
					return;
				}
					
			}
			
		}
		
		System.out.println(result);
	}
	
	public int bfs(Queue<Pair_Cost> queue, int[][] tomato, boolean[][] visit) {
		int n = tomato.length;
		int m = tomato[0].length;
		
		int max = 0;
		
		while(!queue.isEmpty()) {
			Pair_Cost p = queue.poll();
			
			tomato[p.x][p.y] = p.cost;
			qSize++;
			
			max = p.cost > max ? p.cost : max;
			
			for(int i = 0 ; i < 4 ; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(tomato[nx][ny] == 0 && !visit[nx][ny]) {
						queue.offer(new Pair_Cost(nx, ny, p.cost + 1));
						visit[nx][ny] = true;
					}
				}
			}
		}
		qSize--;
		
		return max - 1;
	}
}
