import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class tomato {
	int x;
	int y;
	int z;
	int data;
	boolean checked;

	tomato(int x, int y, int z, int data) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.data = data;
		this.checked = false;
	}
}

public class Main7569 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input1 = br.readLine().split(" ");
		int M = Integer.parseInt(input1[0]);
		int N = Integer.parseInt(input1[1]);
		int H = Integer.parseInt(input1[2]);
		tomato[][][] tomato = new tomato[M][N][H];

		Queue<tomato> queue = new LinkedList<tomato>();
		int max = 0;

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				String[] input2 = br.readLine().split(" ");
				for (int k = 0; k < M; k++) {
					tomato[k][j][i] = new tomato(k, j, i, Integer.parseInt(input2[k]));
					if (tomato[k][j][i].data == 1) {
						queue.offer(tomato[k][j][i]);
					}
				}
			}
		}

		while (!queue.isEmpty()) {
			tomato current = queue.poll();
			current.checked = true;
			if (current.x + 1 < M && tomato[current.x + 1][current.y][current.z].data == 0) {
				tomato[current.x + 1][current.y][current.z].data = current.data +1;
				queue.offer(tomato[current.x + 1][current.y][current.z]);
			}
			if (current.x - 1 >= 0 && tomato[current.x - 1][current.y][current.z].data == 0) {
				tomato[current.x - 1][current.y][current.z].data = current.data +1;
				queue.offer(tomato[current.x - 1][current.y][current.z]);
			}
			if (current.y + 1 < N && tomato[current.x][current.y + 1][current.z].data == 0) {
				tomato[current.x][current.y + 1][current.z].data = current.data +1;
				queue.offer(tomato[current.x][current.y + 1][current.z]);
			}
			if (current.y - 1 >= 0 && tomato[current.x][current.y - 1][current.z].data == 0) {
				tomato[current.x][current.y - 1][current.z].data = current.data +1;
				queue.offer(tomato[current.x][current.y - 1][current.z]);
			}
			if (current.z + 1 < H && tomato[current.x][current.y][current.z + 1].data == 0) {
				tomato[current.x][current.y][current.z + 1].data = current.data +1;
				queue.offer(tomato[current.x][current.y][current.z + 1]);
			}
			if (current.z - 1 >= 0 && tomato[current.x][current.y][current.z - 1].data == 0) {
				tomato[current.x][current.y][current.z - 1].data = current.data +1;
				queue.offer(tomato[current.x][current.y][current.z - 1]);
			}
		}
		
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {			
					if (tomato[k][j][i].data == 0 && tomato[k][j][i].checked == false) {
						System.out.println(-1);
						return;
					}else if(tomato[k][j][i].data > max) {
						max = tomato[k][j][i].data;
					}
				}
			}
		}
		
		System.out.println(max-1);
	}

}
