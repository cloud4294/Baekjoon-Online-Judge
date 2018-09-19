import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 2018년 5월 18일 
 * 	bfs를 활용하여 풀었음,하지만 예외경우가 발생하여 실패
 * 	queue에서 뺄때마다 침수구역을 늘려 에러가 발생함.
 * 	queue에서 빼내는 node의 level이 증가하면 침수구역을 늘리는 방법으로  해결
 * 
 */

class point2 {
	int pointx;
	int pointy;
	int level;
	boolean marked;
	char data;

	point2(int pointx, int pointy, char data) {
		this.pointx = pointx;
		this.pointy = pointy;
		this.data = data;
		this.marked = false;
		this.level = 0;
	}
}

public class Main3055 {

	static int R;
	static int C;
	static point2[][] map;
	static Queue<point2> water = new LinkedList<point2>();
	static int[] dirx = { 1, -1, 0, 0 };
	static int[] diry = { 0, 0, 1, -1 };

	static int bfs(point2 p) {

		Queue<point2> queue = new LinkedList<point2>();
		queue.add(p);
		p.marked = true;
		Queue<point2> temp = new LinkedList<point2>();
		int lv = -1;

		while (!queue.isEmpty()) {

			point2 node = queue.poll();
			if (node.level > lv) {
				for (point2 w : water) {
					for (int j = 0; j < 4; j++) {
						if (w.pointx + dirx[j] >= 0 && w.pointx + dirx[j] < R && w.pointy + diry[j] >= 0
								&& w.pointy + diry[j] < C) {
							point2 k = map[w.pointx + dirx[j]][w.pointy + diry[j]];
							if (k.data == '.') {
								k.data = '*';
								temp.add(k);

							}

						}

					}
				}
				water.clear();
				while (!temp.isEmpty()) {
					water.add(temp.poll());
				}
			}

			for (int i = 0; i < 4; i++) {
				if (node.pointx + dirx[i] >= 0 && node.pointx + dirx[i] < R && node.pointy + diry[i] >= 0
						&& node.pointy + diry[i] < C) {
					point2 current = map[node.pointx + dirx[i]][node.pointy + diry[i]];
					if (current.marked == false) {
						if (current.data == '.') {
							queue.add(current);
							current.level = node.level + 1;

						} else if (current.data == 'D') {
							current.level = node.level + 1;

							return current.level;
						}
						current.marked = true;
					}

				}
			}
			lv = node.level;

		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		R = sc.nextInt();
		C = sc.nextInt();
		map = new point2[R + 1][C + 1];
		int pointx = 0;
		int pointy = 0;

		for (int i = 0; i < R; i++) {
			String input = sc.next();
			for (int j = 0; j < C; j++) {
				map[i][j] = new point2(i, j, input.charAt(j));
				if (map[i][j].data == 'S') {
					pointx = i;
					pointy = j;
				}
				if (map[i][j].data == '*') {
					water.add(map[i][j]);
				}
			}

		}
		int output = bfs(map[pointx][pointy]);
		if (output == 0) {
			System.out.println("KAKTUS");
		} else {
			System.out.println(output);
		}

	}

}
