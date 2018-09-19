import java.util.ArrayList;
import java.util.Scanner;

public class Main11725 {

	static int num;

	public static void search(int a, int[] output, ArrayList<Integer>[] graph, boolean[] visit) {
		visit[a] = true;
		for (int i = 0; i < graph[a].size(); i++) {
			
			int temp = graph[a].get(i);
				if(visit[temp] == false) {
					output[temp] = a;
					search(temp, output, graph, visit);
				}
			
		}
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		ArrayList<Integer>[] graph = new ArrayList[num + 1];

		int[] output = new int[num + 1];
		boolean[] visit = new boolean[num + 1];
		int a;
		int b;

		for (int i = 0; i <= num; i++) {
			graph[i] = new ArrayList<>();
		}

		for (int i = 0; i < num - 1; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			graph[a].add(b);
			graph[b].add(a);

		}

		search(1, output, graph, visit);
		
		for (int i = 2; i <= num; i++) {
			System.out.println(output[i]);
		}

	}

}
