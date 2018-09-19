import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class virus{
	int data;
	boolean checked;
	LinkedList<virus> adj;
	virus(int data){
		this.data = data;
		this.adj = new LinkedList<virus>();
		this.checked = false;
	}
	
}



public class Main2606 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int line = sc.nextInt();
		virus[] map = new virus[N+1];
		for (int i = 1; i <= N; i++) {
			map[i] = new virus(i);
		}
		for (int i = 0; i < line; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			
			if(!map[a].adj.contains(map[b])) {
				map[a].adj.add(map[b]);
			}
			if(!map[b].adj.contains(map[a])) {
				map[b].adj.add(map[a]);
			}
			
		}
		int count = 0;
		Queue<virus> queue = new LinkedList<virus>();
		queue.offer(map[1]);
		map[1].checked = true;
	
		while(!queue.isEmpty()) {
			virus node = queue.poll();
			for(virus v:node.adj) {
				if(v.checked == false) {
					queue.offer(v);
					v.checked = true;
					count++;
				}
			}
		}
		
		System.out.println(count);
		
	}

}
