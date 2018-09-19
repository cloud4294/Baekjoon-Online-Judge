import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
 * 2018.05.16
 *  dfs�� Ȱ���Ͽ� �̷�Ž���� �Ͽ����� �ð��ʰ� �߻�,dfs�� ��������� ȣ���ϴ� �κп��� �ð��� �ʰ��Ǿ��� �Ͱ���.
 *  �ִܰŸ� ������ dfs�� Ǯ��� �ð� ���⵵�� �������� ���п� �������� �ʴ�. bfs�� Ǫ�� ����� �����ϴ°��� ����.
 *  bfs�� ���Ͽ����� bfs�� ���̸� ������ ����
 *  NodeŬ������ level�� �߰��Ͽ� ���̸� ����Ͽ� �ذ��ߴ�. 
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
