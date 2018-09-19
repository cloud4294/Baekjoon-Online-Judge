import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
 * 2018.05.16
 *  dfs를 활용하여 미로탐색을 하였으나 시간초과 발생,dfs를 재귀적으로 호출하는 부분에서 시간이 초과되었을 것같다.
 *  최단거리 문제는 dfs로 풀경우 시간 복잡도가 높아지기 때분에 적합하지 않다. bfs로 푸는 방법을 생각하는것이 좋다.
 *  bfs는 구하였으나 bfs의 깊이를 구하지 못함
 *  Node클래스에 level을 추가하여 깊이를 계산하여 해결했다. 
 */

class Node {
	int x;
	int y;
	int level;
	char data;
	boolean marked;

	Node(int x, int y, char data) {
		this.x = x;
		this.y = y;
		this.data = data;
		this.marked = false;
	}
}

public class Main2178 {

	static int n;
	static int m;
	static int mincount;

	static int[] movex = { 1, -1, 0, 0 };
	static int[] movey = { 0, 0, 1, -1 };

	static void bfs(Node[][] input) {
		Node root = input[0][0];
		root.level = 1;
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		root.marked = true;
		while (!queue.isEmpty()) {
			Node r = queue.poll();
			int count = r.level;
			for (int i = 0; i < 4; i++) {
				if (r.x + movex[i] >= 0 && r.y + movey[i] >= 0 && r.x + movex[i] < n && r.y + movey[i] < m) {
					if (input[r.x + movex[i]][r.y + movey[i]].data == '1') {
						if (input[r.x + movex[i]][r.y + movey[i]].marked == false) {
							input[r.x + movex[i]][r.y + movey[i]].marked = true;
							queue.offer(input[r.x + movex[i]][r.y + movey[i]]);
							input[r.x + movex[i]][r.y + movey[i]].level = count+1;
							
						}
					}
				
				}
				
			}
			
			if (r.x == n - 1 && r.y == m - 1) {
				System.out.println(r.level);
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		mincount = m * n;
		Node[][] input = new Node[n][m];
		for (int i = 0; i < n; i++) {
			String data = sc.next();
			for (int j = 0; j < m; j++) {
				input[i][j] = new Node(i, j, data.charAt(j));
			}
		}
		bfs(input);


	}

}
